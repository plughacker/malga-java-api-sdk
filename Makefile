openapi-generator-version:=6.4.0
openapi-generator-url:=https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/$(openapi-generator-version)/openapi-generator-cli-$(openapi-generator-version).jar
openapi-generator-jar:=target/openapi-generator-cli.jar
openapi-generator-cli:=java -jar $(openapi-generator-jar)

generator:=java
library:=okhttp-gson
output:=target/out
modelGen:=clienttoken charges cards customers sessions
models:=src/main/java/io/malga/model

# Generate models (for each service)
models: $(modelGen)

clienttoken: spec=auth-v1
charges: spec=charges-v1
cards: spec=cards-v1
customers: spec=customers-v1
sessions: spec=sessions-v1

bigServices:=clienttoken charges cards customers sessions

services: $(bigServices)

$(modelGen): target/spec $(openapi-generator-jar)
	rm -rf $(models)/$@ $(output)
	$(openapi-generator-cli) generate \
		-i target/spec/openapi/resources/$(spec).yaml \
		-g $(generator) \
		-o $(output) \
		-t templates \
		--reserved-words-mappings configuration=configuration \
		--ignore-file-override ./.openapi-generator-ignore \
		--skip-validate-spec \
		--library $(library) \
		--model-package $(subst /,.,io.malga.model.$@) \
		--api-name-suffix Api \
		--global-property modelDocs=false \
		--global-property modelTests=false \
		--additional-properties=disallowAdditionalPropertiesIfNotPresent=false \
		--additional-properties=dateLibrary=java8 \
		--additional-properties=serializationLibrary=gson \
		--additional-properties=openApiNullable=false \
		--openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
		--openapi-normalizer SIMPLIFY_ANYOF_STRING_AND_ENUM_STRING=true \
		--openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
		--openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true
	mv $(output)/$(models)/$@ $(models)/$@
	mv $(output)/$(models)/JSON.java $(models)/$@

$(bigServices): target/spec $(openapi-generator-jar)
	rm -rf $(models)/$@ $(output)
	rm -rf src/main/java/io/malga/service/$@ $(output)
	$(openapi-generator-cli) generate \
		-i target/spec/openapi/resources/$(spec).yaml \
		-g $(generator) \
		-o $(output) \
		-t templates \
		--reserved-words-mappings configuration=configuration \
		--ignore-file-override ./.openapi-generator-ignore \
		--skip-validate-spec \
		--model-package $(subst /,.,io.malga.model.$@) \
		--library $(library) \
		--api-package io.malga.service.$@ \
		--api-name-suffix Api \
		--global-property modelDocs=false \
		--global-property modelTests=false \
		--additional-properties=openApiNullable=false \
		--additional-properties=disallowAdditionalPropertiesIfNotPresent=false \
		--additional-properties=dateLibrary=java8 \
		--additional-properties=serializationLibrary=gson \
		--additional-properties=openApiNullable=false \
		--openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
		--openapi-normalizer SIMPLIFY_ANYOF_STRING_AND_ENUM_STRING=true \
		--openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
		--openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true
	mv $(output)/$(models)/$@ $(models)/$@
	mv $(output)/src/main/java/io/malga/service/JSON.java $(models)/$@
	mv $(output)/src/main/java/io/malga/service/$@ src/main/java/io/malga/service/$@

$(openapi-generator-jar):
	wget --quiet -o /dev/null $(openapi-generator-url) -O $(openapi-generator-jar)

clean:
	rm -rf $(output)
	rm -rf target/spec
	rm -rf target/templates
	rm -f target/openapi-generator-cli.jar

target/spec: $(openapi-generator-jar)
	git clone https://github.com/plughacker/malga-openapi.git target/spec

# Extract templates
templates: $(openapi-generator-jar)
	$(openapi-generator-cli) author template -g $(generator) --library $(library) -o target/templates

.PHONY: models $(services)
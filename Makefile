openapi-generator-version:=6.4.0
openapi-generator-url:=https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/$(openapi-generator-version)/openapi-generator-cli-$(openapi-generator-version).jar
openapi-generator-jar:=target/openapi-generator-cli.jar
openapi-generator-cli:=java -jar $(openapi-generator-jar)

generator:=java
library:=okhttp-gson
src_dir:=src/main/java/com/malga/client
output:=target/out
spec:=malga-api

models: target/spec $(openapi-generator-jar)
	rm -rf $(src_dir) $(output)
	mkdir -p $(output)
	$(openapi-generator-cli) generate \
    		-i target/spec/json/$(spec).json \
    		-g $(generator) \
    		-o $(output) \
    		--reserved-words-mappings configuration=configuration \
    		--ignore-file-override ./.openapi-generator-ignore \
    		--skip-validate-spec \
    		--library $(library) \
    		--model-package $(subst /,.,com.malga.client.api.model) \
    		--api-package com.malga.client.api \
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
	mkdir -p $(src_dir)
	mv $(output)/$(src_dir)/* $(src_dir)/

$(openapi-generator-jar):
	wget --quiet -o /dev/null $(openapi-generator-url) -O $(openapi-generator-jar)
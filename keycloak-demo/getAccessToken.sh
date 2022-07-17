#!/bin/bash

HOST="http://localhost:8180"
REALM="springbootapp"

curl --location --request POST "$HOST/auth/realms/$REALM/protocol/openid-connect/token" \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=client_credentials' \
--data-urlencode 'client_id=microservice-client' \
--data-urlencode 'client_secret=9Yyq8DilKmhZmFeVc4NXi5CLgkWfYImJ' \
--data-urlencode 'scopes=code' | jq -r '.access_token' >> token.txt
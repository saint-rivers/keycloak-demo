#!/bin/bash

/bin/bash ./keycloak-demo/getAccessToken.sh
TOKEN=`cat ./keycloak-demo/token.txt`

curl localhost:8080/public

curl http://localhost:8080/private \
  -H "Authorization: Bearer $TOKEN"
#!/bin/bash
cd db || exit
docker-compose -f docker-compose-postgres.yml up -d

# Docker for Developers

Example code for "Docker for Developers" talk.

This application has three parts, Postgres, a Java backend app, and a Vue.js frontend.

## Prerequisites

* Docker
* Java 8+

## Build

1. Build the Java backend:

```sh
cd server
./mvnw package
```

2. Start application:

```sh
cd .. # you should be in this directory
docker-compose up
```

## Demo script

```txt
docker ps
docker container list

docker run alpine echo "hello"
docker run -it alpine /bin/sh

# inside the container run:
uname -a
hostname

# shell into the running container
docker exec -it <name> /bin/sh

docker images
docker image list

docker image rm
docker rmi
```
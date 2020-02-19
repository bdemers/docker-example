FROM amazoncorretto:11.0.6

COPY target/stormtroopers-*.jar  /app/stormtroopers.jar
COPY src/docker/classes.txt /app/

WORKDIR /app

RUN java \
    -Xshare:dump \
    -XX:SharedClassListFile=classes.txt \
    -XX:SharedArchiveFile=shared-archive.jsa \
    --class-path stormtroopers.jar

EXPOSE 8080/tcp

HEALTHCHECK --interval=5m --timeout=2s \
  CMD curl -f http://localhost:8080/ || exit 1

CMD ["java", "-Xshare:on", "-XX:SharedArchiveFile=shared-archive.jsa", "-jar", "stormtroopers.jar"]

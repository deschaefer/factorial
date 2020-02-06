# this is a large image to work from but good for debugging.
FROM openjdk:jdk-buster
COPY ./target/factorial-0.0.1-SNAPSHOT.jar factorial.jar
CMD ["java", "-jar", "factorial.jar"]

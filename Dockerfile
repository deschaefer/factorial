FROM amazoncorretto:11.0.6
COPY target/factorial-0.0.1-SNAPSHOT.jar factorial.jar
CMD ["java", "-jar", "factorial.jar"]
FROM openjdk:11-jdk-stretch
ADD /target/producer-0.0.1-SNAPSHOT.jar /src/app/producer-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "producer-0.0.1-SNAPSHOT.jar"]
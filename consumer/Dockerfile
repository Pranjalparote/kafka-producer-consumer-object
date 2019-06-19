FROM openjdk:11-jdk-stretch
ADD /target/consumer-0.0.1-SNAPSHOT.jar /src/app/consumer-0.0.1-SNAPSHOT.jar
WORKDIR /src/app/
ENTRYPOINT ["java", "-jar", "consumer-0.0.1-SNAPSHOT.jar"]
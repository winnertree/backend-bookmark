FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/bookmark-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} bookmark-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bookmark-springboot.jar"]
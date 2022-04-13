FROM openjdk:8
COPY ./target/SPE_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPE_Calculator-1.0-SNAPSHOT.jar", "Main"]

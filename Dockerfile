FROM java:8
WORKDIR /tstorage
COPY target/storage-server-0.0.1-SNAPSHOT.jar /tstorage/tstorage.jar
EXPOSE 8182
ENTRYPOINT ["java","-Xms200m","-Xmx300m","-jar","/tstorage/tstorage.jar"]

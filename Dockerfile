FROM openjdk:8
VOLUME /tmp
ADD ./target/servicioCuentaCorrienteE-0.0.1-SNAPSHOT.jar servicioCuentaCorrienteE.jar
ENTRYPOINT ["java","-jar","/servicioCuentaCorrienteE.jar"]
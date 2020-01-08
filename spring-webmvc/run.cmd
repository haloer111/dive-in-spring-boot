@echo on

cd /d D:\gexiao\github\dive-in-spring-boot\spring-webmvc

call mvn clean package -Dmaven.test.skip=true

::java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar target/spring-webmvc-0.0.1-SNAPSHOT-war-exec.jar



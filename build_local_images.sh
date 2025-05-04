mvn -f ./basketball-source/pom.xml compile jib:dockerBuild
mvn -f ./basketball-webapi/pom.xml compile jib:dockerBuild

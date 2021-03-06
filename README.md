JSF CRUD Project
================

The JSF CRUD Project delivers a JSF component, based on PrimeFaces, to perform simple CRUD operations on JPA entities.
The component has been tested on the following application servers:
* JBoss EAP 6.4.22
* WildFly 19.0.0
* Payara 5.201

The component has been tested with PrimeFaces versions:
* 7.0.12
* 7.0

# Usage

Include the JAR `jsf-crud-lib` within your WAR.

Within a JSF page you can now add the following:
```
xmlns:crud="urn:be:e-contract:crud:jsf"
...
<crud:crud entity="the.full.class.name.of.YourEntity"/>
```

# Demo

Start a WildFly via:
```
cd wildfly-19.0.0.Final/bin/
./standalone.sh --server-config=standalone-full.xml
```

Build the project via Maven:
```
cd jsf-crud
mvn clean install
```

Deploy the demo web application to the local running WildFly via:
```
cd jsf-crud-demo
mvn wildfly:deploy
```

Navigate your web browser to:
http://localhost:8080/jsf-crud-demo/
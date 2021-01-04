# Quarkus Spring Extension

Issues References:
-----------------------------
[Fix spring-data-jpa field lookup with layered @MappedSuperclasses](https://issues.redhat.com/browse/QUARKUS-532)
[Make embedded fields with camel-case work in Spring Data JPA repositories](https://issues.redhat.com/browse/QUARKUS-525)
[Spring's @Scope#scopeName is now taken into account](https://issues.redhat.com/browse/QUARKUS-547)

### Fix spring-data-jpa field lookup with layered @MappedSuperclasses

We have added a "super" structure over the existing Cat entity. 
So currently,  Cats extends Mammal and mammal are animals.

### Make embedded fields with camel-case work in Spring Data JPA repositories

We've created a query over an embedded camelCase field.

### Spring's @Scope#scopeName is now taken into account

We've created an HTTP Request filter in order to add headers to the response:

- x-session: Keep the same value per HTTP session
- x-count: count the number of requests
- x-request: increase his value per HTTP request
- x-instance: represents the instance ID. Must be a unique per pod/instance. 
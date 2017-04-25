# Spring Boot Jersey

A simple Spring Boot and JAX - RS (Jersey) Application

In this post we’ll see how to integrate spring-boot with Jersey. Jersey is an reference implementation of JAX-RS. JAX-RS is a Java API for developing RESTful Service,  it is from JSR 311 (obsolete) and JSR 339.


Open your browser :

`http://localhost:8080/personrepo/search`

Here are the results :

```
// 20170426061602
// http://localhost:8080/personrepo/search

[
  {
    "personId": 1,
    "name": "Uzumaki Naruto",
    "email": "uzumaki_naruto@konohagakure.com"
  },
  {
    "personId": 2,
    "name": "Uchiha Sasuke",
    "email": "uchiha_sasuke@konohagakure.com"
  },
  {
    "personId": 3,
    "name": "Sakura Haruno",
    "email": "sakura_haruno@konohagakure.com"
  },
  {
    "personId": 4,
    "name": "Hatake Kakashi",
    "email": "hatake_kakashi@konohagakure.com"
  }
]
```
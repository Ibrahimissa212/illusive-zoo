# illusive-zoo

Animals inventory management, and daily tasks

Spring Boot REST API

REST endpoints:
______________________________________________________________________________________________________________________

Request Type  |  Endpoint             | Response Description                                                          |

-----------------------------------------------------------------------------------------------------------------------

GET           | <url>/animal          | Return all animals data                                                       |
GET           | <url>/animal/{name}   | Return a single animal data that matches {name}                               |

POST          | <url>/animal          | A new animal type was added to the zoo, create a new animal data and return it|
PUT           | <url>/animal/{name}   | Update animal data that matches name and return it                            |

DELETE        | <url>/animal/{name}   | Delete an animal data(This animal is released back to the jungle)             |

______________________________________________________________________________________________________________________|

##############################################################

Examples:



GET:

curl http://localhost:8080/animal/

curl http://localhost:8080/animal/Lion


POST:

curl -d '{"name":"Eagle","count":10, "sleep":false,"clean":true,"hungry":true}' -H "Content-Type: application/json" -X POST http://localhost:8080/animal

PUT:
curl -X PUT -H 'Content-Type: application/json' -d '{"clean": false}' http://localhost:8080/animal/Cat


DELETE:
curl -X DELETE http://localhost:8080/animal/Eagle

##############################################################

Notes:

I didn't work with a database at this point. A class to simulate the database functionality will be created and later substituted with the actual implementation.

The class will contain a list of hard-coded animal data of IllusiveZoo.

The class must be a singleton so that changes can be persisted across different HTTP requests.

#Used IntelliJ IDEA and maven.



Build and run the program from:

javac MainZooClass.java

java MainZooClass.java
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

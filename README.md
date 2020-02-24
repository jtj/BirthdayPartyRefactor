# BirthdayPartyRefactory
Refactoring exercise

## Instructions
The purpose of this exercise is to improve the code so it is easier to work with. 
There are a few problems in there, find and fix what you can. Don't add any additional
functionality (unless you consider tests additional functionality), we're just checking to see how you can improve existing code.
 
## Getting Started

Running the application: `gradle build test run`

All output is written to the console.

## Comments
Refactored the code to use DDD design pattern.
Have separate domain objects for cake order, balloon order.
Service objects to handle order creation. 
This way we can easily extend the individual domain & services easily with its own domain boundary.

Ideally, I would like to use Dependency Injection framework like Spring.

 

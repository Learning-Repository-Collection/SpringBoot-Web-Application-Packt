# SpringtBoot-Web-Application-Packt
Welcome to the SpringBoot-Web-Application repository! A Self-Learning Project for a SpringBoot Web Application using the guidelines from the "SpringBoot 3.0" book from Chapter 2 by Packt Publishing.

## Update 1 | Creating a Controller
Used spring.start.io to generate a Spring Boot project quickly. Added the Spring Web dependency, which allows me to build web applications using the SpringMVC. Afterwards, I created a web controller class designed to respond to HTTP requests. 

## Update 2 | Adding a Mustache Template
Created a `index.mustache` to display contents onto a website. Updated the controller to be able to add demo data and display it onto the web page. 

## Update 3 | A Better Design
Updated the controller to remove it's ability to add demo data and moved the adding mechanism to the `VideoService` class. Refactored the controller to be able to perform constructor injection.

## Update 4 | A JSON-based API & HTTP Calls
Created a new class called `ApiController` that is used to produce a JSON array by Jackson. Also took some time to understand the 4 different HTTP calls as follows:
* `GET` calls are expected to od nothing but return data
* `POST` calls are used to introduce new data to the system
* `PUT` is similar to `POST` but is used to update existing records
* `DELETE` calls are used to remove something from the server

## Update 5 | JavaScript with Node.js
Made a React.js application and created the files `index.js`, `App.js`, `ListOfVideos.js` & `NewVideo.js`. Created a new mustache file called `react.mustache`. Updated the web controller method to be able launch to react application. 

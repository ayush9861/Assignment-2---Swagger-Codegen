#Assignment 2 - Swagger Codegen

##What is Swagger Codegen?

According to me Swagger Codegen is a framework which allow developer to make API implemendation easy and fast. Using Swagger Codegen developer can easily generate stubs and client SDKs. Swagger has a unique feature to run all the API requests from the configuration page.

Framework Used:-

Springboot: 2.7 

Dependency Managers Used:-

Maven: 3.8.6

Java Version Used:-

Java: 17.0.5

Steps to generate stub:

Step 1- Go to the editor.swagger.com

Step 2- Code your API design using OpenAPI or Swagger2 snippets.

Step 3- Save the code as api.yaml.

Step 4- Download the Swagger-Codegen packege from github using powershell or wget.

Step 5- Using java run the command "java -jar swagger-codegen-cli.jar generate -i api.yaml -o swaggerapi -l spring" 

to generate spring project named swaggerapi.

Step 6- Now, Build the project using maven and run the project.Step 7- Now navigate to your localhost and navigate to the swagger-ui.html page.

Step 8- If it is visible with all the snippets then you are done. 

##Screenshots:-
![](https://i.imgur.com/QCVXeFY.png)
![](https://i.imgur.com/8UaFRkF.png)
![](https://i.imgur.com/mRGBWRq.png)
![](https://i.imgur.com/ap7xdSu.png)
![](https://i.imgur.com/rRHpMJH.png)





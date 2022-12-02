# Crud-Operation

CRUD Example of Spring-Boot-REST-JPA-MySQL.

I have  create an application with crude operations on the user table.
MySQL was used to generate the user table.
Spring Data JPA, MySQL Driver, Spring Web, Apache Derby Database, and Lombok are among the dependencies used.

## can call following Endpoints by using POSTMAN

1. To get list of All Users call following endpoint with GET Request.
   
        http://localhost:3000/users

2. To Create New User use following url with POST Request
    
      
        http://localhost:3000/users

    set content type as in header as application/json
  
    set request body as raw with JSON payload

       {
            "id": "C",
            "name": "Meenakshi",
            "status": "Intern2"
       }
   
3. To get a particular User, use following url with GET request type in postman

        http://localhost:3000/users/id

4. To update User in database, use following url with PUT request type in postman

	   http://localhost:3000/users/id

     set content type as in header as application/json

     set request body as raw with JSON payload

        {
            "id": "C",
            "name": "Yashshvi",
            "status": "Intern2"
        }
  

5. To delete a User from database, use following url with DELETE request type in postman
  
            http://localhost:3000/userss/id


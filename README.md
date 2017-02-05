**TODO List APIto test out various JS Frameworks**

*Will serve as a backend-api when testing out newer 
SPA/JS frameworks*

Things to add

[ ]Security

[ ] Token or oAuth2

[ ] authorization and authentication

[ ] Actual DB if necessary

How to run:

mvn spring-boot:run

API END ENDPOINTS

<address>/add - add todo list item JSON format

Request Body

``
{
"title":"Task 3",
"description":"My task"
}
``

<address>/ - Get all todo items

``
[
{
"description": "My First Task",
"title": "Task 1",
"dateCreated": "2017-02-05 14:52:08"
},
{
"description": "My Second Task",
"title": "Task 2",
"dateCreated": "2017-02-05 14:52:14"
},
{
"description": "My Third Task",
"title": "Task 3",
"dateCreated": "2017-02-05 14:52:20"
}
]
``
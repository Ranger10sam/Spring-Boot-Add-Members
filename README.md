# Spring-Boot-Add-Members

A very simple *Read and Write Spring boot application* following the *MVC architecture* and using *PostgreSql* as its database.

# What does this application do?

There is a form where you can submit member details with details like id, name and country.

After each entry, there is a success page which shows the current entered member.

There is also a **`View All Members`** button, which will give you a table of all the members added in the database.


# File details

There are 5 folders that I made.

1. Controllers
2. Model
3. Service
4. Repo
5. Views

### 1. Controllers

This folder consists of the 2 controllers - 

#### a. IndexController

In this file, we are rendering the home page i.e our `index.jsp`. Also we are catching the url call when someone submits the form, with the help of `@GetMapping("addMembers")`.

In the method `addMembers()`, we are calling the service layer's `addMember()` method, which then calls the `save()` method of the repository layer.

After the data is saved in the database, I am showing that particular entry in the success page in the form of a table. I have used Model object in order to bind the data from the `jsp` to my `java` file.

#### b. MembersController

This controller has the logic to view all the members.

Again I have used the `Model` object in order to pass the `List` of `Members`, which has all the members in it.

I am getting this with the help of the `getAllMembers()` method of the service layer, which then call the repository layer, retrieves the data, passes it back to where it was called initially.

### 2. Model

This has the `Member` class as a model. Its scope is "**prototype**" because i want each member as a seperate objects.

### 3. Service

As we discussed earlier we have the `MemberService` class which consists of all the business logic that I implemented. 

For example viewing all the members, saving a member with a success message.

### 4. Repo

This consists of my `MemberRepo` class which holds all the communication to from the database, like saving the data, retrieving the data and sending it back to the service class.

### 5. Views

I have used 3 views.

#### a. index.jsp
#### b. success.jsp
#### c. members.jsp

As the name suggests, `index.jsp` is my home page.
`success.jsp` shows the data that after its succesfully entered into the database.
`members.jsp` shows all the members in the database.

### pom.xml

In my pom.xml, I have used dependencies like - Jakarta, Apache Tomcat, Javax, PostgreSQL, Spring boot (of course xD)

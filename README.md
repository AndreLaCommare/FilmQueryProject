#Film Query App

## Description
This application allows the user to access a database of films with two available actions. Option 1.) Look up a film by its ID allowing the user to enter an integer between 1 and 1000 to list a particular film by its Title, Description, Rating, Language, and Cast. And Option 2.) Look up a film by a search keyword Allowing the user to enter a String of characters, and should that character pattern match a character pattern in a films title or description said film(s) will be listed back to the user. Should the user enter a number outside of the film ID range or enter a String of characters that does not match any pattern in any films title/description they will receive the message "No such film exists." The user may also enter 0 to quit the application instead of either option above.
## Technologies Used
Java, SQL, Maven, Eclipse

## Lessons Learned
This project gave me a better understanding of the SQL language, in particular, the JOIN/ON statements and in order to build a path from table to table within a database. It also introduced the Maven functionality within Eclipse to manage the project build and update the build when necessary. A few more Java classes and methods were introduced in this project such as Connection and its use of drivers to communicate with a database. Prepared Statement, a subclass of Statement, that allows us to enter SQL Statements into Java and gives us access to methods like setString so that we do not have to hard-code or database queries. And finally Result Set which allows us to execute our queries upon the tables accessed by the user or code.
# FilmQueryProject

# Java_OOP_day_code

## Table of contents
* [Task-1](#task-1)
* [Task-2](#task-2)
* [Task-3](#task-3)


## Task-1

i. adding a new field "color" of type String

ii. adding a new constructor which accepts 3 parameters - length, width and color

iii. adding a new method perimeter() that returns the perimeter of the rectangle

###### Input:
      3.0 4.0 Blue

###### Output:
      A Rect object is created by the constructor with 3 parameters.
      length = 3.0
      width = 4.0
      color = Blue
      area = 12.0
      perimeter = 14.0


## Task-2

a. Add two new private field bookID and nextID to the Book class. One of the fields should be static.

b. Complete the main class so that it can read in book records (title, author) by using the lead card method.

c. Store the book records in an array and automatically assign a book ID (starting from 1000 and increment by 1) to each book.

d. Change all books' isBorrowed status to false.

e. Print out all books' information

###### Input:
        3
        The Lord of the Rings
        J. R. R. Tolkien
        The Hunger Games
        Suzanne Collins
        Harry Potter
        J. K. Rowling

###### Output:
        Book ID: 1000
        Title: The Lord of the Rings
        Author: J. R. R. Tolkien
        Status: Available

        Book ID: 1001
        Title: The Hunger Games
        Author: Suzanne Collins
        Status: Available

        Book ID: 1002
        Title: Harry Potter
        Author: J. K. Rowling
        Status: Available
        
        
 ## Task-3
 * a list of staff records from the standard input into an Employee array using the lead card method, and then prints the full-time staff records followed by the part-time staff records.
 * In particular, the first line of input contains an integer indicating the number of staff records that follows.
 * After that, each line contains either a full-time or part-time staff record.
      For full-time staff, the line will have 4 entries: {4-digit ID} {name} 1 {salary}
      For part-time staff, the line will have 5 entries: {4-digit ID} {name} 2 {hourly rate} {working hours}

###### Input:
        5
        1001 Samuel 1 20000
        1002 Franklin 2 500 10
        1003 John 1 50000
        1004 Jimmy 2 800 20
        1005 Irene 1 40000

###### Output:
      1001 Samuel (FT) $20000
      1003 John (FT) $50000
      1005 Irene (FT) $40000
      1002 Franklin (PT) $500 x 10
      1004 Jimmy (PT) $800 x 20



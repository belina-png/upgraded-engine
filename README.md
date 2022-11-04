# Java_OOP_task_code
![image](https://user-images.githubusercontent.com/78548649/199979599-626150fb-173c-4f03-b76b-9e41f4979fee.png)


## Table of contents
* [Task-1](#task-1) ``perimeter of the rectangle``
* [Task-2](#task-2) ``Library Management System Project``
* [Task-3](#task-3) ``Employee Management System``


## Task-1

>- [x] ___Find perimeter of the rectangle___

![image](https://user-images.githubusercontent.com/78548649/199996666-92bbc0b9-125b-4e43-b3d4-5c96aef22266.png)


##### Steps: 
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

<details><summary> 👋 mysolution_Click Me </summary>
<p>

````ruby
      import java.util.Scanner;

      public class RectClass {
          double length;	
          double width;
          String color;

          double area() {	
              return length*width;
          }

          double perimeter() {
              return 2*(length + width);
          }

          void showInfo() {
              System.out.println("length = " + length);
              System.out.println("width = " + width);
              System.out.println("color = " + color);
              System.out.println("area = " + area());
              System.out.println("perimeter = " + perimeter());
          }

          RectClass(double l, double w, String c) { 
              System.out.println("A Rect object is created by the constructor with 3 parameters.");
              length = l;
              width = w;
              color= c;
          }

          public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

              RectClass rect;

              rect = new RectClass(input.nextDouble(), input.nextDouble(), input.next());
              rect.showInfo();

          }
      }
`````
</p>
</details>


## Task-2 

>- [x] ___Library Management System Project___

![image](https://user-images.githubusercontent.com/78548649/199983390-09cd2cf9-cd01-408d-ae7a-71ca3cd59a15.png)


##### Steps: 
       1. Add two new private field bookID and nextID to the Book class. One of the fields should be static.
           
       2. Complete the main class so that it can read in book records (title, author) by using the lead card method.
           
       3. Store the book records in an array and automatically assign a book ID (starting from 1000 and increment by 1) to each book.
           
       4. Change all books' isBorrowed status to false.
           
       5. Print out all books' information

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
   
<details><summary> 👋 mysolution_Click Me </summary>
<p>

 ````ruby
 import java.util.Scanner;

      class Book{
          private static Integer nextID = 1000;
          private Integer bookID;
          private String title;
          private String author;
          private boolean isBorrowed;

          public Book(String title, String author){
              this.title = title;
              this.author = author;
              this.isBorrowed = false;
              this.bookID  = nextID++;
          }

          public void borrowBook(){
              isBorrowed = true;
          }

          public void returnBook(){
              isBorrowed = false;
          }

          public boolean isBookBorrowed(){
              return isBorrowed;
          }

          public void show() {
              System.out.println("Book ID: " + bookID);
              System.out.println("Title: " + title);
              System.out.println("Author: " + author);
              System.out.print("Status: ");
              if (isBorrowed)
                  System.out.println("Not Available");
              else
                  System.out.println("Available");
              System.out.println();
          }
      }

      public class MyClass {
          public static void main(String args[]) {

               Scanner input = new Scanner(System.in);
             int num = input.nextInt();
             input.nextLine();

             Book[] books = new Book[num];
              String title;
              String author;
             for (int i=0; i<num; i++) {
                  title = input.nextLine();
                  author = input.nextLine();
                  books[i] = new Book(title,author);
             }
             for (int i = 0; i < num; i++) {
              books[i].show();
        }
    }
}
`````
</p>
</details>
 
 ## Task-3
 >- [x] ___Employee Management System___
 
 ##### Steps: 
       1. a list of staff records from the standard input into an Employee array using the lead card method, and then prints the full-time staff records followed by the part-time staff records.
       2. In particular, the first line of input contains an integer indicating the number of staff records that follows.
       3. After that, each line contains either a full-time or part-time staff record.
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


<details><summary> 👋 mysolution_Click Me </summary>
<p>

 ````ruby
      import java.util.Scanner;

      class Employee {            // DO NOT modify this class
          private int ID;         // 4-digit integer
          private String name;

          Employee(int ID, String name) {
              this.ID = ID;
              this.name = name;
          }

          public int getID() {
              return ID;
          }

          public String getName() {
              return name;
          }

          public String toString() {
              return ID + " " + name;
          }
      }

      class FTstaff extends Employee {
          // Complete the subclass with a new field (salary), a constructor and override toString()
          private int salary;
          public FTstaff(int ID, String name,int salary){
              super(ID,name);
              this.salary=salary;
          }

          public String toString() {
              return super.toString() + " (FT) $"+ salary;
          }
      }

      class PTstaff extends Employee {
          // Complete the subclass with two new fields (hourly rate and working hours), a constructor and override toString()
          private int hourlyRate;
          private int workingHours;

          public PTstaff(int ID, String name,int hourlyRate,int workingHours){
              super(ID,name);
              this.hourlyRate=hourlyRate;
              this.workingHours=workingHours;
          }


      public String toString() {
              return super.toString() + " (PT) $" + hourlyRate + " x " + workingHours;
          }
      }

      public class EmployeeTest {
          public static void main(String args[]) {
              Scanner input=new Scanner(System.in);
              int num=input.nextInt();
              input.nextLine();

              Employee[] staff = new Employee[num];

              for (int i=0; i<num; i++) {
                  int id = input.nextInt();
                  String name = input.next();
                  int mode = input.nextInt(); // 1: full time and 2: part time

                  // Create either FTstaff or PTstaff and put into the array staff (3 lines)
                  if(mode==1)
                      staff[i]=new FTstaff(id,name,input.nextInt());
                  else       
                      staff[i]=new PTstaff(id,name,input.nextInt(),input.nextInt());
              }

              for (Employee e: staff) {
                  // add one line to print full-time staff only
                  if(e instanceof FTstaff)
                      System.out.println(e);
              }        

              for (Employee e: staff) {
                  // add one line to print part-time staff only
                  if(e instanceof PTstaff)
                      System.out.println(e);
        }
    }
}


`````
</p>
</details>

[BackToTop](#table-of-contents)

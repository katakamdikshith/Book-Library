Book Library Management System

Project Overview

The **Book Library Management System** is a console-based Java application developed to manage books in a library. It allows users to add new books, display all available book records, search for books by their unique ID, borrow books, and return borrowed books.

This project demonstrates the practical implementation of Core Java concepts, object-oriented programming, interfaces, and Java Collections.

## Features

* **Add Book:** Add new books by entering the book ID, title, author name, and availability status.
* **Display All Books:** Display all books stored in the library.
* **Search Book:** Search for a book using its unique ID.
* **Borrow Book:** Borrow a book if it exists and is available.
* **Return Book:** Return a previously borrowed book using its ID.
* **Availability Management:** Update the availability status when a book is borrowed or returned.
* **Menu-Driven Interface:** Navigate through library operations using a console menu.

## Technologies Used

* Java
* Core Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* ArrayList
* Interfaces
* Scanner
* Eclipse IDE

## Class Descriptions

### 1. Book.java

The Book class represents an individual book in the library.

Based on the project requirements, it contains:

* bookId — Unique identifier of the book.
* title — Title of the book.
* author — Name of the book's author.
* available — Indicates whether the book is available for borrowing.

The class is intended to use constructors, getters, setters, availability methods, and a toString() method.

### 2. Borrowable.java

The Borrowable interface defines the borrowing and returning operations.

**Methods:**

* `borrowBook(int bookId)` — Defines the operation for borrowing a book.
* `returnBook(int bookId)` — Defines the operation for returning a book.

### 3. Library.java

The `Library` class implements the `Borrowable` interface and manages the collection of books using an `ArrayList<Book>`.

**Methods:**

* `addBook(Book book)` — Adds a new book to the library.
* `addBook1(Book book)` — Adds a book to the collection without displaying a confirmation message.
* `display()` — Displays all books currently stored in the library.
* `searchBook(int bookId)` — Searches for a book by ID.
* `borrowBook(int bookId)` — Checks whether a book exists and is available before borrowing it.
* `returnBook(int bookId)` — Checks whether a book has been borrowed before returning it.

### 4. Test.java

The `Test` class contains the `main()` method and runs the console application.

It uses:

* `Scanner` to read user input.
* A `while` loop to keep the menu running.
* A `switch` statement to process menu choices.
* A `Library` object to perform book management operations.

The application starts with five sample books.

## Sample Book Data

The application initially adds the following books:

| Book ID | Title       | Author             | Available |
| ------: | ----------- | ------------------ | --------- |
|       1 | Java        | James Gosling      | Yes       |
|       2 | Python      | Guido van Rossum   | Yes       |
|       3 | My SQL      | Michael Widenius   | No        |
|       4 | Spring      | Rod Johnson        | Yes       |
|       5 | Spring Boot | Rod Johnson        | No        |

## Application Menu

```text
========== LIBRARY MENU ==========
1. Add Book
2. Display All Books
3. Search Book
4. Borrow Book
5. Return Book
6. Exit

Enter your choice:
```

## How to Run the Project

### Using Eclipse IDE

1. Open Eclipse IDE.
2. Import the Java project into your workspace.
3. Ensure all Java files are inside the `booklibrary` package.
4. Open `Test.java`.
5. Right-click the file.
6. Select **Run As → Java Application**.
7. Use the console menu to perform library operations.


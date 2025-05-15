### **Java Test: Library Management System**

**Time - 30 mins** 

**Marks - 60**

**Problem Description:**  
You are tasked with designing a simple library system using **inheritance** in Java. The goal is to understand how a base class can be extended by multiple derived classes to represent different types of library items.

#### **Requirements:**
1. **Base Class:** `LibraryItem`
   - This class should contain essential information such as:
     - `title` (String): The name of the item.
     - `yearPublished` (int): The year when the item was published.
   - It should have a method `displayInfo()` that prints basic details about the library item.

2. **Derived Classes:**  
   - `Book`: Represents a book in the library.  
     - Includes an additional field `author` (String) to store the author's name.  
     - Overrides the `displayInfo()` method to also print the author's name.
   - `Magazine`: Represents a magazine in the library.  
     - Includes an additional field `issueNumber` (String) to store the magazine’s issue number.  
     - Overrides the `displayInfo()` method to also print the issue number.
   - `Newspaper`: Represents a newspaper in the library.  
     - Includes an additional field `editor` (String) to store the editor’s name.  
     - Overrides the `displayInfo()` method to also print the editor’s name.

#### **Objective of the Test:**
- Implement the **concept of inheritance** using the base and derived classes.
- Demonstrate **method overriding** in the derived classes.
- Create objects of each class (`Book`, `Magazine`, and `Newspaper`), assign values to their properties, and call the `displayInfo()` method.
- Understand the **relationship between parent and child classes** in object-oriented programming.

# Study Guide (Overall Concepts)

For each topic, I suggest you be able to answer these overall questions:
  Tell me about your experience with X.
  What is X?
  How does X work?

Additionally, be able to follow up with more detail as needed.
As well as examples for them.

I also suggest reviewing the "How to do well in QC" document that was shared and pinned in the slack workspace (general channel).

## Topics (Java)
- Java (High Level)
  - Features of Java
    - Object Oriented
    - C-Based (Easy to learn)
    - Portable
      - Java ByteCode
    - Automatic Memory Management
      - Stack and Heap
      - Where different items are stored
  - 4 Pillars of Object Oriented Programming
    - Inheritance
      - Understand idea of IS-A relationships
    - Abstraction
      - Abstract Classes & Interfaces
    - Encapsulation
      - Private access modifiers and getters/setters
    - Polymorphism
      - Covariance, Casting (a little bit)
      - Method Overriding/Overloading
  - JDK, JRE, JVM
  - Class vs Objects
  - Control Flow
    - if-else
      - can be chained
    - while
    - for
    - do-while
    - switch
      - Uses break statement, otherwise it will "fall through"
  - data types
    - 8 primitive types
    - objects
  - Methods
  - Variables
    - Scopes
  - Access Modifiers
    - public
    - private
    - protected
    - default
      - Often called "package-private"
  - Static and final keywords
  - Some basic linux commands
    - cd
    - ls
    - mv
  - Java from command line
    - java
      - Java Virtual Machine
        - Often called a Just In Time (JIT) Compiler
        - In actuality, it is more of an interpreter
        - It translates Java ByteCode into executable machine code and executes it
    - javac
      - Java Compiler
        - Converts Java Source Code into Java ByteCode
  - Arrays
  - Constructors
    - Constructor Chaining
  - Strings
    - String Pool
    - Strings are immutable
    - String literals
  - StringBuilder & StringBuffer
  - Ternary Operator
  - Var-args
  - Annotations
    - @Override
    - We can create our own
  - Wrapper Classes
    - Look into autoboxing & auto-unboxing
  - Packages and imports
    - How this relates to access modifiers
  - Object Class
  - Abstract Classes
    - Cannot be instantiated
  - Interfaces
    - Cannot be instantiated
    - Have many more restrictions than Abstract Classes
    - Classes can implement many interfaces
      - But can only extend 1 class
  - Collection API
    - Large hierarchy of Classes/Interfaces regarding data structures to contain data
    - Starts with Iterable Interface
    - Collection Interface
    - List, Set, Queue Interfaces
      - Know characteristics of each
    - Enhanced for-loop
    - Generics
      - < & > to support generic types
      - Can have a List of anything that you want
  - Maps
    - Data structure of key-value pairs
    - NOT part of Collection API, but related
  - Exceptions
    - Exception Class Hierarchy
      - Throwable
        - Error
          - StackOverflowError
          - OutOfMemoryError
        - Exception (checked)
          - IOException
          - ClassNotFoundException
          - RuntimeException (unchecked)
            - ArithmeticException
            - IndexOutOfBoundsException
            - etc
    - Understand what checked vs unchecked means
    - Note: ALL exceptions happen at runtime
    - Keywords: try, catch, finally, throw, throws

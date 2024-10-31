# Design Patterns Implemented in Java
Learning design patterns with Java.

## Introduction
Design patterns are formalized best practices that help solve common problems in software design. These patterns represent proven solutions that improve code readability, flexibility, and scalability by following principles of object-oriented design. They are categorized into three main types:

### 1. **Creational Patterns** 
These patterns provide ways to create objects while hiding the creation logic, rather than instantiating objects directly. This approach enhances flexibility in terms of object creation and allows for more efficient memory management. Examples include:

- **Singleton**: Ensures only one instance of a class exists.
- **Factory Method**: Defines an interface for creating objects, but allows subclasses to alter the type of objects created.
- **Builder**: Constructs complex objects by separating their representation from the creation process.

### 2. **Structural Patterns**: 
These patterns focus on object composition and relationships between objects, making it 
easier to develop structures that are flexible and efficient. Examples include:

- **Adapter**: Allows incompatible interfaces to work together.
- **Decorator**: Adds new functionality to an object dynamically.
- **Composite**: Combines objects into tree-like structures to represent part-whole hierarchies.

### 3. **Behavioral Patterns**: 
These patterns are concerned with communication between objects, focusing on the flow 
and control of data. Examples include:

- **Observer**: Defines a one-to-many relationship so that when one object changes, all dependents are notified.
- **Strategy**: Enables selecting an algorithm's behavior at runtime.
- **Command**: Encapsulates a request as an object, allowing for parameterization of clients with different requests.

## Project Overview
In this repository, I’ll be implementing these design patterns in Java, with examples and testing for each pattern. The 
goal is to provide a practical understanding of each pattern's purpose, usage, and benefits in real-world applications.

### Repository Structure
The repository is organized as follows:

- `/src`: Contains Java classes and implementations for each design pattern.
    - `creational`: Creational pattern implementations
    - `structural`: Structural pattern implementations
    - `behavioral`: Behavioral pattern implementations
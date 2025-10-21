***

# Java Todo Application (Console)

A simple command-line Todo application built using Java. This program lets users add, view, mark as done, and delete tasks interactively through a text-based menu.

## Features

- Add new tasks with a unique ID and description
- View all current tasks with status (Pending/Done)
- Mark tasks as completed
- Delete tasks by ID
- Intuitive console menu navigation

## Usage

1. **Compile**  
   ```
   javac Main.java
   ```

2. **Run**  
   ```
   java Main
   ```

3. **Instructions**  
   - Select an option from the menu:
     - Add, view, mark as done, or delete tasks
   - Enter task details as prompted

## Example

```
-------------------
-Todo Application-
-------------------
1.Add task
2.View task
3.Mark task as done
4.Delete task
5.Exit
-------------------
Enter your choice
```

## Code Highlights

- Uses an `ArrayList` to store tasks in memory
- Task details managed via a custom `Task` class
- Console input is handled using `Scanner`
- Demonstrates OOP principles and basic CRUD operations

## Author

- Developed by Salmaan M

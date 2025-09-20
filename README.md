# Console To-Do List

## 📖 Summary
This is a console-based **To-Do List application** built in **Java**.  
The application allows users to **add, view, and delete tasks** through simple console commands.  
It runs interactively and does not terminate unless forcefully stopped.

---

## 🏗️ Project Structure
The application is designed using **Object-Oriented Programming** principles.

### 🔹 Task Class
- Represents a single task.
- Properties:
  - `id` (long) → unique and auto-generated.
  - `message` (String) → description of the task.
  - `date` (String, format: dd/MM/yyyy) → deadline or date of the task.

### 🔹 TaskManager Class
- Manages all operations on tasks.
- Supports:
  - Adding tasks
  - Deleting tasks
  - Viewing tasks by **id** or **date**
  - Displaying all available tasks
- Uses:
  - `Set` (`HashSet`) → to store tasks uniquely.
  - `Map` (`HashMap`) → for quick search by `id` or `date`.

---

## ⚙️ Features
✅ Add a task (auto-generated `id`)  
✅ View task by `id`  
✅ View tasks by `date`  
✅ Delete task by `id`  
✅ Show all tasks after add/delete operations  
✅ Validates date format `dd/MM/yyyy`

---

## ⌨️ Input Commands
There are 4 types of commands:

- **`a`** → Add a new task  
- **`v<id>`** → View a task by its id  
- **`v<date>`** → View all tasks for a given date  
- **`d<id>`** → Delete a task by its id  

---

## 🖥️ Example Simulation
```text
Enter command: a
Message: Scrum meeting
Date (dd/MM/yyyy): 14/09/2025
Task added successfully!
All Tasks:
Task [id=100, message='Scrum meeting', date=14/09/2025]

Enter command: a
Message: Project deadline
Date (dd/MM/yyyy): 14/09/2025
Task added successfully!
All Tasks:
Task [id=100, message='Scrum meeting', date=14/09/2025]
Task [id=101, message='Project deadline', date=14/09/2025]

Enter command: v100
Task [id=100, message='Scrum meeting', date=14/09/2025]

Enter command: v14/09/2025
Task [id=100, message='Scrum meeting', date=14/09/2025]
Task [id=101, message='Project deadline', date=14/09/2025]

Enter command: d101
Task deleted successfully!
All Tasks:
Task [id=100, message='Scrum meeting', date=14/09/2025]
````

---

## 📂 Constraints Fulfilled

* ✅ `Task` class → for single task management (10%)
* ✅ `TaskManager` class → for operations (10%)
* ✅ Add/Delete operations show all tasks (10%)
* ✅ `id` auto-generated, not user-provided (10%)
* ✅ Used `HashSet` for storage (20%)
* ✅ Used `HashMap` for search by `id`/`date` (10%)

---

## 🚀 How to Run

1. Clone this repository or extract the `.zip` file.
2. Open terminal and navigate to the project folder.
3. Compile the program:

   ```bash
   javac TodoApp.java
   ```
4. Run the program:

   ```bash
   java TodoApp
   ```

---

## 📸 Screenshots

Screenshots of terminal after adding, deleting, and viewing tasks are available.

---


## `List` Interface

- The `List` interface is part of the Java Collections Framework and represents an **ordered collection** of elements.
- Elements can be accessed by **index**, **duplicates are allowed**, and **insertion order is maintained**.
- Being an interface, `List` cannot be instantiated directly. You must use a class that implements it.

### Common Implementations:
- **ArrayList** – Similar to an array but with dynamic resizing.
- **LinkedList** – Doubly-linked list; efficient at insertions/removals, especially in the middle of the list.

---

### 📊 List vs. Array

| Feature                         | Array                       | List (`ArrayList`, `LinkedList`)         |
|---------------------------------|-----------------------------|------------------------------------------|
| Size                            | Fixed                       | Dynamic                                  |
| Performance                     | Faster for raw data access  | Slightly slower, but more flexible       |
| Collections Framework Support   | Not part of the framework   | Part of the Collections Framework        |

---

### ✅ Common List Methods

| Method      | Description                                         |
|-------------|-----------------------------------------------------|
| `add()`     | Adds an element to the end of the list              |
| `get()`     | Returns the element at the specified index          |
| `set()`     | Replaces the element at the specified index         |
| `remove()`  | Removes the element at the specified index          |
| `size()`    | Returns the number of elements in the list          |


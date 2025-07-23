
# Java Set Interface

The `Set` interface is part of the **Java Collections Framework** and is used to store a collection of **unique elements**.

Unlike a `List`, a `Set`:
- Does **not allow duplicates**
- Does **not guarantee element order** (unless using `TreeSet` or `LinkedHashSet`)

## Implementations of Set

| Class           | Description                         |
|----------------|-------------------------------------|
| `HashSet`      | Fast and unordered                  |
| `TreeSet`      | Sorted set                          |
| `LinkedHashSet`| Maintains insertion order          |

> ✅ Tip: Use a `Set` when you need to store **unique values only**.

## Common Set Methods

| Method       | Description                              |
|--------------|------------------------------------------|
| `add()`      | Adds an element if it's not already in the set |
| `remove()`   | Removes the element from the set         |
| `contains()` | Checks if the set contains the element   |
| `size()`     | Returns the number of elements           |
| `clear()`    | Removes all elements                     |

---
---
---


# Traversing a Set in Java

There are two common ways to iterate through a `Set`:


### 1.  Using Enhanced `for` Loop

```java
for (int item : set) {
    System.out.println(item);
}
```

This is the simplest and most readable way when you don't need to modify the set during iteration.

---

### 2.  Using an `Iterator`

```java
import java.util.Iterator;

Iterator<Integer> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

- `hasNext()` and `next()` are methods from the **`Iterator`** interface.
- These methods are **not part of the `Set` or `Collection` interfaces**.

---

### 📝 Notes:
- The `Iterator` interface must be imported:  
  `import java.util.Iterator;`
- Iterator can be used with **any Java collection** that implements the `Iterable` interface:
  - `ArrayList`
  - `LinkedList`
  - `Vector`
  - `Stack`
  - `Set`
  - `Map` (with `.entrySet()` or `.keySet()`)

---

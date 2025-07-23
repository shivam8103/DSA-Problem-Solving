# 📘 Java LinkedHashSet

A **LinkedHashSet** is a collection that stores **unique elements** and **remembers the order** in which they were added.

It is part of the `java.util` package and implements the **Set** interface.

> ✅ **Tip:** Use `LinkedHashSet` when you want a set that does **not allow duplicates** and also **preserves insertion order**.

---

## 1.  Import

```java
import java.util.LinkedHashSet;
```

### 2.  Creating a LinkedHashSet

```java
LinkedHashSet<String> set = new LinkedHashSet<String>();
```

### 3. Add Elements

```java
Set<Integer> set = new LinkedHashSet<>();

set.add(10);
set.add(20);
set.add(30);
set.add(20);  // Duplicate - won't be added
set.add(40);

System.out.println(set);
```

> Note: Duplicates like `20` will not be added again in a `LinkedHashSet`.

### 4. Remove an element

```java
set.remove(10);
```

### 5. Remove all element

```java
set.clear();
```
### 6. Size of the LinkedHashSet

```java
int count = set.size();  //only counts unique element
```

---

## 🔁 HashSet vs LinkedHashSet

| Feature     | HashSet               | LinkedHashSet               |
|-------------|------------------------|------------------------------|
| **Order**   | No guaranteed order    | Insertion order preserved   |
| **Duplicates** | Not allowed         | Not allowed                  |
| **Performance** | Faster             | Slightly slower (due to order tracking) |

---

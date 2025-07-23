
# Java HashSet

A **HashSet** is a part of the Java Collections Framework. It implements the `Set` interface and stores **unique** elements (no duplicates allowed). Elements are **unordered**, meaning insertion order is not preserved.

---

## ✅ Features of HashSet

- Allows only **unique** elements
- **Unordered** (no guaranteed insertion order)
- Allows **null** element
- **Faster** than other set implementations (like TreeSet)
- **Non-synchronized** (not thread-safe)

---

## 1.  Import

```java
import java.util.HashSet;
```

### 2.  Creating a HashSet

```java
HashSet<String> set = new HashSet<String>();
```

### 3. Add Elements

```java
Set<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(30);
set.add(20);  // Duplicate - won't be added
set.add(40);

System.out.println(set);
```

> Note: Duplicates like `20` will not be added again in a `HashSet`.

### 4. Remove an element

```java
set.remove(10);
```

### 5. Remove all element

```java
set.clear();
```
### 6. Size of the HashSet

```java
int count = set.size();  //only counts unique element
```
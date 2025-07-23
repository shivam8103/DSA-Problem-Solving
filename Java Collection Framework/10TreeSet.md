# Java TreeSet

A `TreeSet` is a collection that stores **unique elements** in **sorted order**.

- It is part of the `java.util` package.
- Implements the `Set` interface.

> 💡 **Tip:** Unlike `HashSet`, which does not maintain any order, `TreeSet` keeps its elements **automatically sorted**.

---

## 1.  Import

```java
import java.util.TreeSet;
```

### 2.  Creating a TreeSet

```java
TreeSet<String> set = new TreeSet<String>();
```

### 3. Add Elements

```java
Set<Integer> set = new TreeSet<>();

set.add(10);
set.add(20);
set.add(30);
set.add(20);  // Duplicate - won't be added
set.add(40);

System.out.println(set);
```

> Note: Duplicates like `20` will not be added again in a `TreeSet`.

### 4. Remove an element

```java
set.remove(10);
```

### 5. Remove all element

```java
set.clear();
```
### 6. Size of the TreeSet

```java
int count = set.size();  //only counts unique element
```
---


## 🔁 HashSet vs TreeSet

| Feature        | HashSet                  | TreeSet                     |
|----------------|---------------------------|------------------------------|
| **Order**      | No guaranteed order       | Sorted (natural order)      |
| **Duplicates** | Not allowed               | Not allowed                 |
| **Performance**| Faster (no sorting)       | Slower (due to sorting)     |


# Java ArrayList

## 📌 What is ArrayList?

- `ArrayList` is a resizable array-like data structure.
- It is part of the `java.util` package and implements the `List` interface.
- Maintains insertion order and allows duplicate elements.
- Unlike arrays, its size can be changed dynamically.

---

## ✅ Creating an ArrayList

### 1. Import the Class

```java
import java.util.ArrayList;
```
## 📌 2. Create an ArrayList

```java
// Using List interface (recommended)
List list = new ArrayList();

// Using generics (type-safe)
List<Integer> list = new ArrayList<>();
// or
List<Integer> list = new ArrayList<Integer>();
```

### 3. Adding Elements to an ArrayList

```java
list.add(10);
list.add(20);
list.add(30);
```

### 4. Printing All Elements of the ArrayList

```java
System.out.println(list);
```

### 5. Inserting Element at a Specific Position (Not at the End)
```java
list.add(2, 25);  // Inserts 25 at index 2 (after 20)
```

### 6. Adding Different Data Types to a Non-Generic List
```java
list.add("Shivam");  // Allowed, no compile-time error
```

### 7. Using Generics (Type-Safe Collections)
```java
List<Integer> list = new ArrayList<>();
// or
List<Integer> list = new ArrayList<Integer>();
```

Trying to add a different type:

```java
list.add("Shivam");  // ❌ Error: incompatible types
```

### 8. Accessing an Element

Use the `get()` method with the index to access an element in the `ArrayList`.

```java
list.get(0);  // Gets the first element
```

### 9. Changing an Element

Use the `set()` method with the index to modify an element in the `ArrayList`.

```java
list.set(0, 1);  // Replaces the first element with "1".
```
### 10. Removing an Element

Use the `remove()` method with the index to remove an element from the `ArrayList`.

```java
list.remove(0);  // Removes the first element
```
### 11. Removing All Elements

Use the `clear()` method to remove all elements from the `ArrayList`.

```java
list.clear();  // Empties the entire list
```

### 12. ArrayList Size

Use the `size()` method to find out how many elements are in the `ArrayList`.

```java
list.size();  // Returns the number of elements
```
---


# Looping Through an ArrayList

You can loop through the elements of an `ArrayList` using:

---

### 1. Traditional `for` loop

Use the `size()` method to define loop boundaries and `get()` to access each element.

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(20);
    list.add(40);
    list.add(60);
    list.add(80);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
```

### 2. Enhanced `for-each` Loop

Simpler and cleaner when you don't need the index.

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(20);
    list.add(40);
    list.add(60);
    list.add(80);


    for (int ls : list) {
      System.out.println(ls);
    }
  }
}
```


## Sort an ArrayList

The `Collections` class in the `java.util` package provides the `sort()` method to sort an `ArrayList` alphabetically or numerically.

```java
    Collections.sort(list);  
```

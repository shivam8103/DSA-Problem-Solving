
# 📦 Java Vector

Vectors are part of the Java Collection Framework and are very similar to ArrayLists, but with one key difference: **Vectors are synchronized** (thread-safe), while **ArrayLists are not**.

---

## ✅ 1. Import Statement
```java
import java.util.Vector;
```

## ✅ 2. Create a Vector
```java
Vector<String> vector = new Vector<String>();
```

## ✅ 3. Add Elements
```java
vector.add("Shivam");
vector.add("Sinha");
```

## ✅ 4. Delete All Elements
```java
vector.clear();
```

## ✅ 5. Print Vector
```java
System.out.println(vector);
```

## ✅ 6. Access Element at Index
```java
String item = vector.get(0); // Gets the element at index 0
```

## ✅ 7. Modify Element at Index
```java
vector.set(0, "Sinha"); // Replaces element at index 0 with "Sinha"
```

## ✅ 8. Remove by Index or Object
```java
vector.remove(0);            // Removes element at index 0
vector.remove("Sinha");      // Removes object "Sinha"
```

## ✅ 9. Get Size of Vector
```java
int size = vector.size(); // Returns number of elements
```

## ✅ 10. Check if Vector is Empty
```java
boolean empty = vector.isEmpty();
```

## ✅ 11. Check if Vector Contains an Element
```java
boolean hasElement = vector.contains("Shivam");
```

## ✅ 12. Get Index of Element
```java
int firstIndex = vector.indexOf("Shivam");
int lastIndex = vector.lastIndexOf("Shivam");
```

## ✅ 13. Clear All Elements
```java
vector.clear();
```

---

## 🔍 Vector vs ArrayList

| Feature             | ArrayList            | Vector                  |
|---------------------|----------------------|--------------------------|
| Thread-Safety       | ❌ Not thread-safe    | ✅ Thread-safe           |
| Performance         | ✅ Faster             | ❌ Slower (synchronized) |
| Synchronization     | ❌ No                 | ✅ Yes                   |
| Use Case            | Single-threaded      | Multi-threaded          |

> 🔒 **Use Vector** only when you need synchronization. Otherwise, prefer **ArrayList** for better performance.


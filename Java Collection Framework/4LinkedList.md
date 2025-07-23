
# Java LinkedList – Quick Reference

`LinkedList` is a part of the Java Collections Framework. It implements both `List` and `Deque` interfaces, making it a good choice for operations at both ends (head and tail) of the list.

---

## 📌 1. Create a LinkedList

```java
import java.util.LinkedList;
import java.util.List;

List linkedList = new LinkedList();
```

---

## ➕ 2. Add Elements

```java
linkedList.add(10);             // Add at the end
linkedList.add(1, 20);          // Add 20 at index 1
```

---

## ⬅️➡️ 3. Add at Beginning or End

```java
linkedList.addFirst(1);         // Add at the beginning
linkedList.addLast(0);          // Add at the end
```

---

## 🖨️ 4. Print the List

```java
System.out.println(linkedList);
```

---

## ❌ 5. Remove by Index

```java
linkedList.remove(2);  // Removes element at index 2
```

---

## 📥 6. Access Element by Index

```java
int item = linkedList.get(0);  // Element at index 0
```

---

## ⏪⏩ 7. Get First or Last Element

```java
int first = linkedList.getFirst();
int last = linkedList.getLast();
```

---

## ✏️ 8. Replace Element

```java
linkedList.set(0, 11);  // Replace value at index 0 with 11
```

---

## 🧹 9. Remove Variants

```java
linkedList.remove();       // Removes head (first element)
linkedList.remove(0);      // Removes element at index 0
linkedList.remove((Integer) 11);  // Removes value 11 (cast needed to avoid overload confusion)
```

---

## 👀 10. Peek Head Element (without removing)

```java
int head = linkedList.peek();
```

---

## 🔍 11. Check if Element Exists

```java
boolean exists = linkedList.contains(11);
```

---

## 🧼 12. Clear the List

```java
linkedList.clear();  // Removes all elements
```

---

## 🔢 13. Size and Emptiness

```java
int count = linkedList.size();
boolean empty = linkedList.isEmpty();
``````
### 📋 LinkedList Method Overview with Examples

| Method           | Description                                       | Example Code                             |
|------------------|---------------------------------------------------|-------------------------------------------|
| `addFirst()`  | Adds an element to the beginning of the list      | `linkedList.addFirst(100);`              |
| `addLast()`   | Adds an element to the end of the list            | `linkedList.addLast(200);`               |
| `removeFirst()`  | Removes the first element of the list             | `linkedList.removeFirst();`              |
| `removeLast()`   | Removes the last element of the list              | `linkedList.removeLast();`               |
| `getFirst()`     | Gets the first element of the list (does not remove it) | `int first = linkedList.getFirst();` |
| `getLast()`      | Gets the last element of the list (does not remove it)  | `int last = linkedList.getLast();`    |

### ✅ Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addFirst(5);          // [5, 10, 20]

        System.out.println(linkedList);  // Output: [5, 10, 20]

        linkedList.removeFirst();        // Removes 5 → [10, 20]
        linkedList.removeLast();         // Removes 20 → [10]

        linkedList.addFirst(1);          // [1, 10]
        linkedList.addLast(100);         // [1, 10, 100]

        int first = linkedList.getFirst(); // 1
        int last = linkedList.getLast();   // 100

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
```
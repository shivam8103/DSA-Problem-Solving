
# Stack in Java

A **Stack** is a linear data structure that follows the **Last In First Out (LIFO)** principle. It extends the `Vector` class and inherits its properties.

## Key Characteristics

- Based on **LIFO** (Last In First Out)
- Allows **duplicates**
- Maintains **insertion order**
- Inherits from `Vector`, meaning many methods like `size()`, `isEmpty()` are also available

## Example: Creating and Using a Stack

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(10);  // Duplicates allowed
        stack.push(20);

        System.out.println(stack);  // Output: [10, 10, 20]
    }
}
```

## Common Stack Methods

| Method         | Description |
|----------------|-------------|
| `push(E item)` | Adds an element to the top of the stack |
| `pop()`        | Removes and returns the top element |
| `peek()`       | Returns the top element without removing it |
| `empty()`      | Returns true if the stack is empty |
| `isEmpty()`    | Inherited from `Vector`, same as `empty()` (preferred) |
| `size()`       | Returns the number of elements in the stack |
| `search(Object o)` | Returns 1-based position from top; -1 if not found |
| `contains(Object o)` | Checks if an element exists in the stack |
| `clear()`      | Removes all elements from the stack |

## More Examples

### Peek Top Element
```java
System.out.println(stack.peek());  // Returns the top element
```

### Pop Element
```java
stack.pop();  // Removes the top element
```

### Check if Stack is Empty
```java
boolean isEmpty = stack.empty();  // or stack.isEmpty();
```

### Size of Stack
```java
int count = stack.size();  // Number of elements in the stack
```

### Search for an Element
```java
int position = stack.search(20);  // Position from top (1-based), -1 if not found
```

### Check for Existence
```java
boolean hasItem = stack.contains(10);
```

### Clear the Stack
```java
stack.clear();
```

## Notes

- `empty()` is a method in the Stack class.
- `isEmpty()` is inherited from Vector, and often preferred in modern code.
- Stack is **thread-safe** as it extends `Vector`, which is synchronized.

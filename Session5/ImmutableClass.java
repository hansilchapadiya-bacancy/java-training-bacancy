package Session5;

import java.sql.Date;
import java.util.List;

/*

immutable class - static ,final, private
enum 
record
sealed class in interface
dynamic method for interface - cant use child method which are not in interface
arrys op

*/

/*

Why Immutability matters for us:
✔ thread-safe without synchronization
✔ caching becomes possible
✔ safe in collections (e.g., HashMap keys)
✔ reduces bugs in concurrent systems
✔ safe for functional programming
✔ safe for shared references


-> How to create immutable class

1) Make class final
2) Make fields final 
3) Make fields private
4) No setters
5) Initialize via constructor 
6) Deep Copy


| Feature  | Final                     | Immutable           |
| -------- | ------------------------- | ------------------- |
| Meaning  | cannot reassign reference | cannot change state |
| Where    | variable level            | object design level |
| Example  | final List                | String, Integer     |
| Mutation | allowed                   | not allowed         |


The state of the object is fixed for its entire lifetime. All wrapper classes (like Integer, Boolean, etc.) and the String class in Java are examples of immutable classes. 


*/

// An immutable class creates objects whose state (data) cannot change after creation.
public final class ImmutableClass {

    private final String name;
    private final int age;
    private final List<String> items;
    private final Date date;

    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
        this.items = null;
        this.date = null;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public final List<String> getItems() {
        return List.copyOf(items);
    }

    public final Date getDate() {
        return (Date) date.clone();
    }

    public static void main(String[] args) {

    }

}

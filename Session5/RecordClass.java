package Session5;

/*

Record = Compact immutable data class with automatic constructors, getters, equals, hashCode, and toString. Perfect for DTOs & microservices.


Properties of Records

✔ Implicit final fields
✔ Implicit private fields
✔ Implicit getters (called accessors)
✔ Implicit equals/hashCode
✔ Implicit toString
✔ Immutable by default

*/
public record RecordClass(String username, int age) {
}

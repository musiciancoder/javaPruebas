package inmutabilidad;

public class Person {

    /*
    ESTO ES DE COPILOT

    You just said on the last question that hashCode() and equals() methods are not indicators of immutability, ergo not indicators of state chagement, and yet
    previously you stated that one can override the equals() and hashCode() methods to compare the state of an object before and after a potential change,
    which seems like a contradiction. Please clarify.

I understand how that might seem contradictory at first glance, so let's clarify:
Key Distinctions:
Immutability:
Immutability is a property of an object's design, ensuring that its state cannot change after it is created. To determine if a class is immutable, we look at its
design (final class, final fields, no setters, constructor initialization, and defensive copying).

hashCode() and equals():
These methods are used to compare objects and determine if two objects are logically equivalent (equal in terms of their content).
Equals and HashCode for State Comparison: While equals() and hashCode() can be used to compare the current state of two objects, they do not, by themselves indicate
whether an object is immutable.

Checking State Change: You can use equals() to compare the state of an object before and after an operation to detect changes,
but this is a method of checking equality or state at a given time, not an indicator of immutability.

Summary:
Immutability: Ensures an object's state cannot change after creation. Determined by class design.
equals() and hashCode(): Useful for comparing states of objects at a given time. Can be used to detect state changes but not to determine immutability.

hashCode(): This method provides a compact numeric representation of an object's state. While changes in state typically result in changes to the hashCode(), this is
not a definitive test for all aspects of the object's immutability. Some changes might not affect the fields involved in hashCode(), particularly if additional
internal states aren't represented in the hash calculation.
equals(): Similarly, the equals() method checks logical equality. If equals() returns false after a state change, it means the object's externally exposed state has
changed. However, it doesn't confirm immutability of all internal states

   Provide an example were some changes might not affect the fields involved in hashcode.

Certainly! Let's illustrate a scenario where changes to an object's state don't necessarily affect the fields involved in its hashCode() calculation. This can happen
if the object contains internal states that are not considered when calculating the hashCode().

Example:
Suppose we have a class Person where the hashCode() method only takes into account the name and age fields, but there is an internal counter field that
tracks the number of updates to the object. Changes to this counter won't affect the hashCode().
     */

        private final String name;
        private final int age;
        private int updateCount;  // Internal state not used in hashCode()

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            this.updateCount = 0;
        }

        // Public method to simulate an update
        public void updateProfile() {
            // Increment the internal counter
            this.updateCount++;
        }

        public int getUpdateCount() {
            return updateCount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
        }

        @Override
        public int hashCode() { //notar q considera solo nombre y edad (o sea estados externos), pero no el estado interno updateCount
            int result = (name != null ? name.hashCode() : 0);
            result = 31 * result + age;
            return result;
        }

        public static void main(String[] args) {
            Person person = new Person("Alice", 30);

            System.out.println("Initial hashCode: " + person.hashCode());
            System.out.println("Initial update count: " + person.getUpdateCount());

            // Perform an update
            person.updateProfile();

            System.out.println("HashCode after update: " + person.hashCode());  // Should be the same
            System.out.println("Update count after update: " + person.getUpdateCount());  // Changed

            /*
            Notar q cambia el estado interno y el hashcode es el mismo, o sea el hashcode esta mostrando que no hubo cambio y sin embargo si lo hubo
            Initial hashCode: 12345678
            Initial update count: 0
            HashCode after update: 12345678 // Same as initial
            Update count after update: 1 // el estado interno cambio
             */
        }
    }




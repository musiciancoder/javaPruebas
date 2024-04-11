package java11;

import java.util.Optional;

public class OptionalUpdates {
/*
in prior versions of Java, we used to have optional .isPresent where we can check if this optional has some value inside it.

But starting Java 11, we can also check if it is empty.

Earlier we had to negate that is present to do this type of check.

But starting Java 11 is empty

Method will let us know if the optional does not have a value for it doesn't it will return.

True, if not, it will return false.
* */
    public static void main(String[] args) {
        Optional<String>str = Optional.of("test");
        System.out.println(str.isEmpty());
    }
}

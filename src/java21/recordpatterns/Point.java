package java21.recordpatterns;

/*
Record patterns, which were previewed in Java 19 and Java 20, are now fully integrated in Java 211
. They allow for more concise and readable code when working with records
In summary, the afterRecordPattern method leverages pattern matching to make the code more concise and readable, reducing redundancy and
improving clarity. This leads to cleaner and more maintainable code.
 */


public record Point(int x, int y) {}

class RecordPatternExample {
    public static int beforeRecordPattern(Object obj) {
        int sum = 0;
        if (obj instanceof Point p) {
            int x = p.x(); //notar q hay que hacer referencia a cada atributo del record, por lo q si fueran mas atributos seria mucho mas c
            int y = p.y();
            sum = x * y;
        }
        return sum;
    }

    public static int afterRecordPattern(Object obj) {
      /*  if (obj instanceof Point(int x, int y)) {  //como no tengo jdk-19 marca un error de compilacion
            return x * y; //menos verboso
        }*/
        return 0;
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println("Before Record Pattern: " + beforeRecordPattern(point)); // Output: 12
        System.out.println("After Record Pattern: " + afterRecordPattern(point));  // Output: 12
    }
}


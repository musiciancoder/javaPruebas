package herencia.polimorfismo.duda;

import java.sql.SQLOutput;

public class AcousticGuitar implements Guitar {
    @Override
    public void descriptionOfKind() {
        System.out.println(" I am an acoustic guitar");
    }

    public void descriptionOfShape(String shape) {
        System.out.println("This guitar's shape is " + shape);
    }
}

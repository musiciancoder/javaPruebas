package reflexion;

/*https://www.youtube.com/watch?v=bhhMJSKNCQY&t=795s

El paquete reflect (a menudo llamado coloquialmente "reflection") nos permite
inspeccionar y/o modificasr calquier atributo de clase, interfaces, variables y metodos en tiempo de ejecucion.
Es muy util cuando desconocemos nombre de algun componente de clase en tiempo de compilacion, o si queremos modificarlo.
Relentiza el tiempo de ejecución, por lo que solo se debe usar si es estrictamente necesario para averiguar algo desconocido en tiempo de compilacion.
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {


    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Stella",6);

        //myCat.setName("chica"); //!!!no podemos hacer esto
        Field[] catFields= myCat.getClass().getDeclaredFields();
        for (Field field:catFields) {
            System.out.println(field.getName());
            if (field.getName().equals("name")){
                field.setAccessible(true); //con esto podemos modificar el atributo, aunque sea privado y final
                field.set(myCat,"chica"); //checked exception

            }
        }

        //  myCat.heyThisIsPrivate(); // !!!no podemos hacer esto
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        // notar q con esto el programa no se cae
        for (Method method:catMethods
             ) {
            if (method.getName().equals("miau")){
                method.setAccessible(true); ////con esto podemos llamar el metodo, aunque sea privado
                method.invoke(myCat);
            }
        }

        // notar q con esto el programa no se cae.
        for (Method method:catMethods
        ) {
            if (method.getName().equals("thisIsAPublicStaticMethod")){
                method.setAccessible(true); ////con esto podemos llamar el metodo, aunque sea privado
                method.invoke(null);

            }
        }

        //para el private static funciona igual

        System.out.println(myCat.getName());
    }
}

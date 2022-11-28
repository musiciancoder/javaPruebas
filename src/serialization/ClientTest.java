package serialization;

import java.io.*;


//serializar primero siempre antes de deserializar para que funcione !!!!
public class ClientTest {

    public static void main(String[] args) {

        String fileName="employee.ser";
       serializeObject(fileName);
       // deserializeObject(fileName);
    }

    //pasamos de bytecode a objeto
    private static void deserializeObject(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))) {
        Object object= ois.readObject();
        Employee employee = (Employee)object;
            System.out.println(employee);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//pasamos de objeto a byte code
    private static void serializeObject(String filename) {
        Address address = new Address(111, "al1", "al2", "Vina", 650000);
        Employee employee = new Employee(1001, "kk", 30, "hghgh@gmail.com", "pass123", address);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
            oos.writeObject(employee);
            System.out.println("Object is serialized");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

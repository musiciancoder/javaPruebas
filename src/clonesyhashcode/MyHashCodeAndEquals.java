package clonesyhashcode;

public class MyHashCodeAndEquals {
    //Casos 0, 1 y 4 aconsejados; casos 2 y 3 desaconsejados
    //Caso 0: Objetos que son iguales debido a que lo estamos enunciando explicitamente en las referencias (Object object2= objec1). En este caso no necesitamos sobrescribir metodo equals ni hashcode, ya que JVM infiere que se trata del mismo objeto.
    //Caso 1: Clones: Objetos con los mismos atributos, pero que NO son equals y NO tienen el mismo hashcode. Se generan cuando NO sobrescribimos equals ni hashcode. El objeto NO es el mismo en memoria, es decir cada referencia apunta a un objeto diferente
    //Caso 2: Objetos con los mismos atributos, que SI son equals, pero que NO tienen el mismo hashcode. Se generan cuando sobrescribimos solo equals. Los objetos son los mismos en memoria, pero tienen diferentes hashcode. Es decir dos referencias apuntando al mismo objeto
    //Caso 3: Objetos con los mismos atributos, que NO son equals, pero que SI tienen el mismo hashcode. Se generan cuando sobrescribimos solo hashcode. Los objetos no son los mismos en memoria, pero tienen el mismo hashcode. Esto está altamente desaconsejado!
    //Caso 4: Objetos con los mismos atributos, que SI son equals, que SI tienen el mismo hashcode. Se generan cuando sobrescribimos ambos métodos. Los dos objetos son exactamente el mismo objeto.

    public static void main(String[] args) {

        //Caso 0
        Object object1 = new Object();
        Object object2= object1;
        System.out.println("object1: " + object1.hashCode() + " object2: " + object2.hashCode());
        Animal cebra1=new Animal(0,"hervivore","blackandwhite");
        Animal cebra2=cebra1;
        System.out.println("cebra1: " + cebra1.hashCode() + " cebra2: " + cebra2.hashCode());


        Animal leopard = new Animal(1,"carnivore","yellowandblack");
        Animal tiger = new Animal(1,"carnivore","yellowandblack");
        System.out.println("Hashcode leopard: " + leopard.hashCode());
        System.out.println("Hashcode tiger: " + tiger.hashCode());
        if (leopard.equals(tiger)){
            System.out.println("leopard equals tiger");
        }else {
            System.out.println("leopard NOT equals tiger");
        }

        System.out.println("");
    }


}

class Animal {
    private  int id;
    private String diet;
    private String colors;



    public Animal(int id, String diet, String colors) {
        this.id=id;
        this.diet = diet;
        this.colors = colors;
    }


    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=prime*result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj==null)
            return false;
            if(getClass()!=obj.getClass())
                return false;
            Animal other = (Animal)obj;
            if(id != other.id)
                return false;
            return true;
    }


}

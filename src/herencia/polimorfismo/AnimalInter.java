package herencia.polimorfismo;

//POLIMORFISMO EN INTERFACES
interface AnimalInter {
     void animalInterSound();
}

class DogInter implements AnimalInter {
    @Override
    public void animalInterSound() {
        System.out.println("The dog says: bow wow");
    }
}

    class PigInter implements AnimalInter{

        @Override
        public void animalInterSound() {
            System.out.println("The pig says: wee wee");

        }
    }

class MainTwo {
    public static void main(String[] args) {
AnimalInter myDogInter = new DogInter();
AnimalInter myPigInter = new PigInter();
AnimalInter myAnumalInter = new AnimalInter() { //notar que pide sobreescribir el método, es decir no se puede usar new con interface.
    @Override
    public void animalInterSound() {
        System.out.println("Aninal Makes a sound");
    }

};
myDogInter.animalInterSound();
myPigInter.animalInterSound();
myAnumalInter.animalInterSound();
    }
}


package ejercicios;

public class Potencias1 { //primera linea numero, segunda linea numero al cubo, tercera linea resta segunda - primera linea

    public static void main(String[] args) {
        int num= 7;
        int cubo =3;
        double doubleNum = (double) num;
        double potencia, resta;
        while (doubleNum<=10000){
            System.out.println(doubleNum);
            //double resultado = Math.pow(base, exponente)
            potencia = Math.pow(doubleNum,cubo);
            System.out.println(potencia);
            resta = potencia - doubleNum;

            doubleNum = resta;
        }
    }
}

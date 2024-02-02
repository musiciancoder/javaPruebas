package mystreams.interfazfuncionaltres;

@FunctionalInterface
public interface OperacionTres {

    double calcular (double n1, double n2);

    // double calcularDos (double n1, double n2); //error de compilacion, solo puede haber un metodo abstracto en una interfaz abstracta

    default double calcularTres(double n1, double n2){
        return n1*n2;
    }

    default double calcularCuatro(double n1, double n2){
        return n1-n2;
    }
}

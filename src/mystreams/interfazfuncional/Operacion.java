package mystreams.interfazfuncional;

@FunctionalInterface //Functional Interfaces are never implemented, but expressed as lambda functions instead
public interface Operacion {

    double calcular (double n1, double n2); //solo se menciona q se quiere hacer una operacion con n1 y n2, pero nunca se especifica qué operacion

    
}

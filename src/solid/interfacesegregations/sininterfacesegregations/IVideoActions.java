package solid.interfacesegregations.sininterfacesegregations;

public interface IVideoActions {

    //Notar q los metodos a implementar son para funcionalidades q no se relacionan entre si,
    //es decir esta interfaz tiene poca cohesion y hay q separar los metodos en interfaces distintas para cumplir el criterio de Interface Segregation.

    double getNumberOfHoursPlayed();

    void playRandomAd();

}

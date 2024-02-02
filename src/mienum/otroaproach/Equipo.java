package mienum.otroaproach;

 enum Equipo //esto tambien es un enum.
{
    BARSA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
    SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7);

    private String nombreClub;
    private int puestoLiga;

    private Equipo(String nombreClub, int puestoLiga){ //si definimos un constructor en un enum, este debe ser privado!!!
        this.nombreClub = nombreClub;
        this.puestoLiga = puestoLiga;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public int getPuestoLiga() {
        return puestoLiga;
    }

}

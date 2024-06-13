package ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaDeGuitarras {

    public static void main(String[] args) {
        List<Guitarra> listaGuitarras = new ArrayList<>();
        List<Colores>coloresFender = new ArrayList<>();
        coloresFender.add(new Colores("rojo"));
        coloresFender.add(new Colores("azul"));
        coloresFender.add(new Colores("negro"));
        List<Colores>coloresGibson = new ArrayList<>();
        coloresGibson.add(new Colores("verde"));
        coloresGibson.add(new Colores("azul"));
        coloresGibson.add(new Colores("rojo"));
        Guitarra stratocaster = new Guitarra(coloresFender,"Fender","Stratocaster");
        Guitarra telecaster = new Guitarra(coloresFender,"Fender","Telecaster");
        Guitarra lespaul = new Guitarra(coloresGibson,"Gibson","LesPaul");
        listaGuitarras.add(stratocaster);
        listaGuitarras.add(telecaster);
        listaGuitarras.add(lespaul);
        List<String> coloresRepetidos = new ArrayList<>();

  coloresRepetidos =  listaGuitarras.stream()
                .map(guitarra -> guitarra.getListaColores())
          .peek(listaColores-> System.out.println("list of : "+listaColores.toString()))
                .flatMap(listaColores->listaColores.stream())
                .map(color -> {
                    String c = color.getColor();
                    return c;
                }).collect(Collectors.toList());

        System.out.println(coloresRepetidos);

        Set<String> myset = new HashSet<>();
        myset = Set.copyOf(coloresRepetidos);


        for (String strSet:
             myset) {
            int counter =0;

            for (int i = 0; i < coloresRepetidos.size(); i++) {
                String color = coloresRepetidos.get(i);
                if (strSet.equals(color)) {
                    counter++;
                }
            }

            System.out.println(strSet + " is present " + counter + " times");

        }

    }

}

class Guitarra {
    private List <Colores> listaColores;
    private String marca;
    private String modelo;

    public Guitarra(List<Colores> listaColores, String marca, String modelo) {
        this.listaColores = listaColores;
        this.marca = marca;
        this.modelo = modelo;
    }

    public List<Colores> getListaColores() {
        return listaColores;
    }

    public void setListaColores(List<Colores> listaColores) {
        this.listaColores = listaColores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


class Colores {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Colores(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Colores{" +
                "color='" + color + '\'' +
                '}';
    }
}



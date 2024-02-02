package patronesdiseno.creacionales.singleton;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{ //ojo! que usando class en vez de enum no tendremos serializada la clase ni será thread-safe, por lo que si quisieramos usar programacion concurrente no funcionaria.

    static Singleton INSTANCE;

    public String str;

    private Singleton(){} //al usar class en vez de enum necesitamos un constructor vacio

    static Singleton getSingleInstance(){
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }


}
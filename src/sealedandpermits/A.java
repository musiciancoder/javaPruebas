package sealedandpermits;

//las superclases sealed son finales para todos excepto para los permits
sealed class A extends Thread implements Cloneable permits B,C{
}

//las subclases de la clase sealed deben ser obligatoriamente final,non-sealed o sealed
non-sealed class B extends A {

}

final class C extends A{

}

class D extends B{

}
//lo mismo para las clases es válido para las interfaces, solo que las subinterfaces no pueden ser final
sealed interface X permits Y{

}

non-sealed interface Y extends X{

}

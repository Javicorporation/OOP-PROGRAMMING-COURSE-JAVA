package com.prueba;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List lista1 = new ArrayList();
        lista1.add(1);
        lista1.add("hola");
        lista1.add(25);
        lista1.add(11.23);

//        for (Object o : lista1) {
//            System.out.println(o);
//        }

        // podemos usar una lamda para el foreach
        lista1.forEach(dato -> System.out.println(dato));

        // tamaño de la lista
        System.out.println(lista1.size());
        // lobtencion de un elemnto especifica de la lista
        System.out.println(lista1.get(0));
        // eliminamos un elemento de la lista especifica
        lista1.remove(0);

        // modificamos un elemento de la lista
        System.out.println(lista1.set(2,"vas"));

        System.out.println();
        System.out.println("lista actualizada");
        // podemos usar una lamda para el foreach
        lista1.forEach(dato -> System.out.println(dato));
    }


}


package Listas;

import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;

public class Listas {
  public static void main(String[] args) {
    List<String> lista = new ArrayList<String>(List.of("Hola","Que tal?","Estoy en Java"));
    System.out.println(lista.get(0));
    System.out.println(lista.get(1));
    System.out.println(lista.get(2));
    List<Integer> numeros = new ArrayList<Integer>(List.of(1,2,3,4));
    System.out.println(numeros.get(0));
    System.out.println(numeros.get(1));
    System.out.println(numeros.get(2));
    System.out.println(numeros.get(3));
    System.out.println();
    System.out.println("Modificamos el contenido de las listas con la orden nombrelista.set(posicion, valornuevo)");
    numeros.set(0,10);
    numeros.set(1,11);
    System.out.println("Modificamos la posicion 0 por 10 y la 1 por 11");
    System.out.println("Llamamos a la posicion 0 con numeros.get(0)\n" + numeros.get(0));
    System.out.println("Llamamos a la posicion 1 con numeros.get(1)\n" + numeros.get(1));
  }
}

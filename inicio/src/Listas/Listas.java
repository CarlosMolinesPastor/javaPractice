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
    System.out.println();
    System.out.println("Tamaño de la lista: " + numeros.size());
    System.out.println();
    numeros.add(0,20);
    System.out.println("Añadimos el en la posicion 0 el numero 20: numeros.add(0,20)");
    System.out.println("Tamaño de la lista: " + numeros.size());
    System.out.println("Posicion 0 de la lista: " + numeros.get(0));
    System.out.println();
    System.out.println("Vemos contains remove y clear");
    System.out.println("REMOVE: numeros.remove(0) para la posicion y Integer.valueOf(3) para eliminar la primera ocurrencia");
    System.out.println("Removemos la posicion 0 es decir el 20: numeros.remove(0);");
    numeros.remove(0);
    System.out.println("Tamaños de la lista: " + numeros.size());
    System.out.println("Numeros: " + numeros.get(0) + ", " + numeros.get(1) +", "+ numeros.get(2) + ", " + numeros.get(3));
    System.out.println("Eliminamos el numero 11: numeros.remove(Integer.valueOf(11));");
    numeros.remove(Integer.valueOf(11));
    System.out.println("Tamaños de la lista: " + numeros.size());
    System.out.println("Numeros: " + numeros.get(0) + ", " + numeros.get(1) +", "+ numeros.get(2));
  }
}

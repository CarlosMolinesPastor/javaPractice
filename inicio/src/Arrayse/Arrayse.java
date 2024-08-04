package Arrayse;

import java.util.Arrays;

// TipoDato[] NombreArrayVariable
public class Arrayse {
  public static void main(String[] args) {
    String cadenaEspacios = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
    String[] arrayCadenas = cadenaEspacios.split(" ");
    System.out.println("Cadena original: " + cadenaEspacios);
    System.out.println(arrayCadenas[0]);
    System.out.println(arrayCadenas[1]);
    System.out.println(arrayCadenas[2]);
    System.out.println(arrayCadenas[3]);
    System.out.println(arrayCadenas[4]);
    System.out.println(arrayCadenas[5]);
    System.out.println(arrayCadenas[6]);
    System.out.println();
    System.out.println("Recorriendo el array con un bucle for");
    for (int i = 0; i < arrayCadenas.length; i++) {
      System.out.println("Posición: " + i + " Valor: " + arrayCadenas[i]);
    }
    System.out.println();
    System.out.println("Recorriendo el array con un bucle for each");
    for (String cadena : arrayCadenas) {
      System.out.println("Valor: " + cadena);
    }
    System.out.println();
    System.out.println("Recorriendo el array con un bucle while");
    int i = 0;
    while (i < arrayCadenas.length) {
      System.out.println("Posición: " + i + " Valor: " + arrayCadenas[i]);
      i++;
    }
    System.out.println();
    System.out.println("Recorriendo el array con un bucle do while");
    i = 0;
    do {
      System.out.println("Posición: " + i + " Valor: " + arrayCadenas[i]);
      i++;
    } while (i < arrayCadenas.length);
    System.out.println();
    String cadena = "2,9,5,7,1,34,12,0";
    Integer[] arrayCadenas2 = { 2, 9, 5, 7, 1, 34, 12, 0 };
    // Realizamos operaciones con el array
    System.out.println("Mostramos arrayCadenas2: " + cadena);
    System.out.println();
    Arrays.sort(arrayCadenas2);
    String numeros = "";
    for (int j = 0; j < arrayCadenas2.length; j++) {
      // numeros += arrayCadenas2[j].toString() + ", ";
      numeros = numeros + arrayCadenas2[j].toString() + ",";
    }
    System.out.println("Array ordenado: " + numeros);
    System.out.println();
    System.out.println("Buscamos un número en el array, introduce un numero");
    Integer numeroArray = Integer.parseInt(System.console().readLine());
    int contador = 0;
    for (int x = 0; x < arrayCadenas2.length; x++) {
      if (arrayCadenas2[x] == numeroArray) {
        contador++;
      }
    }
    if (contador > 0) {
      System.out.println("El número " + numeroArray + " está en el array");
    } else {
      System.out.println("El número " + numeroArray + " no está en el array");
    }
    // Otra forma de buscar un número en un array
    // if (Arrays.asList(arrayCadenas2).indexOf(numeroArray) != -1) {
    // System.out.println("El número " + numeroArray + " está en el array");
    // } else {
    // System.out.println("El número " + numeroArray + " no está en el array");
    // }
    System.out.println("Pulsa enter para salir");
    System.console().readLine();
  }
}

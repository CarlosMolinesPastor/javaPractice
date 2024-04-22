package Booleanos;

import static java.lang.System.out;

public class Booleanos {
  public static void main(String[] args) {
    out.println("#### Booleanos ####");
    out.println("Introduce un numero1 entero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    out.println("Introduce un numero2 entero: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    boolean verdad = (numero2 == numero1);
    if (numero1 == numero2) {
      out.println("El valor de numero1 == numero2 = " + verdad);
    } else if (numero1 > numero2) {
      out.println("El valor de el numero1 es mayor que el numero2");
    } else
      out.println("El numero2 es mayor que el numero1");
  }
}

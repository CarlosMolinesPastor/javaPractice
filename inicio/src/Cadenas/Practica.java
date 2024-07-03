package Cadenas;

// Cadenas inputs con correccion de errores 
public class Practica {
  public static void main(String[] args) {
    System.out.println("Introduce tu nombre");
    String nombre = System.console().readLine();
    System.out.println("Cuantos años tienes?");
    String anyos = System.console().readLine();
    Integer numAnyos = null;
    while (numAnyos == null) {
      try {
        numAnyos = Integer.parseInt(anyos);
      } catch (Exception e) {
        System.out.println("Debes elegir un numero entero " + e);
        anyos = System.console().readLine();
      }
    }
    System.out.println("Selecciona tu equipo de futbol \n1. Barcelona\n2. Real Madrid");
    String equipo = System.console().readLine();
    Integer opcionEquipo = null;
    while (opcionEquipo == null)
      try {
        opcionEquipo = Integer.parseInt(equipo);
        if (opcionEquipo != 1 && opcionEquipo != 2) {
          opcionEquipo = null;
          System.out.println("Debes introducir 1 o 2");
          equipo = System.console().readLine();
        }
      } catch (Exception e) {
        System.out.println("Debes introducir 1 o 2" + e);
        equipo = System.console().readLine();
      }
    if (opcionEquipo == 1) {
      equipo = "eres del mejor club del mundo";
    } else {
      equipo = "buscate otro equipo, waltrapa";
    }
    System.out.println("Tu nombre es " + nombre + " tienes " + anyos + " de edad y " + equipo);
  }
}

package Cadenas;

public class Cadenas {
  public static void main(String[] args) {
    System.out.println("\n### Metodos Propios de los Strings ###");
    String cadena = "Me encanta Java, es una pasada";
    System.out.println("Cadena Original: " + cadena);
    System.out.println("Lenght: " + cadena.length());
    String cadenaUP = cadena.toUpperCase();
    System.out.println("toUpperCase: " + cadenaUP);
    String cadenaLC = cadena.toLowerCase();
    System.out.println("toLowerCase: " + cadenaLC);
    System.out.println("### Concat y Format");
    String cadena1 = "Esta es la cadena primera";
    String cadena2 = "Esta es la cadena segunda";
    String cadena3 = "Esta es la cadena tercera";
    String cadenaMulti1 = cadena1.concat("\n");
    cadenaMulti1 = cadenaMulti1.concat(cadena2);
    cadenaMulti1 = cadenaMulti1.concat("\n");
    cadenaMulti1 = cadenaMulti1.concat(cadena3);
    String cadenaMulti2 = cadena1 + "\n" + cadena2 + "\n" + cadena3;
    System.out.println(cadenaMulti1);
    System.out.println();
    System.out.println(cadenaMulti2);
    System.out.println();
    String cadena4 = "La cadena tiene %s lineas.\nLa primera la ha escrito %s.\nLa segunda la ha escrito %s.";
    String cadenaFinal = String.format(cadena4, 3, "Carlos", "Pere");
    System.out.println(cadenaFinal);
    System.out.println();
    System.out.println("### startsWith endsWith equals -> Devuelve Booleano, true or false ###");
    String booleano = "Hola";
    System.out.println("Cadena de prueba: Hola");
    System.out.println("Empieza por \"Ho\"??: " + booleano.startsWith("Ho"));
    System.out.println("Empieza por \"ho\"?: " + booleano.startsWith("ho"));
    System.out.println("Termina por \"La\"?: " + booleano.endsWith("La"));
    System.out.println("Termina por \"la\"?: " + booleano.endsWith("la"));
    System.out.println("Es igual a \"Hola\"?: " + booleano.equals("Hola"));
    System.out.println("Es igual a \"hola\"?: " + booleano.equals("hola"));
  }
}

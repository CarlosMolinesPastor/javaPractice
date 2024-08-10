package Bloques;

public class miif {
    public static void main(String[] args){
        System.out.println("###### Vamos a estudiar el bloque if #######");
        System.out.println();
        System.out.println("El bloque if es una estructura de control que nos permite ejecutar un bloque de codigo si se cumple una condicion");
        String nombre = System.console().readLine("Introduce tu nombre: ");
            if (nombre.equals("Carlos")){
                System.out.println("Hola Carlos, bienvenido al sistema");
            } else {
                System.out.println("No eres Carlos, no puedes entrar");
            }
        int numero = Integer.parseInt(System.console().readLine("Escribe un numero menor de 10: "));
            if (numero > 10){
                System.out.println("EL numero introducido es mayor de 10");
            }
            else{
                System.out.println("El numero introducido es correcto: " + numero);
            }
       System.out.println();
       System.out.println("##### Vamos a estudiar el bloque switch case ######");
       System.out.println();
       String guapo = System.console().readLine("Eres guapo? (si/no): ");
       switch (guapo) {
        case "si":
            System.out.println("Eres guapo, enhorabuena");
            break;
        case "no":
            System.out.println("No eres guapo, no pasa nada");
            break;
        default:
            System.out.println("No has contestado correctamente");
            break;
       }
    }
}

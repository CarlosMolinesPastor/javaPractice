package Numeros;

public class Numeros {
    public static void main(String[] args){
        System.out.println("##### SUMA ENTERA #####");
        System.out.print("Primer sumando (ENTERO):");
        int sumando1 = Integer.parseInt(System.console().readLine());
        System.out.print("Segundo sumando (ENTERO):");
        int sumando2 = Integer.parseInt(System.console().readLine());
        int resultado1 = sumando1 + sumando2;
        System.out.println("La suma de " + sumando1 + " + " + sumando2 + " = " + resultado1);
        System.out.println("##### SUMA REAL #####");
        System.out.print("Primer sumando (REAL):");
        float sumando3 = Float.parseFloat(System.console().readLine());
        System.out.print("Segundo sumando (REAL):");
        float sumando4 = Float.parseFloat(System.console().readLine());
        float resultado2 = sumando3 + sumando4;
        System.out.println("La suma de " + sumando3 + " + " + sumando4+ " = " + resultado2);
        System.out.println("\n El resto de operaciones serian igual que estas\n");
        System.out.println("##### MODULO O RESTO #####");
        System.out.print("Introduce dividendo (ENTERO):");
        int dividendo = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce divisor (ENTERO):");
        int divisor= Integer.parseInt(System.console().readLine());
        int moduloEntero = dividendo % divisor;
        float moduloDecimal = dividendo % divisor;
        System.out.println("EL resultado entero del modulo es :" + moduloEntero);
        System.out.println("EL resultado decimal del modulo es :" + moduloDecimal);

    }
}

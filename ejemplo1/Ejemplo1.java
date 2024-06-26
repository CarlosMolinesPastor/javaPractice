
// Programa puramente usuario que utiliza la clase geometria
// Importa la clase geometria
import java.util.Vector;
//importamos la clase Graphics
import java.awt.*;

//Creamos la clase Ejemplo1
class Ejemplo1 {
  // Creamos la clase estatica main
  public static void main(String[] args) throws InterruptedException {
    // Imprimimos sentencia que cxomienza main
    System.out.println("Comienza main()...");
    Circulo c = new Circulo(2.0, 2.0, 4.0);
    // Creamos un objeto de la clase Circulo
    Circulo c1 = new Circulo(1.0, 2.0, 2.0);
    Circulo c2 = new Circulo(0.0, 0.0, 3.0);
    // Al circulo se le da el valor o el suyo o el que se compara con el c1 y se le
    // da el mayor.
    c = c1.elMayor(c2);
    System.out.println("El mayor radio es " + c.r + ".");
    c = new Circulo(); // c.r = 0.0;
    //
    c = Circulo.elMayor(c1, c2);
    System.out.println("El mayor radio es " + c.r + ".");
    VentanaCerrable ventana = new VentanaCerrable("Ventana abierta al mundo...");
    ArrayList v = new ArrayList();
    CirculoGrafico cg1 = new CirculoGrafico(200, 200, 100, Color.red);
    CirculoGrafico cg2 = new CirculoGrafico(300, 200, 100, Color.blue);
    RectanguloGrafico rg = new RectanguloGrafico(50, 50, 450, 350, Color.green);
    v.add(cg1);
    v.add(cg2);
    v.add(rg);
    PanelDibujo mipanel = new PanelDibujo(v);
    ventana.add(mipanel);
    ventana.setSize(500, 400);
    ventana.setVisible(true);
    System.out.println("Termina main()...");
  } // fin de main()
} // fin de class Ejemplo1

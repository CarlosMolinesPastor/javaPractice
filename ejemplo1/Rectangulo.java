// fichero Rectangulo.java
public class Rectangulo extends Geometria {
  // Deninimos variables primero estatica y privada
  private static int numRectangulos = 0;
  // variables protegidas solo la clase y las que deriven de esta pueden acceder
  protected double x1, y1, x2, y2;

  // Constructor general de la clase publico para tener acceso desde fuera
  public Rectangulo(double p1x, double p1y, double p2x, double p2y) {
    x1 = p1x;
    y1 = p1y;
    x2 = p2x;
    y2 = p2y;
  }

  // Constructor secundario de la clase Rectangulo
  public Rectangulo() {
    this(0, 0, 1.0, 1.0);
  }

  // Definicion de metodos de la clase Geometria con los datos propios del
  // Rectnagulo, hacemos un override
  public double perimetro() {
    return 2.0 * ((x1 - x2) + (y1 - y2));
  }

  public double area() {
    return ((x1 - x2) * (y1 - y2));
  }
}

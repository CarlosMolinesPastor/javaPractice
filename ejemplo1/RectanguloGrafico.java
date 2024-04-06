import java.awt.Graphics;
import java.awt.Color;

class RectanguloGrafico extends Rectangulo implements Dibujable {
  // nueva variable
  Color color;

  // Constructor
  public RectanguloGrafico(double x1, double y1, double x2, double y2, Color unColor) {
    // Llmaada al constructor del Rectangulo mediente super ya que llamamos a la
    // superclase
    super(x1, y1, x2, y2);
    // Le damos el valor a la variable esta de color a la que le pasamos
    this.color = unColor;
  }

  // Metodos de la interfaz
  // Metodo de dibujar
  public void dibujar(Graphics dw) {
    // Metodo de Graphics que seleccioan un color en este caso el definido
    dw.setColor(color);
    // dw.drawRect()metodo que pasa a enteros las posciones y la anchuara y la
    // altura
    dw.drawRect((int) x1, (int) y1, (int) (x2 - x1), (int) (y2 - y1));
  }

  public void setPosicion(double x, double y) {
    ; // Metodo vacion pero necesario porque
    // tienen que estar los metodos de la interfaz
  }
}

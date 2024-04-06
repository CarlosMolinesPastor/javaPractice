
//Importamos java.awt.Graphics
import java.awt.Graphics;

//Java no permite que herede de dos clases diferentes, por lo que las interfaces java
//suplen en parte este problema.
//Implica un tipo de valor de retorno (interfaz Dibujable seguido de metodos entre parentesis)
//Las interfaces no estan sujetas a los mismos parametros que las clases abstractas
//Es decir se puede heredar de varias interfaces al mismo timepo
public interface Dibujable {
  // Tiene dos metodos el de la posicion que se le pasa dos ubicaciones
  // y el metodo dibujar que se le pasa un objeto graficos, por lo que
  // si se implementa la interfaz en circulo y rectangulo se podran dibujar
  public void setPosicion(double x, double y);

  public void dibujar(Graphics dw);
}

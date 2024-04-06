public class Circulo extends Geometria {
  // Creamos una varible que en este caso no le hemos puesto su visibilidad
  // por lo que sera su visibilidad package es decir que solo podra ser usada por
  // las clases que esten en el mismo directorio de la clase Circulo
  static int numCirculos = 0;
  // En este caso la poner static final significa que es una constante publica ,
  // ed decir
  // que podra ser accedida desde fuera
  public static final double PI = 3.14159265358979323846;
  public double x, y, r;

  // Creamos el constructor, x es el argumento del constructor por lo que
  // tendriamos problemas
  // a no ser que utilizamos la palabra this que se refiere a la variable del
  // miembro y asi no se destruye
  // al salir del loque de codigo.
  public Circulo(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  // Creamos otros tres constructores secundarios, metodos sobrecargados, los tres
  // tienen el papel de
  // llamar al constructor principal lo que hace con la palabre this
  // Primer constructor que se le pasa el radio
  public Circulo(double r) {
    this(0.0, 0.0, r);
  }

  // Segundo constructor, se le ppasa un circulo
  public Circulo(Circulo c) {
    this(c.x, c.y, c.r);
  }

  // Tercer constructor
  public Circulo() {
    this(0.0, 0.0, 1.0);
  }

  // Metodos de Geometria
  public double perimetro() {
    return 2.0 * PI * r;
  }

  public double area() {
    return PI * r * r;
  }

  // Metodo para averiguar el circulo elMayor
  public Circulo elMayor(Circulo c) {
    if (this.r >= c.r) {
      return this;
    } else {
      return c;
    }
  }

  // Metodo de la clase para comparar Circulos. Se devuelve un nombre no el objeto
  // en si
  public static Circulo elMayor(Circulo c, Circulo d) {
    if (c.r >= d.r)
      return c;
    else
      return d;
  }
}

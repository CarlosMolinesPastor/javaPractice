package Diccionarios;

import java.util.HashMap;

public class Diccionarios {
   public static void main(String[] args){
       System.out.println("#### Estudiamos los diccionarios ####");
       System.out.println();
       System.out.println(" ## Metodos para los diccionarios: ##");
       System.out.println(" # put: Añade elementos, palabra clave + elemento");
       System.out.println(" # get: Obtiene el valor pasando la clave");
       System.out.println(" # size: Numero de elementos`");
       System.out.println(" # containsKey: devuelve true/false si el diccionario tiene algun \n elemento con la clave indicada");
       System.out.println(" # containsValue: devuelve true/false si el diccionario contiene el valor indicado");
       System.out.println(" # remove: eleimina el valor de la clave indicada");
       System.out.println(" # clear: elimina todos los elementos del diccionario");
       System.out.println();
       HashMap<String,String> diasIngles = new HashMap<String, String>();
       System.out.println(" Creamos diccionario diasIngles y insertamos los dias de la semana\n HashMap<String,String> diasIngles = new HashMap<String, String>();\n  diasIngles.put('diasCastellano', 'diasenIngles')");
       diasIngles.put("Lunes", "Monday");
       diasIngles.put("Martes", "Tuesday");
       diasIngles.put("Miercoles", "Wednesday");
       diasIngles.put("Jueves","Thursday");
       diasIngles.put("Viernes", "Friday");
       diasIngles.put("Sabado", "Saturday");
       diasIngles.put("Domingo", "Sunday");
       System.out.println(" Tamaño del diccionario: " + diasIngles.size() );
       System.out.println(" Esta el viernes??: containsKey('Viernes') -->" + diasIngles.containsKey("Viernes"));
       System.out.println(" Esta el Sunday??: containsVelue('Sunday') -->" + diasIngles.containsValue("Sunday"));
       System.out.println("Eliminamos el domingo y preguntamos si esiste el valor del Sunday \n diasIngles.remove(´Domingo´);");
       diasIngles.remove("Domingo");
       System.out.println(" Esta el Sunday: -->" + diasIngles.containsValue("Sunday"));
       System.out.println();
       System.out.println(" Borramos el diccionario: clear");
       diasIngles.clear();
       System.out.println(" Tamaño del diccionario: " + diasIngles.size());
   }
}

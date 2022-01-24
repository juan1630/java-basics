
package javaapplication1;

public class JavaApplication1 {

    //metodo main que ejecuta la clase
    public static void main(String[] args) {

        System.out.println("Hola mundo");
        int variableEntera = 20;
        
        System.out.println(variableEntera);
            variableEntera = 25;      
        System.out.println(variableEntera);
        // variable del tipo String
        String variableCadena = "Juanito 12";
        System.out.println(variableCadena);
        
        variableCadena = "Adios";
                
          System.out.println(variableCadena);
          
          /*
            Var infiere el valor de la variable deacuerdo a la asignacion de los valores de la variable
          */
          
          var numerosFeos = 10;
          System.out.println(numerosFeos );
          
          var cadenaDos = "Cadena 2";
          
          System.out.println(cadenaDos);
          System.out.println("cadenaDos = " + cadenaDos);
    }
    
}


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
          
          /*
            nombres de variables 
          */
          
          var miVariable =  1;
          var _miVariable = 2;
          
          var $miVariable = 3;
          
          System.out.println(miVariable);
          System.out.println(_miVariable);
          System.out.println($miVariable);
          
          /*
          No usar caracteres especiales al inicio
          No usar acentos 
          */
          
          /*
            Concatenar variables 
          */    
          
          var usuario = "Juan";
          var saludo = "Hola";
          var saludos  =  saludo+ " " + usuario + " ";
          
          System.out.println("saludos = " + saludos);
          
          var i = 2;
          var j = 3;
          
          System.out.println(i+j); 
        // suma de numeros enteros
        System.out.println( i+j + saludos );
        System.out.println( saludos+ i+j);
        // concatena los numeros de las varibales
        
        System.out.println( saludos + (i+j) );
        // los parentesis indican que la suma se hara primero
    }
    
}

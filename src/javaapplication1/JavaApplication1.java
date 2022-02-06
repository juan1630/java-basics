
package javaapplication1;

//Imports 

import java.util.Scanner;

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
        
        var nombre2 = "Karla";
        System.out.println(nombre2);
        //salto de linea con el caracter "\n"
        System.out.println("Nueva linea de codigo:  \n" + nombre2);
        System.out.println("Con tabulador: \t" + nombre2);
        // agrega un tab a los caracteres que le siguen
        System.out.println("Retroceso: \b " + nombre2 );
        // quita el espacio en blanco
        System.out.println("Comillas simples \'" + nombre2 + "\'");
        // agrega las comillas simples al valor de la variable
        
        System.out.println("Comillas dobles: \" " + nombre2 + " \"" );
        // comillas dobles con el carcter de escape
        
        /*
            Clase scanner 
        */
       
        
        System.out.println("Ingresa tu nombre: ");
        Scanner consola =  new Scanner(System.in);
        var usuario2 = consola.nextLine();
        //lee la informacion de la consola
        //asigna el valor ingresado a la varibale usuario2
        System.out.println("usuario2 = " + usuario2);
           
        System.out.println("Ingresa un titulo: ");
        var titulo2  =  consola.nextLine();
        System.out.println("El resultado es: " + usuario2 +" " + titulo2 );
     
        /*
            TIPOS PRIMITIVOS DE DATOS ENTEROS
        
            byte, short , int, long  
        */
        
        
        
        byte numeroByte = (byte)129;
        // no se pude asignar el valor 129 a un byte
        // convertimos el valor de tipo entero de 129 a un byte
        // no se recomienda usar este tipo de sintaxis
        System.out.println(numeroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE );
        System.out.println("Valor minimo del byte: " + Byte.MAX_VALUE );
        
        //el tipo de dato short alamcena hasta 16 bits
        short  numeroShort  =10;
        
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El numero menor es: " + Short.MIN_VALUE );
        System.out.println("El numero mayor es: " + Short.MAX_VALUE);
      
        // numeros de tipo entero
         int numeroInt2 = (int)2147483649L;
         //se convierte a tipo long 
        //los int no se pueden convertir de este manera  (int) 2147483648
        System.out.println(numeroInt2);
        int numeroInt = 21474830;
        
        System.out.println("numeroInt = " + numeroInt);
        
        System.out.println("El numero menor es: " + Integer.MIN_VALUE );
        System.out.println("El numero mayor es: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        
        System.out.println("numero long = " + numeroLong);
       
        System.out.println("El numero menor es: " + Long.MIN_VALUE );
        System.out.println("El numero mayor es: " + Long.MAX_VALUE);
        
        
        /*
            Tipos primitivos de los flotantes
        
            float y double
                el tipo de dato float almacena valores mas grandes que del tipo long 
        Si se sobre pasa el valor de tipo float arroja por defecto el valor de Infinity

        */
       
        float numeroFlotante = 10.0F;
        // la F indica que es de un tipo flotante 
        System.out.println("numeroFlotante = " + numeroFlotante);
        
        float numeroFloante2  = (float)10.0;
        System.out.println("numeroFloante2 = " + numeroFloante2);
        System.out.println( "Valor minimo de la clase float: " + Float.MIN_VALUE );
        System.out.println( "Valor maximo de la clase float: " + Float.MAX_VALUE );
        
        /*
            Tipo double
        */
        
        double numeroDoble = 20;
        System.out.println("numeroDoble = " + numeroDoble);
        System.out.println( "Valor minimo de la clase double: " + Double.MIN_VALUE );
        System.out.println( "Valor maximo de la clase double: " + Double.MAX_VALUE );
        
        var numeroEntero3 = 10;
        System.out.println("numeroEntero3 = " + numeroEntero3);
        /*
            Toma el tipo de dato entero
        */
        
        var numeroDoubleDebug = 20.02;
        System.out.println("numeroDoubleDebug = " + numeroDoubleDebug);
        
        
        /*
            Tipo de dato char
        */
        
        char miCaracter = 'a';
        
        System.out.println(miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        // como se declara la varibale de tipo char convierte el valor decimal a un valor char
        
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        
        var varChar1 = '\u0021';
        System.out.println("varChar = " + varChar1);
        
        // no se puede asignar el valor directamente 
        var varCharDecimal1 = 33;
        // como se declara la varibale de tipo char convierte el valor decimal a un valor char
        
        System.out.println("varCharDecimal = " + varCharDecimal1);
        // infiera el tipo int
        
        var varCharSimbolo1 = '!';
        
        System.out.println("varCharSimbolo = " + varCharSimbolo1);
        
        int variableEnterADecimal =  '!';
        // convierte el valor del tipo char al valor del tipo decimal
        System.out.println("variableEnterADecimal = " + variableEnterADecimal);
    }
    
}

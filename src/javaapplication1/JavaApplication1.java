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
        System.out.println(numerosFeos);

        var cadenaDos = "Cadena 2";

        System.out.println(cadenaDos);
        System.out.println("cadenaDos = " + cadenaDos);

        /*
            nombres de variables 
         */
        var miVariable = 1;
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
        var saludos = saludo + " " + usuario + " ";

        System.out.println("saludos = " + saludos);

        var i = 2;
        var j = 3;

        System.out.println(i + j);
        // suma de numeros enteros
        System.out.println(i + j + saludos);
        System.out.println(saludos + i + j);
        // concatena los numeros de las varibales

        System.out.println(saludos + (i + j));
        // los parentesis indican que la suma se hara primero

        var nombre2 = "Karla";
        System.out.println(nombre2);
        //salto de linea con el caracter "\n"
        System.out.println("Nueva linea de codigo:  \n" + nombre2);
        System.out.println("Con tabulador: \t" + nombre2);
        // agrega un tab a los caracteres que le siguen
        System.out.println("Retroceso: \b " + nombre2);
        // quita el espacio en blanco
        System.out.println("Comillas simples \'" + nombre2 + "\'");
        // agrega las comillas simples al valor de la variable

        System.out.println("Comillas dobles: \" " + nombre2 + " \"");
        // comillas dobles con el carcter de escape

        /*
            Clase scanner 
         */
        System.out.println("Ingresa tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario2 = consola.nextLine();
        //lee la informacion de la consola
        //asigna el valor ingresado a la varibale usuario2
        System.out.println("usuario2 = " + usuario2);

        System.out.println("Ingresa un titulo: ");
        var titulo2 = consola.nextLine();
        System.out.println("El resultado es: " + usuario2 + " " + titulo2);

        /*
            TIPOS PRIMITIVOS DE DATOS ENTEROS
        
            byte, short , int, long  
         */
        byte numeroByte = (byte) 129;
        // no se pude asignar el valor 129 a un byte
        // convertimos el valor de tipo entero de 129 a un byte
        // no se recomienda usar este tipo de sintaxis
        System.out.println(numeroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor minimo del byte: " + Byte.MAX_VALUE);

        //el tipo de dato short alamcena hasta 16 bits
        short numeroShort = 10;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El numero menor es: " + Short.MIN_VALUE);
        System.out.println("El numero mayor es: " + Short.MAX_VALUE);

        // numeros de tipo entero
        int numeroInt2 = (int) 2147483649L;
        //se convierte a tipo long 
        //los int no se pueden convertir de este manera  (int) 2147483648
        System.out.println(numeroInt2);
        int numeroInt = 21474830;

        System.out.println("numeroInt = " + numeroInt);

        System.out.println("El numero menor es: " + Integer.MIN_VALUE);
        System.out.println("El numero mayor es: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;

        System.out.println("numero long = " + numeroLong);

        System.out.println("El numero menor es: " + Long.MIN_VALUE);
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

        float numeroFloante2 = (float) 10.0;
        System.out.println("numeroFloante2 = " + numeroFloante2);
        System.out.println("Valor minimo de la clase float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de la clase float: " + Float.MAX_VALUE);

        /*
            Tipo double
         */
        double numeroDoble = 20;
        System.out.println("numeroDoble = " + numeroDoble);
        System.out.println("Valor minimo de la clase double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de la clase double: " + Double.MAX_VALUE);

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

        int variableEnterADecimal = '!';
        // convierte el valor del tipo char al valor del tipo decimal
        System.out.println("variableEnterADecimal = " + variableEnterADecimal);

        /*
            Tipos de datos primitivos booleanos 
        
                Solo almacena los tipos true o false    
                Tambien se les conoce como tipos de dato bandera
         */
        //asignacion
        boolean varBoolean = false;

        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es de tipo verdadera");
        } else {
            System.out.println("La bandera es de tipo false");
        }

        var edadPersona = 3;

        // var esAdulto = edadPersona >= 18;
        if (edadPersona >= 18) {
            System.out.println("La persona es adulta");
        } else {
            System.out.println("La persona NO es adulta");
        }

        var edadString = Integer.parseInt("20");
        System.out.println("edadString = " + (edadString + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + (valorPI + 1));

        // con la clase scanner
        var consola2 = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        edadString = Integer.parseInt(consola.nextLine());
        System.out.println(" edad = " + (edadString + 1));

        var edadTexto = String.valueOf(edadString);
        // convierte a texto
        System.out.println("edadTexto = " + edadTexto);

        // convertir a tipo char
        var caracter3 = "hola".charAt(0);
        // cortamos la cadena 
        System.out.println("caracter3 = " + caracter3);

        System.out.println("Proporciona la cadena: ");

        var consolaChart = new Scanner(System.in);
        caracter3 = consolaChart.nextLine().charAt(0);
        System.out.println("consolaChart = " + caracter3);

        /*
            
                Tarea 1
         */
        System.out.println("Ingresa el nombre");
        var consolaNombre = new Scanner(System.in);
        var consolaResp = consolaNombre.nextLine();

        System.out.println("Ingresa el ID del producto");
        var consolaIdProdcuto = new Scanner(System.in);
        var idProductoResp = consolaIdProdcuto.nextLine();
        System.out.println("Ingresa el precio");
        var consolaPrecio = new Scanner(System.in);
        var consolaPrecioResp = consolaPrecio.nextLine();

        System.out.println("Ingresa el envio");
        var consolaEnvioGratis = new Scanner(System.in);
        var consolaEnvioResp = consolaEnvioGratis.nextLine();

        System.out.println(consolaResp);
        System.out.println(idProductoResp);
        System.out.println(consolaPrecioResp);
        System.out.println(consolaEnvioResp);

        /*
        var a = 3;
        var b = 10;
         */
        // para usar var se deben de declarar la variables por separado
        int a = 3, b = 10;

        var resultado = a + b;
        // suma 

        System.out.println("resultado de la suma  = " + resultado);

        var resultadoResta = a - b;
        System.out.println("resultado de la resta = " + resultadoResta);

        resultadoResta = a * b;

        System.out.println("resultadoResta = " + resultadoResta);

        var resultadoResta2 = a / b;
        //la variable siempre se queda con el tipo de dato con el que se inicializo
        System.out.println("Resultado de la division = " + resultadoResta2);

        //operador de modulo 
        resultadoResta = a % b;
        System.out.println("resultadoResta modulo = " + resultadoResta);

        if (a % 2 == 0) {
            // si solo hay una linea dentro del if se omiten las llaves
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }

        int a1 = 3, b1 = 5;

        int c = a1 + 5 - b1;

        System.out.println("c = " + c);

        // operador de  incremento
        a++;

        //operador de composicion
        a1 += 1;

        System.out.println("a1 = " + a1);

        a1 += 3;

        System.out.println("a1 = " + a1);

        a1 -= 3;

        System.out.println("a1 = " + a1);

        a1 *= 3;

        System.out.println("a1 = " + a1);

        a1 /= 3;

        System.out.println("a1 = " + a1);

        /*
            Variables unarias
         */
        var a2 = 3;
        var b2 = -a2;
        //hace el cambio de signo
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

        var c1 = true;
        var d = !c1;
        //simbolo de negacion

        System.out.println("d = " + d);
        // solo aplica para tipos boolean

        /*
            Operadores de incremento 
            -   operadores de pre incremento
                Aumenta primero el valor y despues se usa la variable
            -   operadores de incremento 
                Aumenta el valor de la variable despues de hacer el uso de la variable 
         */
        var e = 3;
        var f = ++e;

        System.out.println("f = " + f);

        var g = 6;
        var h = g++;

        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //decremento, dismuye en 1 el valor de la variable
        var z = 2;
        var x = --z;

        System.out.println("z = " + z);
        System.out.println("x = " + x);

        var k = 4;
        var l = k--;

        System.out.println("k = " + k);
        System.out.println("l = " + l);

        var a3 = 2;
        var b3 = 3;

        var c3 = a3 == b3;

        System.out.println("c3 = " + c3);

        var d3 = (a3 != b3);

        System.out.println("d3 = " + d3);

        var cadena1 = "Hola";
        var cadena2 = "Adios";

        var e3 = cadena1.equals(cadena2);
        //comparamos el contenido de la cadena 

        System.out.println("e3 = " + e3);

        var g3 = a3 > b3;
        System.out.println("g3 = " + g3);

        var g4 = a3 < b3;
        System.out.println("g4 = " + g4);

        /*
            Verificamos que el numero sea par 
         */
        if (a3 % 2 == 2) {
            System.out.println("Es par");
        } else {
            System.out.print("No es par");
        }

        var edad3 = 30;

        if (edad3 >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("ES mneor de edad");
        }

        /*
            Operadores condicionales 
         */
        var a5 = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado5 = a >= valorMinimo && a <= valorMaximo;

        System.out.println(resultado5);

        if (resultado5) {
            System.out.println("Dentro del ranfo");
        } else {
            System.out.println("Fuera del rango");
        }

        var vacaciones = false;
        var diaDescanso = false;

        if (vacaciones || diaDescanso) {
            System.out.println("El padre puede ir");
        } else {

            System.out.println("El padre no puede ir");
        }

        /*condicion logica a evaluar */ /*asignacion verdadera*/ /*asignacion false*/
        var resultado6 = (3 > 2) ? "verdadero" : "falso";

        System.out.println("resultado6 = " + resultado6); 
        
        /*Para estructuras mas complejas se usa la sentecia  */
       
        /*
        var numero8 = 8;
        var resultado7 = "ol";
        
        resultado7 = ( numero8 % 2 == 0 ) ? 'verdad': 'falso';
        
        System.out.println("resutado = " + resultado7);
        */

        
        /*
            Operadores unarios
         */
        
            var x7 = 5;
            var z7 = 10;
            
            var z8 = ++x7 + z7--;
            
            /*
                Primero se realiza la suma y despues el decremento al ultimo la suma de los 2 resultados
                x7 = 6
                y7 = 10
                z8 = 16
                y7 = 9 ya que es un post decremento
            */
            System.out.println("z = " + z);
        
            var resultado7 = 4+5*6/3;
            System.out.println("resultado7 = " + resultado7);
            
            /*
                La multiplicacio y la division tiene mayor presedencia 
                ( 4 + (5*6)/3)
            asi se ejecuta la funcion
            */
            
            var resultado8 = (4+5)*6/3;
            System.out.println("resultado8 = " + resultado8);
            /*
                Cambio de resultado
            */
    
             
            /*
            
                Expresion if else 
            */
            
                            /*
                    El else if liga las condiciones a evaluar
                */
                var numeroTexto = "Numero desconocido";
                var numeroEvaluar = 2;
                
                if( numeroEvaluar == 1 ) {
                    
                    System.out.println("Es un numero 1");
                }else if( numeroEvaluar == 2 ){
                    System.out.println("Es un numero 2");
                }else if( numeroEvaluar == 3 ) {
                    System.out.println("Es el numero 3");
                }else {
                    System.out.println("Fuera de rango");
                }
                
                
                /*
                    Ejercicio de if else 
                */
                
                var mesEjercicio = 1;
                var estacion = "Estacio Desconocida";
                
                if( mesEjercicio == 1  || mesEjercicio == 2 || mesEjercicio == 12  ) {
                    
                    estacion = "INVIERNO";
                
                }else if( mesEjercicio == 3 || mesEjercicio == 4 || mesEjercicio == 5 ){
                        estacion = "PRIMAVERA";
                
                }else if( mesEjercicio == 6 || mesEjercicio == 7 || mesEjercicio == 8 ){
                        estacion = "VERANO";
                }else if( mesEjercicio == 9 || mesEjercicio == 10 || mesEjercicio == 11 ){
                    estacion = "OTONIO";
                }
                
                System.out.println("estacion = " + estacion);
    
    }

}

# JAVA BASICS

 ## Recursos del curso de Java
- Repo para los apuntes de los cursos de JAVA tipos de datos

### TIPOS DE DATOS

#### Tipos primitivos enteros en JAVA
    
- Tipos byte (Solo acepta -127 a 128), no es recomendable usar este tipo de dato
- Tipo de dato short (Solo acepta de -32768 a 32768 ) No se recomienda usar
- Tipo de dato int (Acepta los valor de -2147483648 a 2147483648) Se usa mas
- Tipo de dato long (Acepta de -9223372036854775807  a 9223372036854775807) casi no se usa
 
### Tipos de datos dprimitivos flotantes

### Float y double

- El tipo de dato float almacena valores mas grandes que del tipo long 
- El tipo float almacena los valores de -1.4E-45 a 3.4028235E38

- Los valores de tipo double alamcen los valores de -4.9E-324 a 1.7976931348623157E308

## Inferencia de tipos de datos 
### Uso de la palabra reservada VAR

###  Tipo de dato char
- Es un solo caracter
- Solo se usa las comillas simples
- Si se le asigna a un tipo var un valor decimal obtiene el valor del entero


### Tipo de dato primitivo booleano

- Solo acepta dos tipos de dato true o false


### Conversiones de tipos de datos

- Tipo string a numerico
- Integer.parseInt

- Tipo string a double
- Double.parse

- Tipo Int a tipo String


### Operadores 

 - Evaluan expresiones

#### Operadores aritmeticos

- operador de suma  +
- operador de resta -
- operador de division /
- operador de modulo % regresa el residuo de la operacion4
- Operador de asignacion

#### Operadores unarios
 - Cambio de signo -a
- Negacoion !a, solo aplica para valores booleanos
- Operadores de incremento y decremento
    - preincremnento ++e
    - postincremento e++

    - predecrmento --e
    - postdecremnto e--

- Operadores de igualdad
    - operadores de igualdad
    - operadores de asignacion

- Operadores relacionales
    - Indica si un valor es igual o mayor a otro

- Operadores relaciones 
    - AND && devuelve true cuando los dos valores son true
    - OR || devuelve true cuando uno de los dos valores es true


- Operador ternario
    - consta de 3 partes
        - condicion
        - valor si es true 
        - valor si es false

    - devulve un valor 


- Presedencia de operadores
    - Existen varios niveles
    - el nivel mas basico son +,-, ++, --
    - un nivel mas alto es  *,/ 
    - Se pueden agrupar para ejecutar los valores


- Condicionales de flujo IF, IF ELSE E IF ELSE IF
    - Se usan para condicionar el flujo en el que se ejecuta el programa
    - el else if liga las condiciones y optmiza el tiempo de ejecucion y de evaluacion

- Sentecia SIWTCH CASE:
    - Evalua una expresion NO debe de ser booleanos
    - Pueden ser tipos numericos, string
    - Si coincide con el caso que se especifica
    - Se debe de agregar la sentecia break, sino continua evaluando todos los casos
    - Entra al default sino hay un case que coincida

- Ciclos 
        - Repite una serie de lineas de codigo
        - Debe de cumplir una condicion
        - Debe de realizar una sentencia 
        - Se ejecuta hasta que la condicion se deje de cumplir 

    - While cycle
    - Es el ciclo mas basico de java

- Do while 
    - Es muy similar al ciclo while
    - Cambia en la forma en que se ejecutan las lineas de codigo
    - primero se ejecuta una vez el cuerpo del ciclo
 
- Ciclo For
    - cuenta con una instruccion a evaluar
    - Lleva el contador
    - realiza el incremento

- Break y coninue palabras reservadas
    - La palabra break permite romper un ciclo 
    - El continue salta a la siguiente iteracion



## Clases y objetos

    - Es una plantilla de la cual se crean objetos de la clase
    - La clase posee atributos y metodos

## los packages son conjuntos de clases

   - metodos
   - metodos con argumentos
    - metodos con retorno


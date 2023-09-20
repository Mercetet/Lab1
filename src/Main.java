import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        /*1. Programa Java que lea un número entero por teclado y calcule si es par o impar.

Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar.
El operador Java que calcula el resto de la división entre dos números enteros o no es el operador %.

        System.out.println("Ingrese un numero entero. ");
        int num = leer.nextInt();

        if (num % 2 == 0){
            System.out.println("Es un numero par. ");
        }*/

/*2. Programa que lea un número entero y muestre si el número es múltiplo de 10.

Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo por 10 el resto de esta división es cero.

        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();

        if (num % 10 == 0){
            System.out.println("Es multiplo de 10.");
        }*/

/*3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.

        System.out.println("Ingrese un caracter: ");
        char c = leer.next().charAt(0);

        if (Character.isUpperCase(c)){
            System.out.println("Ingreso una letra mayuscula. ");
        }*/

/*4. Programa java que comprueba si dos números enteros son iguales o no. Los números a comprobar se introducen por teclado.
Este es un ejercicio básico en Java para practicar la estructura condicional if .. else.

        System.out.println("Ingrese dos numeros enteros: ");
        int num = leer.nextInt();
        int num2 = leer.nextInt();

        if (num == num2){
            System.out.println("Ingreso dos numeros iguales. ");
        } else {
            System.out.println("Ingreso dos numeros distintos. ");
        }*/

/*5. Programa java para calcular el mayor de dos números enteros que se introducen por teclado.
El programa muestra por pantalla cuál de los dos números es el mayor o si son iguales.

        System.out.println("Ingrese dos numeros enteros: ");
        int num = leer.nextInt();
        int num2 = leer.nextInt();

        if (num == num2){
            System.out.println("Ingreso dos numeros iguales. ");
        } else if(num > num2){
            System.out.println(num + " es mayor que " + num2);
        }else {
            System.out.println(num2 + " es mayor que " + num);
        }*/

/*6. Programa java para calcular si la última cifra de dos números enteros es la misma.
Para realizar esto el programa lee por teclado dos números enteros y debe obtener la última cifra de cada uno de los números. Mediante una instrucción condicional if .. else mostrará un mensaje por pantalla indicando si los dos números acaban con la misma cifra  o no.
Para obtener la última cifra de un número se utiliza el operador % (resto).
La última cifra de cada número se obtiene calculando el resto de la división del número entre 10. Por ejemplo, si uno de los números es 123 su última cifra se calcula 123 % 10 = 3

        System.out.println("Ingresa dos numeros: ");
        int num = leer.nextInt();
        int num2 = leer.nextInt();

        int c1 = num % 10;
        int c2 = num2 % 10;

        if (c1 == c2){
            System.out.println("La ultima cifra de ambos numeros es igual. ");
        }*/

/*7. Programa java para calcular si un número entero es múltiplo de tres y de cinco.

        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();

        if ((num % 3 == 0) && (num % 5 == 0)){
            System.out.println("El numero es multiplo de 3 y de 5. ");
        }*/
/*8. Programa java para calcular si un número entero es múltiplo de dos o de tres.

        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();

        if ((num % 2 == 0) || (num % 5 == 0)){
            System.out.println("El numero es multiplo de 2 o de 3. ");
        }*/

/*9. Programa que lea dos caracteres y compruebe si son iguales.

        System.out.println("Ingrese dos caracteres: ");
        char c1 = leer.next().charAt(0);
        char c2 = leer.next().charAt(0);

        char mc1 = Character.toUpperCase(c1);
        char mc2 = Character.toUpperCase(c2);

        if (mc1 == mc2){
            System.out.println("Son iguales. ");
        }*/

/*10. Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas

        System.out.println("Ingrese dos caracteres: ");
        char c1 = leer.next().charAt(0);
        char c2 = leer.next().charAt(0);

        if (Character.isLowerCase(c1) && Character.isLowerCase(c2)){
            System.out.println("Son minusculas. ");
        }*/

/*11. Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

        System.out.println("Ingrese un caracter: ");
        char c = leer.next().charAt(0);

        if (Character.isDigit(c)){
            System.out.println("Es un digito numerico. ");
        }*/

/*12. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.

        System.out.println("Ingresar dos numeros. ");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();

        if (num2 <= 0){
            System.out.println("No se puede. ");
        } else {
            double rta = num1/num2;
            System.out.println(rta);
        }*/

/*13. Programa java para comprobar si un año es bisiesto.
El programa pide que se introduzca el valor de un año por teclado y calcula si es un año bisiesto o no lo es.
Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.

        System.out.println("Ingrese un año. ");
        int anio = leer.nextInt();

        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("Es un año bisiesto. ");
        }*/

/*14. Programa java para comprobar si un número entero de tres cifras es capicúa.
El programa pide que se introduzca un número entero y comprueba si el número es capicúa o no lo es. Si el número introducido no tiene tres cifras se muestra un mensaje indicándolo y el programa finaliza.
Un número es capicúa si se puede leer igual de izquierda a derecha que de derecha a izquierda. Por ejemplo, los números 1221, 35053, 969 ... son capicúa.
Como el programa pide que el número introducido sea de tres ciftras, para comprobar si es capicúa solo tendremos que comprobar si la primera cifra y la última son iguales.

        System.out.println("Ingrese un numero de tres cifras: ");
        int num = leer.nextInt();

        int c1 = num / 100;
        int c3 = num%10;

        if (c1 == c3){
            System.out.println("El numero es capicua. ");
        }*/

/*15. Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida. Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos.

        System.out.println("Ingrese la hora: ");
        int h = leer.nextInt();

        System.out.println("Ingrese los minutos: ");
        int m = leer.nextInt();

        System.out.println("Ingrese los segundos: ");
        int s = leer.nextInt();

        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)){
            System.out.println("La hora ingresada es valida. ");
        }*/


        /*16. Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.

        System.out.println("Ingrese un mes (En numeros): ");
        int mes = leer.nextInt();

        if (mes > 0 && mes <= 12){
            switch (mes){
                case 1:
                    System.out.println("Enero tiene 31 dias.");
                    break;
                case 2:
                    System.out.println("Febrero tiene 28 dias.");
                    break;
                case 3:
                    System.out.println("Marzo tiene 31 dias.");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 dias.");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 dias.");
                    break;
                case 6:
                    System.out.println("Junio tiene 30 dias.");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 dias.");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 dias.");
                    break;
                case 9:
                    System.out.println("Septiembre tiene 30 dias.");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 dias.");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 30 dias.");
                    break;
                case 12:
                    System.out.println("Diciembre tiene 31 dias.");
                    break;
            }
        }*/

/*17. Programa java para convertir una calificación numérica en alfabética.
El programa lee por teclado una calificación numérica entre 0 y 10 y muestra por pantalla su correspondiente calificación alfabética.
La equivalencia entre la calificación numérica y la alfabética se muestra en esta tabla:

La calificación numérica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener su equivalente calificación alfabética. Si la calificación introducida no es válida se muestra un mensaje indicándolo y el programa finaliza.

        System.out.println("Ingrese su calificacion numerica: ");
        int num = leer.nextInt();

        if (num <= 10 &&  num >= 0){
            if (num < 5){
                System.out.println("Insuficiente.");
            } else if (num == 5) {
                System.out.println("Suficiente.");
            } else if (num == 6) {
                System.out.println("Bien.");
            } else if (num == 7 || num == 8) {
                System.out.println("Notable.");
            } else if (num == 9 || num == 10) {
                System.out.println("Sobresaliente. ");
            }
        }*/

/*18. Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.

        int num = 1;

        while (num < 101){
            System.out.println(num);
            num += 1;
        }*/

/*19. Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while.

        int num = 1;

        do {
            System.out.println(num);
            num += 1;
        } while (num < 101);*/

/*20. Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for.

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }*/

/*21. Ejemplo de uso de while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.

        int num = 100;

        while (num > 0){
            System.out.println(num);
            num -= 1;
        }*/

/*22. Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.

        int num = 100;

        do {
            System.out.println(num);
            num -= 1;
        } while (num > 0);*/

/*23. Ejemplo de for. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for.

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }*/

/*24. Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla todos los números desde 1 hasta N. Resuelve este ejercicio de tres formas distintas:
1.      Utilizando la estructura for

        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        for (int i = 1; i < n+1; i++) {
            System.out.println(i);
        }*/

/*2.      Utilizando la estructura while

        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        int num = 1;

        while (num < n+1){
            System.out.println(num);
            num += 1;
        }*/

/*3.      Utilizando la estructura do .. while

        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        int num = 1;

        do {
            System.out.println(num);
            num += 1;
        } while (num < n+1);*/

/*25. Programa que pida que se introduzca por teclado el valor de un número entero N y muestre los números desde N hasta 1 ambos incluidos. Se debe resolver este ejercicio de tres formas distintas utilizando la estructura repetitiva:
1.      Utilizando la estructura for

        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }*/

/*2.      Utilizando la estructura while

        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        int num = 1;

        while (num < n+1){
            System.out.println(n);
            n -= 1;
        }*/

/*3.      Utilizando la estructura do .. while

        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        int num = 1;

        do {
            System.out.println(n);
            n -= 1;
        } while (num < n+1);*/

        /*26. Programa que pida que se introduzcan dos números enteros por teclado y muestre los números desde el menor hasta el mayor de los números introducidos. Los dos números introducidos deben ser distintos. Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir.

        int num1, num2;

        do {
            System.out.println("Ingrese dos numeros: ");
            num1 = leer.nextInt();
            num2 = leer.nextInt();

        } while (num1 == num2);

        if (num1 > num2) {
            while (num1 + 1 != num2) {
                System.out.println(num2);
                num2 += 1;
            }
        } else if (num2 != num1) {
            while (num2 + 1 != num1) {
                System.out.println(num1);
                num1 += 1;
            }
        }*/


/*27. Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.

        System.out.println("Ingrese dos numeros enteros: ");
        int a = leer.nextInt();
        int b = leer.nextInt();

        while (a>b){
            System.out.println("A debe ser menor q B. Intente nuevamente.");
            System.out.println("Ingrese dos numeros enteros: ");
            a = leer.nextInt();
            b = leer.nextInt();
        }

        for (int i = a; i < b+1; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }*/

/*28. Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor que el valor de M. Si no se introducen valores válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir.



29. Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de millas y calcula y muestra su equivalente en Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las millas.
1 Milla equivale a 1.6093 Kilómetros.
El valor de los KM resultantes se debe mostrar con dos decimales.
Para pasar de millas a Km realizaremos la operación:
Km = millas * 1.6093
}*/

    }
}
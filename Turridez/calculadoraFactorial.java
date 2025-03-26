import java.util.Scanner;

public class calculadoraFactorial {
public static void main(String[] args) {
        int numA = 0, numB = 0;
        //Agregamos variable del número iniciada en 1, ya que con 0, la multiplicación siempre da 0 y con "long" para posibles números grandes//
        long numFactorial = 1;
        int varControl = 0;
        //Variable del numero por el que se multiplica//
        int i = 1;
        //Variable para el resultado factorial//
        long factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");

        while (varControl != 6) {
            System.out.println("1. Sumar dos números\r\n" + //
                    "2. Restar dos números\r\n" + //
                    "3. Multiplicar dos números\r\n" + //
                    "4. Dividir dos números\r\n" + //
                    "5. Factorial de un número\r\n" + //
                    "6. Salir\r\n");
                                                
            System.out.print("Opción seleccionada: ");
            varControl = scanner.nextInt();

            switch (varControl) {
                case 1:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " + " + numB + " = " + (numA + numB));

                    break;
                case 2:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " - " + numB + " = " + (numA - numB));

                    break;
                case 3:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " * " + numB + " = " + (numA * numB));

                    break;
                case 4:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " / " + numB + " = " + (numA / numB));

                    break;
                case 5: 
                 
                    //Solicitamos el número y lo leemos//
                    System.out.print("Ingrese el número al que desea conocer el factorial:  ");
                    numFactorial = scanner.nextLong();
                    /*Aplicamos el ciclo confirmando primero la condición de que el número ingresado sea mayor o igual a 1, 
                    ya que con cero siempre daría 0*/
                    while ( i <= numFactorial )
                    /*Guardamos las multiplicaciones en factorial, inciando desde i (1) hasta que i sea mayor o igual que el numero ingresado finalizando
                    el proceso ya que con cada multiplicación i aumenta una cantidad*/
                    { factorial *= i; i++;}
                    //Imprimimos el resultado//
                    System.out.println( numFactorial+"! = " + factorial);

                    
                    break;

                case 6:
                    System.out.println("Gracias, hasta pronto!");

                    break;

                default:
                    System.out.println("Opción no valida!");
                    break;
            }

        }

        scanner.close();
    }
}

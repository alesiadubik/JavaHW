/* Реализовать простой калькулятор
 */

 import java.util.Scanner;

 public class hw_1_3 {
     static int scanNumber() {
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         //sc.close();
         return number;
     }
 
     static String scanOperations() {
         Scanner sc = new Scanner(System.in);
         String operations = sc.nextLine();
         //sc.close();
         return operations;
     }

     static int getResult(String opr, int n1, int n2) {
         int result = 0;
         switch (opr) {
             case "+":
                 result = n1 + n2;
                 break;
             case "-":
                 result = n1 - n2;
                 break;
             case "*":
                 result = n1 * n2;
                 break;
             case "/":
                 result = n1 / n2;
 
             default:
                 System.out.println("Введите оператор: -, +, *, /");
                 break;
         }
         return result;
 
     }
 
     public static void main(String[] args) {
         System.out.println("Введите первое число: ");
         int n1 = scanNumber();
         System.out.println("Введите оператор: -, +, *, /");
         String operations = scanOperations();
         System.out.println("Введите второе число: ");
         int n2 = scanNumber();
         int result = getResult(operations, n1, n2);
         System.out.printf("%d %s %d = %d", n1, operations, n2, result);
 
     }
 }

import java.lang.Math;
import java.util.Scanner;
public class calculator {
       public static void main(String[] args){
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        
       System.out.print("Enter operator(+,-,*,/): ");
       char op = sc.next().charAt(0);
       double T = 0;
       
       switch(op){
        case '+':
        T = num1 + num2;
        break;

        case '-':
        T = num1 - num2;
        break;

        case '*':
        T = num1 * num2;
        break;

        case '/':
        T = num1 / num2;
        break;

        default:
          System.out.println("You enter wrong input....");
       }
       System.out.println("Final result..");
       System.out.println();

       System.out.println(num1 + " " + op + " " + num2
                           + " = " + T);

       }
}


import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        double num1;
        double num2;
        double result=0;
        char operator;
        boolean validOperation=true;

         Scanner scanner=new Scanner(System.in);

    System.out.print("Enter your first no. : ");
    num1=scanner.nextDouble();

    System.out.print("Enter an operator(+,-,*,/,^) :"  );
    operator=scanner.next().charAt(0);

    System.out.print("Enter your second no. :");
    num2=scanner.nextDouble();

switch(operator) {
        case'+' -> result=num1+num2;
        case'-' -> result=num1-num2;
        case'*' -> result=num1*num2;
                    case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println(result);
        }

        scanner.close();
    }
}



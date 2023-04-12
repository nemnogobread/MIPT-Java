package Java;

import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        int num1 = reader.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = reader.nextLine();
        operator = reader.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = reader.nextInt();

        switch(operator)
        {
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error: you cannot divide by zero");
                else
                    System.out.println("Результат: " + (num1 / num2));
                break;
            default:
                System.out.printf("operator %c is not declared", operator);
        }
        reader.close();
    }
}

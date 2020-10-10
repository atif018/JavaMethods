/** The purpose of this program is to show working knowledge of how to 
 * write methods, call them and some recursion */
 
 import java.util.Scanner;

public class MethodsAndRecursion
{
    
    public static void main (String[] args)
    {
        
        int firstNumber;
        int secondNumber;
        int multiplyNumbers;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This part of the program will multiply your first number by your second number using a method call.");
        System.out.println("Please enter your first number: ");
        firstNumber = input.nextInt();
        System.out.println("Please enter your second number: ");
        secondNumber = input.nextInt();
        
        multiplyNumbers = multiplyTwoNumbers(firstNumber, secondNumber);
        
        System.out.println("Multiplying " + firstNumber + " and " + secondNumber + " equals " + multiplyNumbers + ".");
        
        System.out.println("This part of the program will print a box of a height that is your first number and by a width that is your second number using a method call that doesn\'t return any value.");
        System.out.println("Please enter your first number: ");
        firstNumber = input.nextInt();
        System.out.println("Please enter your second number: ");
        secondNumber = input.nextInt();
        
        printBox(firstNumber, secondNumber);
        
        System.out.println("This part of the program will print an isosceles triangle of a height as entered by the user and uses recursion.");
        System.out.println("Please enter a height for the triangle: ");
        firstNumber = input.nextInt();
        
        printIsoscelesTriangleOne(firstNumber);
        printIsoscelesTriangleTwo(firstNumber);
        
    }
    
    public static int multiplyTwoNumbers (int a, int b)
    {
        
        int c = a * b;
        return c;
        
    }
    
    public static void printBox(int a, int b)
    {
        
        for (int i = 1; i <= a; i++) // Starts at row 1 and works its way along that row until moving to the next row
        {
        
            for (int j = 1; j <= b; j++) // Starts at "column" 1 and completes the row before moving onto the next row
            {
             
                System.out.print("*");
             
            }
             
            System.out.println();
        }
    }
    
    public static void printIsoscelesTriangleOne(int a)
    {
        
        if (a > 1) 
        {
            
            printIsoscelesTriangleOne(a - 1);
            
        }
        
        for (int i = 0; i < a; i++)
        {
                
            System.out.print("*");
                
        }
        
        System.out.println();
         
    }
    
    public static void printIsoscelesTriangleTwo(int a)
    {
        
        a = a - 1;
        
        for (int i = 0; i < a; i++)
        {
                
            System.out.print("*");
                
        }
        
        System.out.println();
       
        if (a > 1) 
        {
            
            printIsoscelesTriangleTwo(a);
            
        }
        
    }
}

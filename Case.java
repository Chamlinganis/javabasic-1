
/**
 * Write a description of class Case here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Case
{
    public static void main(String[] args){
    int x,y;
    char a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number ");
    x=sc.nextInt();
    System.out.println("enter second number ");
    y=sc.nextInt();
    System.out.println(" Enter any operator u want ");
    a=sc.next().charAt(0);
    switch(a){
         case '+':
         System.out.println(" sum of two number is " +(x+y));
         break;
         case '-':
         System.out.println("diff of two number is " +(x-y));
         break;
         case '*':
         System.out.println("multiple of two number is " +(x*y));
         break;
         case '/':
         System.out.println("divide of two number is "+(x/y));
         break;
         case '%':
         System.out.println("modulos of given number is " +(x%y));
         break;
    }
    System.out.println(" aba musuka hasanata milyo ta  ");
}
}

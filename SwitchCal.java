
/**
 * Write a description of class SwitchCal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SwitchCal
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter number a ");
    int a = sc.nextInt();
    System.out.println(" Enter number b ");
    int b = sc.nextInt();
    System.out.println(" Enter any operator u want ");
    char c = sc.next().charAt(0);
    switch(c){
        case '+':
         System.out.println( " Sum of two num is " +(a+b));
         break;
         case '-':
          System.out.println( " diff of two num is " +(a-b));
          break;
          case '*':
         System.out.println(" mult of two number is " +(a*b));
         break;
         case '/':
          System.out.println(" div of two number is " +(a/b));
          break;
          case '%':
         System.out.println(" The remainder  is " +(a%b));
         break;
    }
    System.out.println( " aba musuka hasanata milyo ta ");
}
}
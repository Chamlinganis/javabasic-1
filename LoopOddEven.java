
/**
 * Write a description of class LoopOddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LoopOddEven
{
    public static void main(String[] args){
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println(" multification of a table ");
    a = sc.nextInt();
    for (b=1; b<=10; b++){
        System.out.println( +a+ " * " +b+ " = " +(a*b));
    }
}
}

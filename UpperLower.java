
/**
 * Write a description of class UpperLower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class UpperLower
{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any word u like ");
    char a = sc.nextLine().charAt(0);
    if(a>=65 && a<=90){
        System.out.println(" It is uppercase ");
    }
    else if (a>=97 && a<122){
        System.out.println(" it is lowercase ");
    }
}
}

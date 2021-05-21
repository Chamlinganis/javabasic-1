 
/**
 * Write a description of class Namaste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Namaste
{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter a word as u like ");
    char a= sc.nextLine().charAt(0);
    if(a>=65 && a<=90){
        int b =((int)a+32);
        System.out.println((char)b);
    }
    else if (a>=97 && a<=122){
        int b=((int)a-32);
        System.out.println((char)b);
    }
}
}

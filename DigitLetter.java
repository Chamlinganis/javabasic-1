
/**
 * Write a description of class DigitLetter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DigitLetter
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
    System.out.println("enter any character ");
    char c = sc.next().charAt(0);
 if(c>=48 && c<=57){
    System.out.println("you have entered a digit ");
    }
    else if (c>=65 && c<=90 || c>97 &&c<=122){
    System.out.println("you have entered letter ");
    } 
    else{
    
    }
    System.out.println("it is digit");
}
}


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Atm
{   
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println(" Enter your pin number ");
    int x = sc.next().charAt(0);
    System.out.println(" press 'b' for balance check ");
    System.out.println(" press 'w' for withdraw ");
    System.out.println(" press 'e' for exit ");
    char a = sc.next().charAt(0);
    switch(a){
        case 'b':
        int y=1000;
        System.out.println("your balance is "+y);
        break;
        case 'w':
        System.out.println("how much money u want to withrdraw ");
        int z = sc.nextInt();
        if(z>1000){
            System.out.println(" you do not have sufficient balance ");
        }
        else{
        System.out.println(" you have withdrawn " +z);
        int e = 1000 - z;
        System.out.println(" your current amount is " +e);}
        break;
        case 'e':
        System.out.println(" exit nai gareko ho? ");
        break;
    }
    System.out.println(" Thank you ");
}
}

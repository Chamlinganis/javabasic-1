
/**
 * Write a description of class Five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Five
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number as u like ");
        int a = sc.nextInt();
        if (a%2==0 && a%5==0){
            System.out.println(+a+ " is even number and divisible by 5");
        }
        else if(a%2==0 && a%5!=0){
            System.out.println( +a+ " is  even number but not divisible by 5 " );
        }
        else if (a%2!=0 && a%5==0){
            System.out.println(+a+ " is not even number but divisble by 5 ");
        }
        else if (a%2!=0 && a%5!=0){
            System.out.println( +a+ " is not even number and not divisble by 5 ");
        }
    }
}

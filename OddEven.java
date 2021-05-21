
/**
 * Write a description of class OddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class OddEven
{
 public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println(" Enter a number u like ");
     int a = sc.nextInt();
     if(a%2==0){
         System.out.println(+a+ " is even number ");
        }
        else if (a%2==1){
            System.out.println(+a+ " is odd number ");
        }
    }
}

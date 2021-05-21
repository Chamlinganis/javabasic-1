
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class User
{
    int n1, n2;
    public static void main(String[] args)
    {
        Scanner ar = new Scanner(System.in);
        User s1 = new User();
        System.out.println(" Enter the value of n1 ");
         s1.n1 = ar.nextInt();
        System.out.println(" Enter the value of n2 ");
         s1.n2 = ar.nextInt();        
        s1.sum();
        s1.diff();
        s1.mult();
    }
    public void sum(){
        System.out.println( +n1+ " + " +n2+ " = " +(n1+n2));
    }
    public void diff(){
        System.out.println( +n1+ " - " +n2+ " = " +(n1-n2));
    }
    public void mult(){
        System.out.println( +n1+ " * " +n2+ " = " +(n1*n2));
    }
}
 

/**
 * Write a description of class Area here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Area
{
    public static void main(String[] args){
        double ar,cr;
        float br;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 'R' for rectangle, 'C' for  Circle and 'S' for sqaure");
        char c = sc.nextLine().charAt(0);
    if(c=='R'){
        System.out.println("Enter the length of rectange ");
        double a = sc.nextDouble();
        System.out.println(" Enter the breadth of rectangle ");
        double b = sc.nextDouble();
        ar= a*b;
        System.out.println(" The area of rectangle is " +ar);
    }
else if(c=='C'){
System.out.println(" Enter the value of radius ");
float r= sc.nextFloat();
br = (22/7)*r*r;
System.out.println(" the area of circle is " +br);
}
else if(c=='S'){
 System.out.println(" Enter the side ");
 Double s =sc.nextDouble();
 cr= s*s;
 System.out.println(" The area of square is " +cr);
}
else{
    System.out.println(" wrong character my friend. ask your first boy how to do it? ");
}
}
}
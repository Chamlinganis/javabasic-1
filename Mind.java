
/**
 * Write a description of class Mind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Mind
{
int a;
public static void main(String[] args){
    Scanner wf = new Scanner(System.in);
    Mind s1 = new Mind();
    System.out.println(" Enter the value ");
    s1.a= wf.nextInt();
    System.out.println(" first answer " +s1.first(s1.a%10));
    System.out.println(" third answer " +s1.third((s1.a)/10)%10);
    System.out.println(" fifth answer " +s1.fifth((s1.a)/100)%10);
}
public int first(int a){
    int first = a%10;
    return first;
}                                                                                                                                                            
public int third (int a){
    int third = (a/10);
    return third;
}
public int fifth (int a){
    int fifth = (a/100)%10;
    return fifth;
}
}
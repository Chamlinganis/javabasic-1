
/**
 * Write a description of class TernaryPassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TernaryPassFail{
     public static void main (String[]args){
Scanner sc=new Scanner(System.in);
int a=40, b;
b=sc.nextInt();
String test = a>b ? "You are Fail" : "You are pass";
System.out.println(test);
}
}


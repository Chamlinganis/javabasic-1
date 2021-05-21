
/**
 * Write a description of class Solution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Solution {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println(" Enter a number ");
    int n = sc.nextInt();
    if(n==1){
        System.out.println(" Weird ");
    }
    else if(n>=2 && n<=5){
        System.out.println(" weird ");
    }
    else if(n==0 && n>=6 && n<=20){
        System.out.println(" Weird ");
    }
    else{
        System.out.println(" Not weird ");
    }
}
}
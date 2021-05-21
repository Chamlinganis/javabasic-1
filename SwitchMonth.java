
/**
 * Write a description of class SwitchMonth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SwitchMonth
{
    public static void main(String[] args){
        int d=31; 
        int e=30;
        int f=29;
        int g=28;
    Scanner sc= new Scanner(System.in);
    System.out.println( " Enter a year ");
    int b = sc.nextInt();
    System.out.println(" Enter a month number to find total days ");
    int a = sc.nextInt();
    switch(a){
        
        case 1:
        System.out.println(" January" +b+ "has" +d+ " days ");
        break;
        case 2:
        if((b%4==0) && (b%400==0) || (b%100!=0)){
        System.out.println(" february " +b+ " has " +f+ " days ");
    } else{
     System.out.println( " february " +b+ " has " +g+ " days ");
    }
        break;
        case 3:
        System.out.println(" march " +b+ " has " +d+ " days ");
        break;
        case 4:
        System.out.println(" april " +b+ " has " +e+ " days ");
        break;
        case 5:
        System.out.println(" may " +b+ " has " +d+ " days ");
        break;
        case 6:
        System.out.println(" june " +b+ " has " +e+ " days ");
        break;
        case 7:
        System.out.println( " july " +b+ " has " +d+ " days ");
        break;
        case 8:
        System.out.println(" august " +b+ " has " +d+ " days ");
        break;
        case 9:
        System.out.println(" september " +b+ " has " +e+ " days ");
        break;
        case 10:
        System.out.println( " october " +b+ " has " +d+ " days ");
        break;
        case 11:
        System.out.println(" november " +b+ " has " +e+ " days ");
        break;
        case 12:
        System.out.println(" december " +b+ " has " +d+ " days ");
        break;
    }
    System.out.println(" aba musuka hasanata milyo ta  ");
    }
}


/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Tax
{
public static void main(String[] args){
    double a, taxAmount=0;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter your annual income ");
     a = sc.nextDouble();
    if(a<=100000){
        System.out.println(+a+ " you don't have to pay tax ");
    }
    else if(a>=100001 && a<=150000){
        taxAmount=(a-100000)/100*10;
        System.out.println(taxAmount+ "is the tax amount u have to pay ");
    }  
    else if(a>=150000 && a<=250000){
    taxAmount= ((a-150000)/100*20)+5000;
    System.out.println(taxAmount+ " is the tax amount u have to pay ");
    }
    else if(a>250000){
    taxAmount=((a-2500000)/100*20)+25000;
    System.out.println(taxAmount+ " is the tax amount u have to pay ");
}
}
}
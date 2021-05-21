
/**
 * Write a description of class VowelCon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VowelCon
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println(" Enter any word u want ");
char a = sc.next().charAt(0);
switch(a){
case 'a':
System.out.println("It's a vowel word ");
break;
case 'e':
System.out.println(" it's a vowel word");
break;
case 'i':
System.out.println(" it's a vowel word");
break;
case 'o':
System.out.println(" it's a vowel word");
break;
case 'u':
System.out.println(" it's a vowel word ");
break;
default:
System.out.println(" it's a consonant ");
break;
}
}
}
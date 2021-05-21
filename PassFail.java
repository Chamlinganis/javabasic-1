
/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PassFail
{
public static  void main(String[] args){
    double p;
    Scanner sc = new Scanner(System.in);
    System.out.println(" what's your percentage? ");
    p= sc.nextDouble();
    if(p>30){
    System.out.println("congratulation you have pass the exam ");
    }
  if(p>=80 && p<=100){
    System.out.println(" good mate ,you have got distinction ");
    }
    else if(p>=60 && p<=79){
    System.out.println("you should try harder,you have got first division ");
}
else if(p>=20  && p<=59){
System.out.println("study hard,you have got second division ");
}
 if (p<=29){
    System.out.println("congratulation you have fail the exam ");
    }
     if(p<20){
    System.out.println(" you are expelled my mate ");
    }
    else {
    System.out.println(" babu timile padera kehi khadainau");
    }
}
}

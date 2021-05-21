import java.util.Scanner;
public class Discount
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double netAmount, amount, discount=0, discountRate=0;
    System.out.println(" what you want to purchase laptop(L) or desktop(D)");
    char c = sc.nextLine().charAt(0);
     System.out.println("enter your amount");
        amount= sc.nextDouble();
    if(c=='L'){
        if(amount<=25000){
        discountRate=0;
        }
        else if(amount<=57000){
        discountRate=5;
        }
        else if(amount<=100000){
        discountRate=7.5;
        }
        else if(amount>=100000){
            discountRate=10;
        }
    }
    else if(c=='D'){
        if(amount<=25000){
        discountRate=5;
    }
    else if(amount<=57000){
        discountRate=7.5;
    }
    else if(amount<=100000){
        discountRate=10.5;
    }
    else if(amount>=100000){
        discountRate=15.0;
    }
    }
    else{
    System.out.println("you have entered wrong char");
} 
        discount = (discountRate/100.00)*amount;
        netAmount = amount - discount;
        System.out.println("the net amount is " +netAmount);
    }
}
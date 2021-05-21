
/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
int a= 10;
int b= 5;
public void main(String[] args){
    Practice s = new Practice();
    s.sum();
    s.diff();
}
public void sum(){
    System.out.println(" sum of " +a+ " and " +b+ " is " +(a+b));
}
public void diff(){
    System.out.println( " diff of " +a+ " and " +b+ " is " +(a-b));
}
}

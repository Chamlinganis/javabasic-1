  
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers{
    int n1= 100;
    int n2= 50;
    public static void main(String[] args){
        Numbers s1 = new Numbers();
        s1.sum();
        s1.diff();
    }
        public void sum(){
        System.out.println(" sum of " +n1+ " and " +n2+ " is " +(n1+n2));
    }
    public void diff(){
        System.out.println( " diff of " +n1+ " and " +n2+ " is " +(n1-n2));
    }
}

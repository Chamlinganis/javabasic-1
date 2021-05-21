 
/**
 * Write a description of class Sum here.
 *
 * @author Anmol lama
 * @version April 10
 */
public class Sum
{
  float a= 25;
  float b= 23;
  float c= 10;
  float d= 33;
  float answer = (a+b)/(c*d);
  public static void main(String[] args){
      Sum s1 = new Sum();
      s1.a();
      s1.b();
    }
    public void a(){
        System.out.println(" solution of a+b/c*d is " +(answer));
    }
    public void b(){
        System.out.println(" solution of c*d/b+a is " +((c*d)/(b+a)));
    }
        }
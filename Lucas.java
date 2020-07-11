
package lucas;
import static java.lang.Math.*;
import java.util.*;

public class Lucas {

public static int Luks(double n)
{
if(n==0){return 2;}
if(n==1){return 1;}
else {return Luks(n-1)+Luks(n-2);}
}
  public static int Luks2(double n)
  {
  double root=sqrt(5);
  double a=((1+root)/2);
  double b=((1-root)/2);
  double c= pow(a,n);
  double d= pow(b,n);
  double value= c+d;
  int data = (int) value;
  return data;
  } 

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double n; 
       System.out.println("Ingrese el numero n");
       n=sc.nextDouble();
       System.out.println("El nth numero de Lucas es: "+Luks(n));
       System.out.println("El 18-th numero de Lucas es: "+Luks(18));
       System.out.println("El numero de Lucas mas grande menor que 1000 es: "+Luks(14));
       double m=0; double i=0;
       while (true)
       {
       i=Luks2(m);
       if (i>100){break;}
       m=m+1;
       }
     System.out.println("El primer numero de Lucas mas grande que 100 es: "+Luks2(m));
    }
    
}

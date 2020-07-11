
package rsa_tarea;
import java.util.*;
import java.math.*;

public class RSA_Tarea {

     static int MCD(int e, int z)
       {
        if(e==0) {return z;} 
        else {return MCD(z%e,e);}
       }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 int p=11,q=29,n,z,d=0,e,i;
 System.out.println("Ingrese el dato a ser encriptado y luego desencriptado");
 String mensaje=sc.nextLine();
 char[] ch = mensaje.toCharArray();
 char[] encript = new char [ch.length] ;
 char[] decript = new char [ch.length];
 
for (int k=0; k<ch.length; k++) { 
            int msg=(int) ch[k];
 System.out.println(msg);
 double c;
 BigInteger msgback; 
 
 n=p*q;
 z=(p-1)*(q-1);
 
   
  for(e=2;e<z;e++)
 {
 if(MCD(e,z)==1)            // e es la llave publica
 { 
 break;
 }
 }
 
 for(i=0;i<=9;i++)
 {
 int x=1+(i*z);
 if(x%e==0)      //d es la llave privada
 {
 d=x/e;
 break;
 }
 }
   
 c=(Math.pow(msg,e))%n;
 double encr = (Math.pow(msg,e));
 encript[k]=(char) encr;
 
 BigInteger N = BigInteger.valueOf(n);
 
 BigInteger C = BigDecimal.valueOf(c).toBigInteger();
 msgback = (C.pow(d)).mod(N);
 char text = (char)msg;
 decript[k]= text; 
        }  
   System.out.println();
    System.out.print("Mensaje encriptado: ");
     for (int j=0;j<encript.length;j++)
     {
     System.out.print(encript[j]);
     }
     System.out.println();
     System.out.print("Mensaje desencriptado: ");
     for (int j=0;j<encript.length;j++)
     {
     System.out.print(decript[j]);
     }
    System.out.println();
    }
    
}

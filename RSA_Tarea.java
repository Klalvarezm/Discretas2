//Carpeta donde esta guardado el archivo .java, puede cambiarse
package rsa_tarea;
//Necesario para poder tener entradas a travez de Scanner
//Y saber los tamaños de los arreglos
import java.util.*;
//Funciones matematicas.
import java.math.*;

public class RSA_Tarea {
        //Calcula el Maximo Comun Divisor 
    //entre e y la funcion de euler
     static int MCD(int e, int z)
       {
        if(e==0) {return z;} 
        else {return MCD(z%e,e);}
       }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Para poder hacer la encriptacion se necesitan 2
        //enteros primos, se escogio 11 y 29 porque funcionaron
        //con todos los casos probados
       int p=11,q=29,n,z,d=0,e,i;
 System.out.println("Ingrese el dato a ser encriptado y luego desencriptado");

 String mensaje=sc.nextLine();
 //Se convierte el mensaje de String que puede ser cualquier linea de caracteres
 //a un arreglo de caracteres porque asi es mas sencillo trabajar
 char[] ch = mensaje.toCharArray();
 char[] encript = new char [ch.length] ;
 char[] decript = new char [ch.length];
 
for (int k=0; k<ch.length; k++) { 
 
 int msg=(int) ch[k];
 //Se convierte cada caracter individual del mensaje a un numero entero.
 System.out.println(msg);
 double c;
 //Se utiliza Biginteger en caso de que el entero tenga un valor muy grande.
 BigInteger msgback; 
 //Se calcula el producto de los 2 enteros primos
 n=p*q;
 //se calcula la funcion indicatriz de euler
 //Si n es un número entero positivo, 
 //entonces φ(n) se define como el número de enteros positivos menores o iguales a n y coprimos con n
 z=(p-1)*(q-1);
 
   
  for(e=2;e<z;e++)
 {
   //se debe encontrar un numero e tal que gcd(e , ϕ(n) ) = 1
     if(MCD(e,z)==1)            // e es la llave publica
 { 
 break;
 }
 }
 
 for(i=0;i<=9;i++)
 {
 int x=1+(i*z);
 //Calcular un entero d tal que *d mod ϕ(n) = 1
 if(x%e==0)      //d es la llave privada
 {
 d=x/e;
 break;
 }
 }
 //Encriptar el numero y guardarlo en C = P^e  
//donde P es cada numero del arreglo de caracteres convertido a numeros enteros 
 
 
 c=(Math.pow(msg,e))%n;
 double encr = (Math.pow(msg,e));
 //Ahora se convierte el numero a caracter
 //Donde el numero es correspondiente al codigo Ascii
 encript[k]=(char) encr;
 //Y se guarda en el arreglo.
 BigInteger N = BigInteger.valueOf(n);
 //Se convierte n a BigInteger para poderlo calcular con 
 //el valor msgback que tambien es BigInteger
 BigInteger C = BigDecimal.valueOf(c).toBigInteger();
 msgback = (C.pow(d)).mod(N);
 //Desencriptar el numero y guardarlo en  D = D^d mod n
 //Donde D sera el numero desencriptado
 char text = (char)msg;
 //Ahora se convierte el numero a caracter
 //Donde el numero es correspondiente al codigo Ascii
 decript[k]= text; 
 //Y se guarda en el arreglo.
        }  
   System.out.println();
   //Imprime el mensaje completo encriptado 
   System.out.print("Mensaje encriptado: ");
     for (int j=0;j<encript.length;j++)
     {
     System.out.print(encript[j]);
     }
     System.out.println();
     //Imprime el mensaje completo desencriptado 
     System.out.print("Mensaje desencriptado: ");
     for (int j=0;j<encript.length;j++)
     {
     System.out.print(decript[j]);
     }
    System.out.println();
    }
    
}

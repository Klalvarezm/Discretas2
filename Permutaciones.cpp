#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;



//EL CODIGO DEBE SER EJECUTADO EN IDE ONE O UN COMPILADOR ACTUALIZADO.

//Los vectors, funcionan de manera similar a los ArrayLists en java, osea arreglos
//de tamaño dinamico.


void Imprimir_Numeros(vector<vector<int>> Calley)
     { 
	 for(vector<int> &g: Calley) {
    
     for(int &i: g) 
     {
     	cout << i << ' ';
        
     }
    cout << endl;}}
 
vector<int> Componer_Vectores(const vector<int> &a, const vector<int> &b) {
   
    vector<int> Composicion;

          for(const int i: b) 
             { 
               Composicion.push_back(a[i-1]);} //El metodo Pushback es igual al metodo 
               return Composicion;     //Add de java, pone el elemento en el ultimo
                                          //Indice del arraylist / vector
             }
 vector<int> Llenar_Valores(int numeros) {
   
    vector<int> Valor_Lista;

         for(int i=1; i<=numeros; i++) 
           {
            Valor_Lista.push_back(i); //Aqui se llena el ArrayList con numeros de 0 a N.
           }
 	     return Valor_Lista;
 	      }
  int main() {
   
cout<<"Ingrese el tamaño maximo de elementos para la permutacion\n ";

  int Tamano_Permutaciones;

cin >> Tamano_Permutaciones;
cout<<endl;

vector<int> Numeros;

           Numeros=Llenar_Valores(Tamano_Permutaciones);

vector<vector<int>> Transformacion; //Este es equivalente a un ArrayList de un ArrayList
                                //Osea un arreglo dinamico que maneja arreglos dinamicos
Transformacion.push_back(Numeros);


    while(next_permutation(Numeros.begin(), Numeros.end())) 

     {
        Transformacion.push_back(Numeros); //el metodo next_Permutation
                                            //Hace Permutaciones al tiempo que
     }                                     //Revisa si existen siguientes posibles
                                           //Permutaciones para continuar.
                                  



      vector<vector<int>> KT;
      for(const vector<int> &a: Transformacion) 
         {
          vector<int> Llenado;
                      for(const vector<int> &b: Transformacion)
                        {
                         int i = find(Transformacion.begin(), Transformacion.end(),  Componer_Vectores(a,b)) - Transformacion.begin();
                         Llenado.push_back(i);
                        }
          KT.push_back(Llenado);
         }
         
    Imprimir_Numeros(KT);
    
     return 0;
    }

package adapter;

import Udea.ArtesAdapter;
import Udea.Exactas;
import Udea.Ingenieria;
import java.util.Scanner;
public class Aplicacion {
 
    public static void main(String[] args) {
    Exactas e1 = new Exactas();
    Ingenieria i1 = new Ingenieria();
    ArtesAdapter a1 = new ArtesAdapter();
    
      Scanner leer = new Scanner(System.in); 
              
      System.out.println("Digite:\n 1 -Si desea ingresar a Ingenieria "
                              + "\n 2 -Si desea ingresar a Exactas "
                              + "\n 3 -Si desea ingresar a Artes");
      
      int carrera = leer.nextInt();
      
      switch(carrera){
          case 1:{
              i1.realizarPreinscripcion();
              i1.pagarDerechosMatricula();
              i1.realizarInscripcion();
              i1.presentarExamenAdmision(); 
              break;
         }
          case 2:{
              e1.realizarPreinscripcion();
              e1.pagarDerechosMatricula();
              e1.realizarInscripcion();
              e1.presentarExamenAdmision(); 
              break;
         }
          case 3:{  
              a1.realizarPreinscripcion();
              a1.pagarDerechosMatricula();
              a1.realizarInscripcion();
              a1.presentarExamenAdmision(); 
              break;
         }         
      }
    }
    
}

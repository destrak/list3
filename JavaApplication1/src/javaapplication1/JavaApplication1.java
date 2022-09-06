
package javaapplication1;
public class JavaApplication1 {
    public static void main(String[] args) {
                Balde b=new Balde(5); 
                 b.llenar(12);          
                 int t = b.vaciar(1); 
                 int s = b.verificar(); 
                 System.out.println(s);
                 System.out.println(b.verificar());
    }
    
}
class Balde{
private int capacidad;
private int contenido=0;
        public Balde(int t){
            capacidad = t;
        }
        public void llenar(int r){
            if(r>0){
            contenido = contenido +r;
        }
            if(capacidad < contenido){
                contenido = capacidad;
            }
            
        }
        public int verificar(){
           
            return contenido;
        }
        public int vaciar(int vaciar){
            if(vaciar < 0){
                    vaciar=0;
              contenido = contenido - vaciar;
            }
            else if(vaciar <= contenido){
                contenido = contenido-vaciar;
                
            }
            else if(vaciar>= contenido){
                contenido =0;
            }
            return contenido;
      } 
}
package preg28;
import java.util.ArrayList;
public class Preg28 {
public static void main(String[] args) {
    Expendedor a = new Expendedor(1);
       Moneda b = new Moneda();
       a.comprarBebida(null);
    }
    
}
class Expendedor{
    private Deposito xd;
     public Expendedor(int n){
         xd= new Deposito();
         for(int i=0; i< n; i++){
             xd.addBebida(new Bebida(i));
         }
    }
    public Bebida comprarBebida(Moneda m){
      
           return  xd.getBebida();
       }
    

}
class Deposito{
     private ArrayList <Bebida>elpepe;
     public Deposito(){
         elpepe = new ArrayList();
     }
     public void addBebida(Bebida a){
         
    elpepe.add(a);
}
     public Bebida getBebida(){
    if(elpepe.size()==0){
        return null;
        
    }
    else{
    return elpepe.remove(0);
}
     }
}
class Bebida{
     private int ola;
    public Bebida(int t){
       ola=t;
    }
    public int getSerie(){
        return ola;
    }
    public String beber(){
        return new String("gluglu");
    }

}
class Moneda{
    public Moneda(){
    
}
}
package preg26;
import java.util.ArrayList;
public class Preg26 {
 public static void main(String[] args) {
     Bebida n = new Bebida(1);
     n.getSerie();
     System.out.println(n.getSerie());
     Deposito y = new Deposito();
     y.addBebida(null);
     y.getBebida();

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
    public void beber(){
        
    }
}
class Deposito{
    private ArrayList<Bebida>elpepe;
    public Deposito(){
        elpepe = new ArrayList<Bebida>();
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

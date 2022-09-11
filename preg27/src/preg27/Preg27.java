package preg27;
public class Preg27 {
    public static void main(String[] args) {
       Expendedor a = new Expendedor();
       Moneda b = new Moneda();
       a.comprarBebida(null);
     
    }
    
}
class Expendedor{
    public Expendedor(){
        Bebida a= new Bebida();
    }
    public Bebida comprarBebida(Moneda m){
      
           return new Bebida();
       }
    
}
class Bebida{
    public Bebida(){
    
}
    public String beber(){
    return new String("gluglu");
}
}
class Moneda{
    public Moneda(){
      
    }
}
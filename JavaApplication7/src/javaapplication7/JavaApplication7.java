package javaapplication7;
public class JavaApplication7 {
    public static void main(String[] args) {
   EnvaseCarton ec = new EnvaseCarton();   
          Pelota p1=new Pelota(17);               
          Pelota r1 = ec.metePelota(p1);         
          if(p1==r1)System.out.println("NO entro"+": "+p1.dameTuSerie()); 
          else System.out.println("SI entro"+": "+p1.dameTuSerie());      
          Pelota p2=new Pelota(61);             

          
          Pelota r2 = ec.metePelota(p2);                          
          Pelota saca1 = ec.damePelota();
          if(p2==r2)System.out.println("NO entro"+": "+p2.dameTuSerie()); 
          else System.out.println("SI entro"+": "+p2.dameTuSerie());                              
          if(saca1!=null)System.out.println(saca1.dameTuSerie()); 
          else System.out.println(saca1);                         
          Pelota saca2 = ec.damePelota();           
          if(saca2!=null)System.out.println(saca2.dameTuSerie()); 
          else System.out.println(saca2);          
    }
    
}
class EnvaseCarton {
private Pelota pel = null;
public EnvaseCarton(){
    
}
public Pelota metePelota(Pelota r){
    Pelota x =pel;
    if(pel==null){
  pel = r;
  return null;
    }
    else if(pel != null){
     x=r;}
    else if(x!= null){
        pel=r;
        r=x;
        x=pel;
    }
   
    return r;
}

public Pelota damePelota(){
    Pelota aux = pel;
    Pelota r=pel;
    pel=null;
    if(r==null){
        pel=aux;
    }
    else if(pel != null && r ==null){
       pel=r;
       return r;}
        
      
   return aux;    
}
}
class Pelota {
    private int serie;
    public Pelota(int a){
        serie=a;
    }
    public int dameTuSerie(){
        return serie;
    }
}
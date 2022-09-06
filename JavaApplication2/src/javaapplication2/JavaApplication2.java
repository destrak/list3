package javaapplication2;
public class JavaApplication2 {
    public static void main(String[] args) {
          Pelota p=new Pelota(5);
          int s = p.dameTuSerie(); 
          System.out.println(s);   
    }
    
}
class Pelota{
    private int serie;
    public Pelota(int t){
        serie =t;
    }
    public int dameTuSerie(){
        return serie;
    }
}

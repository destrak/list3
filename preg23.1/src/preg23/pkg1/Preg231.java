package preg23.pkg1;
public class Preg231 {
    public static void main(String[] args) {
         CuatroOperaciones n = new CuatroOperaciones(1,2);
        System.out.println(n.multiplica());
          System.out.println(n.divide());
        System.out.println(n.suma());
        System.out.println(n.resta());
    }
    
}
class CuatroOperaciones{
    private SumaResta xd;
    public CuatroOperaciones(float n,float b){
      xd = new SumaResta(n,b);
    }
    public float multiplica(){
        return xd.getDos()*xd.getUno();
    }
    public float divide(){
        return xd.getUno()/ xd.getDos();
    }
    public float suma(){
        return xd.suma();
    }
    public float resta(){
        return xd.resta();
    }
}
class SumaResta{
    private float uno;
    private float dos;

public SumaResta(float r, float t){
uno=r;
dos=t;
}
public float suma(){
    return uno+dos;
}
public float resta(){
    return uno-dos;
}
public float getUno(){
    return uno;
}
public float getDos(){
    return dos;
}
}
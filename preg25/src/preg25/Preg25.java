package preg25;

public class Preg25 {

    public static void main(String[] args) {
        Bebida n = new Bebida(2);
        n.llenar(1213);
        System.out.println(n.getSerie());
        System.out.println(n.beber(2000));
        System.out.println(n.beber(2000));
        Bebida bb = new Bebida(3);
        bb.llenar(200);
        System.out.println(bb.getSerie());
        System.out.println(bb.beber(500));
        System.out.println(bb.beber(500));
        Bebida bbb = new Bebida(4);
        bbb.llenar(500);
        System.out.println(bbb.getSerie());
        System.out.println(bbb.beber(10));
        System.out.println(bbb.beber(200));
        System.out.println(bbb.beber(300));
        System.out.println(bbb.beber(300));

    }

}

class Bebida {

    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;

    public Bebida(int n) {
        serie = n;
        contenido = 0;
    }

    public int getSerie() {
        return serie;
    }

    public void llenar(int n) {
        contenido = n;
        if (n < 0) {
            contenido = 0;
        }

        if (contenido > Bebida.VOLUMEN) {
            contenido = Bebida.VOLUMEN;
        } else if (contenido < Bebida.VOLUMEN) {
            contenido = contenido;}

        
        

    }

    public int beber(int r) {
        int aux = 0;
        if (r < 0) {
            return 0;
        }
        if (contenido >= r) {
            contenido = contenido - r;
            return r;}
        
            
          if(contenido <r){
              aux=contenido;
              contenido=0;
              return aux;
                    
                    }
          return contenido;
    }
}


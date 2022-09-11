package preg23;

public class Preg23 {

    public static void main(String[] args) {
        int y;
        SumaResta n = new SumaResta(1,2);
        System.out.println(n.suma());
        System.out.println(n.resta());
    }

}

class SumaResta {
    private float uno;
    private float dos;

    public SumaResta(float r, float t) {
        uno = r;
        dos = t;

    }

    public float suma() {

        return uno+dos;
    }

    public float resta() {

        return uno-dos;
    }
}

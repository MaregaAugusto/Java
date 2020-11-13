package Java.Level1;

public class Factoreal {
    
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public Factoreal(int x){
        this.setX(x);
    }

    public String factor(){
        int datos = 1;
        for (int i = 1; i <= this.getX() ; i++) {
            datos *= i; 
        }
        return Integer.toString(datos);
    }
}

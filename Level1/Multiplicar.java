package Java.Level1;

public class Multiplicar {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Multiplicar(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public String multi(){
        int datos = 0;
        for (int i = 1; i <= this.getY() ; i++) {
            datos += this.getX(); 
        }
        return Integer.toString(datos);
    }


}

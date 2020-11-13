package Java.Level1;

public class Aumentar {
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public Aumentar(int x){
        this.setX(x);
    }

    public String crecer(){
        String datos = "";
        for (int i = 1; i <= this.getX() ; i++) {
            for (int j = 1; j <=i ; j++) {
                datos += Integer.toString(j) + " ";
            }
            datos += "\n";
        }
        return datos;
    }

}

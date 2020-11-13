package Java.Level1;

public class Aritmetica {
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
    public Aritmetica(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public String Suma() {
        int res = x+y;
        return (x+"+"+y+"="+res);
    }
    public String Resta() {
        int res = x-y;
        return (x+"-"+y+"="+res);
    }
    public String Multiplicacion() {
        int res = x*y;
        return (x+"*"+y+"="+res);
    }
    public String Division() {
        int res = x/y;
        return (x+"/"+y+"="+res);
    }
    public String Resto() {
        int res = x%y;
        return (x+"%"+y+"="+res);
    }
    public String mostrarTodo() {
        return (this.Suma()+"\n"+this.Resta()+"\n"+this.Multiplicacion()+"\n"+this.Division()+"\n"+this.Resto());
    }

}

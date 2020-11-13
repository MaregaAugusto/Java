package Java.Level1;

public class Letra {

    private String text;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public Letra(String text){
        this.setText(text);
    }

    public String mayuscula(){
        int x, con =97;
        char r= (char)con;
        char aux= (char)con;
        String salida = "";
        char [] arraycadena = (this.getText()).toCharArray();
        
        for (int i = 0; i < arraycadena.length; i++) {
            while (arraycadena[i] != r) {
                con++;
                r = (char)con;
            }
            x = con - 32;
            aux = (char)x;
            salida += Character.toString(aux);
            con =97;
            r= (char)con;
        }

        return salida;
    }

}

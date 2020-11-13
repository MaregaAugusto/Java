package Java.Level1;

/**
 * canLetras
 */
public class canLetras {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public canLetras(String text){
        this.setText(text);
    }

    public int cantidad(char letra){
        int con=0;
        char [] arraycadena = (this.getText()).toCharArray();
        for (int i = 0; i < arraycadena.length; i++) {
            if (arraycadena[i] == letra) {
                con +=1;
            }
        }
        return con;
    }

}
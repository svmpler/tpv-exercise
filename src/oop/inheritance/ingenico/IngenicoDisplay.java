package oop.inheritance.ingenico;

//Logger//
public class IngenicoDisplay {

    private static  IngenicoDisplay instance;

    private IngenicoDisplay(){
    }

    public static IngenicoDisplay getInstance(){
        if(instance == null)
            instance = new IngenicoDisplay();
        return instance;
    }

    public void showMessage(int x, int y, String message) {
    }

    public void clear() {
    }
}

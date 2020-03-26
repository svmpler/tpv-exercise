package oop.inheritance.ingenico;

public class IngenicoKeyboard{

    private static  IngenicoKeyboard instance;

    private IngenicoKeyboard(){

    }

    public  static IngenicoKeyboard getInstance()
    {
        if(instance == null)
            instance = new IngenicoKeyboard();
        return instance;
    }

    public String get() {
        return "Key pressed";
    }
}

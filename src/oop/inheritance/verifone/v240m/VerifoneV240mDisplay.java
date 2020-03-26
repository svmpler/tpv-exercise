package oop.inheritance.verifone.v240m;

//Logger//
public class VerifoneV240mDisplay{

    private static VerifoneV240mDisplay instance;

    private VerifoneV240mDisplay(){
    }

    public static VerifoneV240mDisplay getInstance(){
        if(instance == null)
            instance = new VerifoneV240mDisplay();
        return instance;
    }

    public void showMessage(int x, int y, String message) {
    }

    public void clear() {
    }
}

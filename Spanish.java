/**
 * @author Alex Phakdy
 */
public class Spanish implements State {
    private French french;
    public Spanish(Spanish spanish)
    {
        this.spanish = spanish;
    }
    public void pressEnglishButton(){
        System.out.println("You are now entering in English mode...");
    }
    public void pressStarButton(){
        System.out.println("Playing twinkle twinkle little star...");
    }
    public void pressHappyButton(){
        System.out.println("Playing if you're happy and you know it...");
    }
    public void pressFrenchButton(){
        System.out.println("You are entering in French mode...");
        english.setState(english.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("You are already in Spanish mode.");
        english.setState(english.getSpanishState());
    }

}


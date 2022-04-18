/**
 * @author Alex Phakdy
 */
public class EnglishState implements State {
    private English english;
    public EnglishState(English english)
    {
        this.english = english;
    }
    public void pressEnglishButton(){
        System.out.println("You are already in English mode.");
    }
    public void pressStarButton(){
        System.out.println("Playing twinkle twinkle little star...");
    }
    public void pressHappyButton(){
        System.out.println("Playing if you're happy and you know it...");
    }
    public void pressFrenchButton(){
        System.out.println("You are entering now in French mode...");
        english.setState(english.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("You are now entering in Spanish mode...");
        english.setState(english.getSpanishState());
    }

}

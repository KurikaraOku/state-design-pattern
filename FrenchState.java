/**
 * @author Alex Phakdy
 */
public class FrenchState implements State{
    private French french;
    public FrenchState(French french)
    {
        this.french = french;
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
        System.out.println("You are already in French mode.");
        english.setState(english.getFrenchState());
    }
    public void pressSpanishButton(){
        System.out.println("You are now entering in Spanish mode...");
        english.setState(english.getSpanishState());
    }

}

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor=JOptionPane.showInputDialog("What flavor do you want?");
	Popcorn popcorn = new Popcorn(flavor);
String cookTime=JOptionPane.showInputDialog("How long should it be cooked for?");
Microwave microwave = new Microwave();
microwave.putInMicrowave(popcorn);
microwave.setTime(Integer.parseInt(cookTime));
microwave.startMicrowave();
popcorn.eat();


}
}

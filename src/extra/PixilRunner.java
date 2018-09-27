package extra;

public class PixilRunner {
public static void main(String[] args) {
	PixelParty party = new PixelParty();
	party.drawCircle(50, 50, 50);
	party.drawRectangle(100, 100, 200, 20);
	party.saveImage();
	party.displayImage();
}
}
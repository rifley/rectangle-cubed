import java.io.Console;

public class App{
	public static void main(String[] args) {
		Console myConsole = System.console();
		System.out.println("Enter length");
		int length = Integer.parseInt(myConsole.readLine());
		System.out.println("Enter width");
		int width = Integer.parseInt(myConsole.readLine());
		Rectangle currentRectangle = new Rectangle(length, width);
		boolean squareResult = currentRectangle.isSquare();
		System.out.println ("Is you rectangle a square?: " + squareResult);
	}
}

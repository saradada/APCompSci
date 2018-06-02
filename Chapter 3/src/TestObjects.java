import java.awt.Point;
import java.awt.Rectangle;

public class TestObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice die = new Dice();
		for (int i = 0; i<21; i++) {
			die.roll();
			System.out.println(die.getValue());
		}
	}

}

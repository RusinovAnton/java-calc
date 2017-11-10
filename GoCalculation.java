import myclass.calc.*;
import java.util.*;


public class GoCalculation {
	public static void main(String[] args) {
		Float[] array = { 0.3f, 0.7f, 0.9f, 1.3f, 1.7f, 1.9f, 2.3f, 2.7f, 2.9f, 3.3f, 3.7f };
		ArrayList<Float> mas = new ArrayList<>(Arrays.asList(array));

		Calculation my_calc = new Calculation(mas);

		Float result = my_calc.calc();

		System.out.println(result.toString());
	}
}

import myclass.calc.*;
import java.util.*;


public class GoCalculation {
	public static void main(String[] args) {
		ArrayList<Float> arrList = new ArrayList<>();

		arrList.add( new Float("0.3f") );
		arrList.add( new Float("0.7f") );
		arrList.add( new Float("0.9f") );
		arrList.add( new Float("1.3f") );
		arrList.add( new Float("1.7f") );
		arrList.add( new Float("1.9f") );
		arrList.add( new Float("2.3f") );
		arrList.add( new Float("2.7f") );
		arrList.add( new Float("2.9f") );
		arrList.add( new Float("3.3f") );
		arrList.add( new Float("3.7f") );

		Calculation my_calc = new Calculation(arrList);

		Float result = my_calc.calc();

		System.out.println(result.toString());
	}
}

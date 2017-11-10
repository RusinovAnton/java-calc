package myclass.calc;

import myclass.calc.*;
import java.util.*;

public class Calculation extends BaseCalculation {
	public Calculation() {
		this(null);
	}

	public Calculation(ArrayList<Float> mas) {
		m_mas = mas;
	}

	public void scanConsole() {}

	public void saveToFile() {}

	public void scanFile() {}

	public Float calc() {
		float S = 0;

		for (int i = 0; i < m_mas.size(); i++) {
			float a = m_mas.get(i).floatValue();
			float result = 1 + (float) Math.sin(a) + (float) Math.sin(a / 2);

			S += result;
		}

		return S;
	}

	private ArrayList<Float> m_mas;
}

package myclass.calc;

public class Calculation extends BaseCalculation {
	public Calculation() {
		this(null);
	}

	public Calculation(float[] mas) {
		m_mas = mas;
	}

	public void scanConsole() {}

	public void saveToFile() {}

	public void scanFile() {}

	public Float calc() {
		float S = 0;

		for (int i = 0; i < m_mas.length; i++) {
			float a = m_mas[i];
			float result = 1 + (float) Math.sin(a) + (float) Math.sin(a / 2);

			S += result;
		}

		return S;
	}

	private float[] m_mas;
}

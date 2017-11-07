package myclass.calc;

import java.io.*;
import java.util.*;
import myclass.calc.*;

public class Calculation extends BaseCalculation {
	public Calculation() {}

	public Float scanConsole(int i) {
		Scanner in = new Scanner( System.in );
		System.out.printf( "Enter %d value:", i+1 ); 

		return in.nextFloat( );
	}

	public void saveToFile() throws IOException {
		final int MAX = 11;

		DataOutputStream dataOut = new DataOutputStream( new FileOutputStream( "calc.dat" ) ); 
		
		try { 
			for( int i=0; i < MAX; i++ ) {
				dataOut.writeFloat( this.scanConsole(i) );
			}
		}
		finally { dataOut.close( ); }
	}

	public ArrayList<Float> scanFile() throws IOException {
		DataInputStream dataIn = new DataInputStream( new FileInputStream( "calc.dat" ) ); 
		ArrayList<Float> result = new ArrayList<>();

		try {
			for( ;; ) result.add(Float.valueOf(dataIn.readFloat( )));
		}
		catch( EOFException e ) { } finally { dataIn.close( ); }

		return result;
	}

	public Float calc() {
		try {
			this.saveToFile();
		}
		catch (IOException error) {}

		ArrayList<Float> m_massive;
		float S = 0;

		try {
			m_massive = this.scanFile();

			for (int i = 0; i < m_massive.size(); i++) {
				float a = m_massive.get(i).floatValue();
				float result = 1 + (float) Math.sin(a) + (float) Math.sin(a / 2);

				S += result;
			}
		}
		catch (IOException error) {}

		return S;
	}

	private ArrayList<Float> m_mas;
}

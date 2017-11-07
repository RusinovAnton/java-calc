import java.io.*;
import java.util.*;


public class SaveToFile {
	public static void main(String[] args) throws IOException
	{
		final int MAX = 10;
		// Запис 10-ти цілих чисел у файл "test.dat"
		DataOutputStream dataOut = new DataOutputStream( new FileOutputStream( "test.dat" ) ); Scanner in = new Scanner( System.in );
		try {
		for( int i=0; i < MAX; i++ ) {
		System.out.printf( "Enter %d value:", i+1 ); dataOut.writeInt( in.nextInt( ) );
		} }
		finally { dataOut.close( ); }
		// Зчитування 10-ти цілих чисел з файлу "test.dat"
		DataInputStream dataIn = new DataInputStream( new FileInputStream( "test.dat" ) ); try {
		for( ;; ) System.out.print( dataIn.readInt( ) + " " );
		}
		catch( EOFException e ) { } finally { dataIn.close( ); }
		System.out.println();
	}
}
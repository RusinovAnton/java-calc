package myclass.calc;

import java.io.*;
import java.util.*;

abstract class BaseCalculation {
	public abstract void saveToFile() throws IOException;
	
	public abstract ArrayList<Float> scanFile() throws IOException;

	public abstract Float scanConsole(int i);

	public abstract Float calc();
}

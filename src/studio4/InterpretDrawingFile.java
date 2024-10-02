package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		
		Color color = new Color(redComponent, greenComponent, blueComponent);
        StdDraw.setPenColor(color);
		
		boolean isFilled = in.nextBoolean();
		
		if (shapeType.equals("rectangle")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
			double x = parameterOne;
			double y = parameterTwo;
			double halfWidth = parameterThree;
			double halfHeight = parameterFour;
			if (isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			} else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
	}
}

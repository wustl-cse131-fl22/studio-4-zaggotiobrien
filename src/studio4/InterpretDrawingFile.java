package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		Color c = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(c);
		boolean filled = in.nextBoolean();

		if (shapeType.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (filled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			} else if (!filled) {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		if (shapeType.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] xs = { x1, x2, x3 };
			double[] ys = { y1, y2, y3 };
			if (filled) {
				StdDraw.filledPolygon(xs, ys);
			}
			if (!filled) {
				StdDraw.polygon(xs, ys);
			}
		}
		if (shapeType.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			if (filled) {
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			} else if (!filled) {
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
		}
	}
}

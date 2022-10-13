package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.07);
		StdDraw.filledRectangle(0.2, 0.5, 0.07, 0.3);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledCircle(0.8, 0.5, 0.15);
		StdDraw.setPenColor(Color.WHITE);
		double [] x = {0.05, 0.2, 0.35};
		double [] y = {0.4, 0.7, 0.4};
		StdDraw.filledPolygon(x, y);
	}
}
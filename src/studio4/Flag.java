package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
StdDraw.setCanvasSize(600, 400);
        
        
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5); 

        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.15);  
        
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledCircle(0.1, 0.8, 0.1);
    
	}
}



package com.psl.training.oop.test;

import com.psl.training.oop.canvas.GameConsole;
import com.psl.training.oop.shapes.Circle;
import com.psl.training.oop.shapes.Square;
import com.psl.training.oop.shapes.Triangle;

public class TestGame {
	public static void main(String args[]) {
		GameConsole gc=new GameConsole();
		gc.draw(new Circle());
		gc.draw(new Triangle());
		gc.draw(new Square());
	}
}

package application;

import services.Calculator;

public class Application {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 2, 2);
	}

}

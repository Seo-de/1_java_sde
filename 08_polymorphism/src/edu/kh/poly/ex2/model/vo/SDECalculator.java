package edu.kh.poly.ex2.model.vo;

public class SDECalculator implements Calculator{

	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		return num1 / num2;
	}

	@Override
	public double areaOfCircle(double r) {
		return Calculator.PI * r * r; 
		// public으로 직접 접근이 가능해서 PI앞에 아무것도 안써도 괜찮아
		// 근데 Calculator.PI로 써주는게 표기상으로는 맞는 표기래
	}

	@Override
	public double pow(double a, int b) {

		double result = 1;
		for(int i=1; i<=b; i++) {
			result *= a;
		}
		return result;
		
		// double pow = Math.pow(double a, int b)
		// return pow;
		// 이렇게 해도 맞대.
	}
	
	

}

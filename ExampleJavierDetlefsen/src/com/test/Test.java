package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Circle circle = new Circle (3, "miCirculo");

        System.out.println(circle.toString());

        System.out.println("Mi circunferencia es: "+ circle.calculatePerimeter());

        System.out.println("Mi area es: " + circle.calculateArea());
        
    }

	
}

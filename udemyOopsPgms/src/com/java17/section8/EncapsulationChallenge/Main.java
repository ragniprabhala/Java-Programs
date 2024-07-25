package com.java17.section8.EncapsulationChallenge;

public class Main 
{
public static void main(String[] args)
{
	Printer printer= new Printer(60,true);
	//System.out.println(printer.);
	System.out.println("tonerLevel "+printer.addToner(150));
	System.out.println("pages printed "+printer.printPages(5));
	System.out.println(printer.getPagesPrinted());
}
}

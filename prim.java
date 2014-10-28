//orieentiert an: 
//http://learntech.rwth-aachen.de/projekte/loop/aufgaben/chrisp/inf1tudhs/inf1uebung04/primzahltest/lsg/Primzahltest.java.html

import java.io.*;
import java.util.*;
import java.lang.Math;

public class prim1{
	
	public static void main(String[] args){

	System.out.println("Geben Sie eine Zahl ein!");

		Scanner a = new Scanner(System.in);
		long x = a.nextLong();

		boolean isprime;


	long startMilliSeconds = System.currentTimeMillis();

	if(x==1){
		isprime = false;
	}
	else{
		isprime = true;
		for(long y=2; y<=Math.sqrt(x); y++){
			if(x%y==0){
				isprime = false;
				break;
			}
		}
	}

	if(isprime == false)
		System.out.println("Die Zahl ist nicht prim.");
	else
		System.out.println("Die Zahl ist prim.");
	

	long endMilliSeconds = System.currentTimeMillis();
	long duration = endMilliSeconds - startMilliSeconds;

	System.out.println("Das Programm hat "+duration+" Milisekunden benoetigt.");
	}
}

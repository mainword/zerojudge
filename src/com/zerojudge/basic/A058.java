package com.zerojudge.basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A058 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String totalData = reader.readLine();
		int total = Integer.valueOf(totalData);
		int zero 	= 0;
		int one  	= 0;
		int two 	= 0;
		for(int i =0; i< total; i++  ){
			String in = reader.readLine();
			int inputNum = Integer.valueOf(in);
			if( inputNum % 3 == 0 ){
				zero++;
			}
			else if(inputNum % 3 == 1){
				one++;
			}
			else{
				two++;
			}
		}
		System.out.println(zero + " " + one + " " + two);
	}
}

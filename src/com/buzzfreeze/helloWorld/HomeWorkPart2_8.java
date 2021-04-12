package com.buzzfreeze.helloWorld;

import java.util.Iterator;

public class HomeWorkPart2_8 {
	

	public static void main(String[] args) {
	
		int[][] twoArray = {{1,2,13},{3,4,5}};
		int sum = 0;
		
		for (int row=0;row<twoArray.length;row++) {
			for(int element = 0 ;element<twoArray[row].length;element++) {
				if(element==twoArray[row].length-1) {
					
					System.out.println("the last of row "+row+" is "+twoArray[row][element]);
					sum+=twoArray[row][element];
					
				}else {
					System.out.println(twoArray[row][element]+" from row "+row);
				}
				
			}
			
		}
		System.out.println("-------------");
		System.out.println("sum is "+sum);
	}

}

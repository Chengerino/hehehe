package geo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class unicode_main {
	public static void main(String[] args) {
		String S1="hello";
	     String S2=S1;
	     if(S1==S2){
	     	System.out.println("Same");
	     }
		
	

	}

	public static int groupOne(int[][] arr) {
		ArrayList<ArrayList<String>> arrList = new ArrayList<>();
		ArrayList<String> arrUni;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == 1) {
					arrUni = new ArrayList<String>();
					int count = 0;
					for (int a = 0; a < arrList.size(); a++) {
						if (arrList.get(a).contains("" + i + "," + j)) {
							arrUni = arrList.get(a);
							arrList.remove(a);
						}

					}
					if (arrUni.size() == 0) {

						arrUni.add("" + i + "," + j);
					}

					int addIndexI = i + 1;
					if (addIndexI < arr.length) {
						if (arr[addIndexI][j] == 1) {
							for (int a = 0; a < arrList.size(); a++) {
								if (arrList.get(a).contains("" + addIndexI + "," + j)) {

									arrList.remove(a);
								}

							}
							if (!arrUni.contains("" + addIndexI + "," + j)) {
								arrUni.add("" + addIndexI + "," + j);
							}

						}
					}
					int addIndexJ = j + 1;
					if (addIndexJ < arr[i].length) {
						if (arr[i][addIndexJ] == 1) {
							for (int a = 0; a < arrList.size(); a++) {
								if (arrList.get(a).contains("" + i + "," + addIndexJ)) {
									arrList.remove(a);
								}

							}
							if (!arrUni.contains("" + i + "," + addIndexJ)) {
								arrUni.add("" + i + "," + addIndexJ);
							}
						}
					}
					int minusIndexI = i - 1;
					if (minusIndexI >= 0) {
						if (arr[minusIndexI][j] == 1) {
							for (int a = 0; a < arrList.size(); a++) {
								if (arrList.get(a).contains("" + minusIndexI + "," + j)) {

									arrList.remove(a);
								}

							}
							if (!arrUni.contains("" + minusIndexI + "," + j)) {
								arrUni.add("" + minusIndexI + "," + j);
							}
						}

					}
					int minusIndexJ = j - 1;
					if (minusIndexJ >= 0) {
						if (arr[i][minusIndexJ] == 1) {
							for (int a = 0; a < arrList.size(); a++) {
								if (arrList.get(a).contains("" + i + "," + minusIndexJ)) {

									arrList.remove(a);
								}

							}
							if (!arrUni.contains("" + i + "," + minusIndexJ)) {
								arrUni.add("" + i + "," + minusIndexJ);
							}
						}
					}
					arrList.add(arrUni);
				}
			}
		}
		return arrList.size();
	}

}

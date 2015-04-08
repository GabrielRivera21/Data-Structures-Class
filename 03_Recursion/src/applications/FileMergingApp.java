package applications;

import java.io.*;
import java.util.Scanner;

/*
 * FileMergingApp.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: Tester for FileProcessing method, this class asks the user to input 3 archives
 * first and second for files to read and the third for where it will write the merged files.
 */
public class FileMergingApp {

	public static void main(String[] args) {
		System.out.println("Starting to read Files...");
		Scanner kb = new Scanner(System.in);
		try{
			System.out.println("Enter the name of the List 1: ");
			File fileGirls = new File(kb.nextLine()); //File 1 for merging
			if(!fileGirls.exists()){
				System.out.println("The File does not exists");
				System.exit(0);
			}
			System.out.println("Enter the name of the List 2: ");
			File fileBoys = new File(kb.nextLine()); //File 2 for Merging
			if(!fileBoys.exists()){
				System.out.println("The file 2 does not exists");
				System.exit(0);
			}
			Scanner scanGirls = new Scanner(fileGirls);
			Scanner scanBoys = new Scanner(fileBoys);
			System.out.println("Enter the name of the Merged List: ");
			String printer = kb.nextLine();
			PrintWriter fileSorted = new PrintWriter(printer); //Sorted File of File 1 & File 2
			
			FileProcessing.merge(scanGirls, scanBoys, fileSorted);
			fileSorted.close();
			scanGirls.close();
			scanBoys.close();

			System.out.println("Now showing sorted File...");
			File names = new File(printer); //Sorted File to pass to Scanner
			Scanner sorted = new Scanner(names);
			while(sorted.hasNext())
				System.out.println(sorted.next()); //Displays Sorted File
			sorted.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		kb.close();
		System.out.println("End of FileMergingApp");
		System.exit(0);
	
		

	}

}

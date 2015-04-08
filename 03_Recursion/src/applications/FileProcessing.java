package applications;

import java.io.PrintWriter;
import java.util.Scanner;

/* 
 * FileProcessing.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014 Last Edited: March 17, 2014
 * Description: This class Merges two Files into one sorted File
 */

public class FileProcessing {
	
	public static void merge(Scanner fileIn1, Scanner fileIn2, PrintWriter fileOut){
		//Initializing Booleans in order to ReadNextLines of Files and if there are elements left Out from files
		boolean file1ReadNext = true, file2ReadNext = true, leftOutFile1=false, leftOutFile2=false;
		String file1Elem = null, file2Elem = null; //elements to compare
		
		while(fileIn1.hasNext() && fileIn2.hasNext()){
			if(file1ReadNext)
				file1Elem = fileIn1.nextLine();
			if(file2ReadNext)
				file2Elem = fileIn2.nextLine();
			if(file1Elem.compareTo(file2Elem)<=0){
				fileOut.write(file1Elem + "\n");
				file2ReadNext=false; //Do NOT Read next Element of File 2
				file1ReadNext = true; //Read next element of File 1
			}else{
				fileOut.write(file2Elem + " \n");
				file1ReadNext = false; //Do NOT Read next Element of File 1
				file2ReadNext = true; //Read next Element of File 2
			}
		}
		
		
		if(!fileIn1.hasNext() && file1Elem.compareTo(file2Elem)<=0 && file1ReadNext==false)
			fileOut.write(file1Elem + "\n"); //writes the last element of File 1
		else{
			while(fileIn1.hasNext() && file1Elem.compareTo(file2Elem)<=0){
				file1Elem = fileIn1.nextLine(); //Reads the next element to write of File 1
				if(file1Elem.compareTo(file2Elem)<=0)
					fileOut.write(file1Elem + "\n"); //continues writing from File until File1Elem is Bigger than File2Elem
			}
			if(file1Elem.compareTo(file2Elem)>=0)
				leftOutFile1=true; //it exited on while of File 1 because of File 1's
								//current element is bigger than file 2's element
		}
		if(!fileIn2.hasNext() && file2Elem.compareTo(file1Elem)<=0 && file2ReadNext==false)
			fileOut.write(file2Elem + "\n"); //writes the last element of File 2
		else{
			while(fileIn2.hasNext() && file2Elem.compareTo(file1Elem)<=0){
				file2Elem = fileIn2.nextLine(); //Reads the next element of File 2
				if(file2Elem.compareTo(file1Elem)<=0)
					fileOut.write(file2Elem + "\n"); //continues writing on file 2
			}
			if(file2Elem.compareTo(file1Elem)>=0)
				leftOutFile2=true; //It exited on while because file 2 current element is bigger than file 1's element
		}
		if((file1Elem.compareTo(file2Elem)>=0  || file1Elem.compareTo(file2Elem)<=0) && leftOutFile1){
			fileOut.write(file1Elem + "\n"); //Writes where it left off from the While of FileIn1.hasNext()
			while(fileIn1.hasNext())
				fileOut.write(fileIn1.nextLine() + "\n"); //Writes the left out elements in the File 1
		}
		if((file2Elem.compareTo(file1Elem)>=0 || file2Elem.compareTo(file1Elem)<=0) && leftOutFile2){
			fileOut.write(file2Elem + "\n"); //Writes where it left off from the While of FileIn2.hasNext()
			while(fileIn2.hasNext())
				fileOut.write(fileIn2.nextLine() + "\n"); //Writes the left out elements in the File 2
		}

	}

}


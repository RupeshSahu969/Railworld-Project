package com.rupesh;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File f1= new File("rupesh.txt");
//		
//		System.out.println(f1.exists());
//		
//		try {
//			boolean result=f1.createNewFile();
//			System.out.println(result);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		boolean rs1=f1.delete();
//		System.out.println(rs1);
//		
//		
//		try {
//			Writer fw= new FileWriter(f1);
//			
//			fw.write("Hello");
//			fw.write("98");
//			fw.write("/n");
//			fw.write("Welcom");
//			fw.flush();
//			fw.close();
//			
//			
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

		
		
//		FileWriter fw= new FileWriter("abc.txt");
//		BufferedWriter bw= new BufferedWriter(fw);
//		
//		bw.write("89898989898");
//		bw.newLine();
//		bw.write("i am rupesh sahu");
//		bw.newLine();
//		bw.write("India");
//		bw.newLine();
//		char ch[]= {'a','b','c'};
//		bw.write(ch);
//		bw.flush();
//		bw.close();
//		System.out.println("done");
//		
//		
//		try {
//		File f=new File("abc.txt");
//		FileReader fr=new FileReader(f);
//		
//		char[] chr = new char[(int)f.length()];
//		
//		fr.read(chr);
//		
//		for(char c :chr) {
//			System.out.println(c);
//		}
		
//		int i =fr.read();
//		
//		while(i != -1) {
//			System.out.println((char) i);
//			i= fr.read();
//		}
		
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
		
		
		  File f1 =    new File("challange.png");
	      InputStream is =  new  FileInputStream(f1);
	        
	      byte[] num = new byte[(int)f1.length()];
	      
	        
	      try {
			is.read(num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      for(int n : num) {
	    	     System.out.print(n);
	      }
	      
	      File f2 =    new  File("challange1.png");
	         try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    OutputStream fo =     new  FileOutputStream(f2);
	    
	      try {
			fo.write(num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}

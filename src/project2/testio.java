package project2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class testio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("/home/rolex/Downloads/akilesh.txt");
try {
	file.createNewFile();
}catch (IOException e) {
	System.out.println("Unable to write"+ e.getMessage());
}

try { 
	FileWriter fw=new FileWriter(file);
	fw.write("hello world");
	fw.close();
}catch (IOException e) {
	e.printStackTrace();
}

}
}
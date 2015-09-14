package pers.aron;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException{
		File sourcefile = new File("./image/11.png");
		String target = ".\\image" + File.separator + "file" +File.separator + sourcefile.getName();
		File targetfile = new File(target);
		/*if(!targetfile.exists()){   //no need
			System.out.println(targetfile.createNewFile());
		}*/
		byte[] data = new byte[2048];
		FileInputStream input = new FileInputStream(sourcefile);
		FileOutputStream output = new FileOutputStream(targetfile);
		while(input.read(data) != -1){
			output.write(data);
		}
				
		input.close();
		output.close();
		
	}
}

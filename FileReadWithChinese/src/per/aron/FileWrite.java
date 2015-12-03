package per.aron;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWrite {

	private static String fileName = System.getProperty("user.dir") + File.separator;
	
	public static void main(String[] args) {
		String myCharset = System.getProperty("file.encoding");
		System.out.println("系统默认编码： "+myCharset );
		
		FileInputStream input = null;
		Reader reader = null;
		FileOutputStream output = null;
		Writer writer = null;
		try{
			File file = new File(fileName + "test.txt");
			output = new FileOutputStream(file);
			writer = new OutputStreamWriter(output,"UTF-8");
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			bufferWriter.write("这是中文");
			bufferWriter.flush();
			input = new FileInputStream(file);
			reader = new InputStreamReader(input,"UTF-8");
			BufferedReader buffer = new BufferedReader(reader);
			String str;
			while((str = buffer.readLine()) != null){
				System.out.print(str);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				input.close();
				reader.close();
				output.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

package pers.aron;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("all")
public class Loder {

	public static String filePath = System.getProperty("user.dir") + File.separator;
	
	public static void main(String[] args){
		try{
			URLClassLoader loder = null;
			URL[] urls = new URL[1];
			String path = new URL("file",null,filePath).toString();
			URLStreamHandler streamHandler = null;
			urls[0] = new URL(null,path,streamHandler);
			loder = new URLClassLoader(urls);
			Class clazz = loder.loadClass("aa");
			Object obj = clazz.newInstance();
			Method method = clazz.getMethod("test", null);
			method.invoke(obj);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
		
}
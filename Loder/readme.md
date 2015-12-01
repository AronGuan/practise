#加载class，并调用方法  
```
			String path = new URL("file",null,filePath).toString();
			URLStreamHandler streamHandler = null;
			urls[0] = new URL(null,path,streamHandler);
```
要用这种方式，要不然会出现错误  
java.net.MalformedURLException: unknown protocol 错误
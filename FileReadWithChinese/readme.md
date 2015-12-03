#中文乱码问题
```
input = new FileInputStream(file);
			reader = new InputStreamReader(input,"GBK");
			BufferedReader buffer = new BufferedReader(reader);
			String str;
			while((str = buffer.readLine()) != null){
				System.out.print(str);
			}
```
一开始我使用的是UTF-8格式的，但是还是乱码，不得其解，最后查资料，才知道，具体什么格式是根据文件的格式决定的，而Window格式是GBK格式的，除非你写的时候就指定文件格式是UTF-8,这样读的时候才可以用UTF-8格式来读取。

另外提及一点  
```
new FileOutputStream(file, true) //可以追加文件内容
```
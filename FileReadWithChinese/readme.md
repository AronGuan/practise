#������������
```
input = new FileInputStream(file);
			reader = new InputStreamReader(input,"GBK");
			BufferedReader buffer = new BufferedReader(reader);
			String str;
			while((str = buffer.readLine()) != null){
				System.out.print(str);
			}
```
һ��ʼ��ʹ�õ���UTF-8��ʽ�ģ����ǻ������룬������⣬�������ϣ���֪��������ʲô��ʽ�Ǹ����ļ��ĸ�ʽ�����ģ���Window��ʽ��GBK��ʽ�ģ�������д��ʱ���ָ���ļ���ʽ��UTF-8,��������ʱ��ſ�����UTF-8��ʽ����ȡ��

�����ἰһ��  
```
new FileOutputStream(file, true) //����׷���ļ�����
```
package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ��ҵ {
	public static void main(String[]args) throws IOException {
		File file=new File("D:\\������\\�μ�\\java\\����\\��־����.txt");
		File file1=new File("D:\\������\\�μ�\\java\\����\\��־����1.txt");
		Reader ss=new FileReader(file);
		char[] b=new char[(int) file.length()];
		ss.read(b);
		String str=new String(b);
		Writer write=new FileWriter(file1);
		write.write(str);
		write.close();
		System.out.println("���Ƴɹ�");
		

	}
}

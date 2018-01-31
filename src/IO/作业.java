package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class 作业 {
	public static void main(String[]args) throws IOException {
		File file=new File("D:\\东软工具\\课件\\java\\文章\\励志文章.txt");
		File file1=new File("D:\\东软工具\\课件\\java\\文章\\励志文章1.txt");
		Reader ss=new FileReader(file);
		char[] b=new char[(int) file.length()];
		ss.read(b);
		String str=new String(b);
		Writer write=new FileWriter(file1);
		write.write(str);
		write.close();
		System.out.println("复制成功");
		

	}
}

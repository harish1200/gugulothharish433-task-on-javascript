import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile {
	public static void main(String args[]) throws Exception {
		Properties  p=new Properties();
		OutputStream os=new FileOutputStream("data.in");
		p.setProperty("url","localhost\\:3306\\myOb");
		p.setProperty("name", "akhil");
		p.setProperty("pass", "0000");
		System.out.println(p);
		
		
		InputStream is=new FileInputStream("data.in");
		p.load(is);
		System.out.println(p.getProperty("name"));
		os.close();
	}
}

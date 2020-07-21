import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling1 {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("demo.txt");
	DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("write content");

		FileInputStream fis=new FileInputStream("demo.txt");
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);

	dos.close();
	dis.close();
	}
	
}
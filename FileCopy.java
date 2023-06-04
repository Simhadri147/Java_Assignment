import java.io.*;
public class FileCopy {
	public static void main(String[] args) throws IOException
	{
		FileInputStream r = new FileInputStream("Hi.java");
		FileOutputStream w = new FileOutputStream("Hello.java");
		int i;
		while((i =r.read())! = -1)
		{
			w.write((char)i);
		}
		System.out.println("copied successfully");
	}
}

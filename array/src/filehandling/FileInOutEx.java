package filehandling;

import java.io.File;
import java.io.FileOutputStream;

public class FileInOutEx {

	public static void main(String[] args) {
		File f=new File();
		FileOutputStream fos=new FileOutputStream(f);
		String s="Hello Everyone";
		byte b[]=s.getBytes();
		fos.write(65);
	}

}

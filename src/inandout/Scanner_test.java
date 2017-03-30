package inandout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Scanner_test {

	public static void main(String[] args) throws IOException {
		char[] characters = new char[30];

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);

		FileInputStream f = new FileInputStream(new File("D:\\file.txt"));
		InputStreamReader inputReader = new InputStreamReader(System.in,
				"utf-8");

		int bytesread = inputReader.read(characters);

		System.out.println("I've read :" + bytesread
				+ " characters from the InputStreamReader");

		System.out.println(Arrays.toString(characters));

		BufferedReader b = new BufferedReader(inputReader);
		String text = b.readLine();
		System.out.println("Breader text " + text);
		byte[] bytes = new byte[20];

		FileInputStream fstream = new FileInputStream("D:\\file.txt");
		int bytesread1 = fstream.read(bytes, 0, 15);
		System.out.println("Bytes read :" + bytesread);
		String str = new String(bytes, "UTF-8");
		System.out.println(str);

		BufferedReader bs = new BufferedReader(new FileReader("D:\\file.txt"));
		String texts = bs.readLine();
		System.out.println("Breadersssssss text " + texts);
	}
}
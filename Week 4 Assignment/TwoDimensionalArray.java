import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TwoDimensionalArray {

	private static Scanner scanner;
	public static void main (String[] args) {

		char[] array;
		char[][] multiArray = new char [20] [45];
		String output = "";

		String file = readFile("Coffee.txt");
		array = file.toCharArray();

			for (int row = 0; row < multiArray.length - 1; row++) {
			for (int col = 0; col < multiArray[row].length - 1; col++) {
				multiArray[row][col] = '@';
			}
		}
		int count = 0;
		for (int row = 0; row < multiArray.length - 1; row ++) {
			for (int col = 0; col < multiArray[row].length - 1; col++) {
				if (count == array.length) {
					break;
				}
				multiArray[row][col] = array[count];
				count++;
			}
		}
		for (int col = 0; col < multiArray[0].length - 1; col ++) {
			for (int row = 0; row < multiArray.length - 1; row++) {
				output = Character.toString(multiArray[row][col]);
				System.out.print(output);
			}
				System.out.println(output);
		}
	}	
		public static String readFile(String file) {

			String text = "";
			try { 
				scanner = new Scanner(new File("/Users/lugo/Desktop/Coffee.txt"));
			while (scanner.hasNext()) {
				text = text + scanner.nextLine() + "";
			}	
		} 
			catch (FileNotFoundException f) {
				System.out.println("file could not be found, please check file directory");
			}
			return text;
	}
}
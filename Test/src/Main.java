import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String fileName = "test.txt";
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("Hello friends!");
			writer.write("\nThis sentence should print to the console!");
			writer.write("\nWhat a success!");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println();
		}
	}

}

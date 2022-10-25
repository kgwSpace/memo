import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class CoreMain {
	
	public static void main(String[] args) {
		
		Path file = Paths.get("C:\\Users\\101-19\\Documents\\test.txt");
		
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('D');
			
			if(writer != null)
				writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

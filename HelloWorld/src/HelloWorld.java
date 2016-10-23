import java.io.*;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HelloUser hu;
		
		System.out.println("Hello ASE2016 - how are you now? :)");
		System.out.print("Please enter your name: ");
		String name = br.readLine();
		hu = new HelloUser(name);
		hu.greetUser();
	}

}

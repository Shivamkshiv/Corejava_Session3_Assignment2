import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class test{
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Some Numbers :");
		String a = br.readLine();
		int b = Integer.parseInt(a);
		
	    System.out.println("Printing Here : " +a);
	    
	}
}
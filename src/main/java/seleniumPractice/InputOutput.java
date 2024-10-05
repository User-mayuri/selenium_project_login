package seleniumPractice;
 
import java.io.*; 

 
public class InputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream inp =null;
		FileOutputStream output= null;
		
		try {
		inp=new FileInputStream("C:\\Users\\Mayuri\\Desktop\\book.txt");
		
		output=new FileOutputStream("C:\\Users\\Mayuri\\Desktop\\newbook.txt");
		
		char c;
		
		
		do {
			c=(char)inp.read();
			if(c=='0')
			{
				break;
			}
			//System.out.print(c);
			output.write(c);
			
		}while( c != '0');
	
	}
		finally {
			if(inp != null)
				inp.close();
			if(output != null)
				output.close();
			
				
		}}
	
}


package test_p34;
import java.io.*;

class Sample5_6 {
	
	public static void main(String[] args)
	{
		System.out.println("�п�J�r��");
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			System.out.println("�w��J�r��" + str);
		}
		
		catch(IOException e)
		{
			System.out.println("��J��X���~");
		}
	}
}
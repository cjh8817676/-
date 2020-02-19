import java.io.*;

public class Sample5_7 {
	
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("資料已寫入檔案");
			
		}
		
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}
}

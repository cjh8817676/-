import java.io.*;
public class Samole5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("寫入檔案中的兩個字串是");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}

}

package test_p32;
import java.io.*;
public class test_p32 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請問要在第幾次處裡結束迴圈呢(1~10)");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
				
		
		for (int i=0;i<=10;i++) {
			System.out.println("第"+ i + "次的處裡");
			if (i==res)
				break;
			
		}
	}

}

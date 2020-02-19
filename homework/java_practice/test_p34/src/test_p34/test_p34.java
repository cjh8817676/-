package test_p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問要在第幾次處裡結束迴圈呢(1~10)");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
				
		
		for (int i=0;i<=10;i++) {
			
			if (i==res)
				continue;
			System.out.println("第"+ i + "次的處裡");
		}
	}

}

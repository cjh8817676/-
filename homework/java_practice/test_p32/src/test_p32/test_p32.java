package test_p32;
import java.io.*;
public class test_p32 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("�аݭn�b�ĴX���B�̵����j��O(1~10)");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
				
		
		for (int i=0;i<=10;i++) {
			System.out.println("��"+ i + "�����B��");
			if (i==res)
				break;
			
		}
	}

}

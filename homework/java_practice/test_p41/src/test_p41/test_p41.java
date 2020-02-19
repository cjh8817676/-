package test_p41;

public class test_p41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		////陣列索引值，不能超過陣列本身
		///的長度」，否則將會讀不到任何資料。

		test[10] = 5;
		
		for (int i=0;i<5;i++)
		{
			System.out.println("第"+ (i+1) + "個人的分數是" + test[i] + "分");
		}
	}

}

package test_p21;

public class Sample5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int[] test;
			test = new int[5];
			
			System.out.println("�N�ȫ��w��test[10]");
			
			test[10] = 80;
			System.out.println("�N80���w��test[10]");
		}
		//Thrown to indicate that an array has been 
		//accessed with anillegal index. 
		//The index is either negative or greater 
		//than orequal to the size of the array.
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�W�L�}�C���ȤF");
		}
		System.out.println("���Q�a���槹���F");
	}

}

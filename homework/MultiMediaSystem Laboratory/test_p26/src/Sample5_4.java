
public class Sample5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] test;
			test = new int[5];
			
			System.out.println("�N�ȫ��w��test[10]");
			
			test[9] = 80;
			System.out.println("�N80���w��test[10]");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�W�L�}�C���ȤF");
			System.out.println("�o�ͤF"+e+"�o�Өҥ~");
		}
		
		finally
		{
			System.out.println("�̫�@�w�|����o�ӳB��");
		}
		
		System.out.println("���Q�a����U����");
	}

}

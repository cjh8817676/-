package test_p15;


public class test_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//給car1變數建立物件
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,gasoline);
	}

}
class Car
{
	//Car 類別
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號重設為:"+num+"汽油量重設為:"+gas);
	}
	void showcar()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量" + gas);
		
	}
}
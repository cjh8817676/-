package test_p14;


public class test_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;   
		car1 = new Car();//給car1變數建立物件
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}
class Car
{
	//Car 類別
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("車號重設為"+num);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("汽油量重設為:"+gas);
	}
}
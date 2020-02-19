package test_p26;

public class test_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();// 建立新物件就會呼叫建構子
		
		car1.show();
	}

}
class Car
{
	//Car 類別
	private int num;  //外部無法直接存取　
	private double gas;
	
	public Car()  //被呼叫的建構式（建構子）
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void show()
	{
		System.out.println("車號是:"+ this.num);
		System.out.println("汽車油量:"+ this.gas);
	}
}
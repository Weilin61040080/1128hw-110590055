public class p41 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car(1234, 20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface IVehicle 
{
	void vShow();
}

interface IMaterial 
{
	void mShow();
}

class Car implements IVehicle, IMaterial 
{
	private int num;
	private double gas;

	public Car(int n, double g) 
	{
		num = n;
		gas = g;
        System.out.println("set number " + num + ",set gas " + gas);
	}

	public void vShow() 
	{
		System.out.println("number is " + num);
		System.out.println("gas is  " + gas);
	}

	public void mShow() 
	{
		System.out.println("car made by iron");
	}
}

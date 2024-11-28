public class p32 
{
	public static void main(String[] args) 
	{
		Vehicle[] vc;
		vc = new Vehicle[2];

		vc[0] = new Car(1234, 20.5);
		vc[1] = new Plane(232);

		for (int i = 0; i < vc.length; i++) 
		{
			if (vc[i] instanceof Car)
				System.out.println("The " + (i + 1) + " object is of the Car category");
			else
				System.out.println("The " + (i + 1) + " object is not of the Car category");
		}
	}
}

abstract class Vehicle 
{
	protected int speed;

	public void setSpeed(int s) 
	{
		speed = s;
		System.out.println("set speed" + speed);
	}

	abstract void show();
}

class Car extends Vehicle 
{
	private int num;
	private double gas;

	public Car(int n, double g) 
	{
		num = n;
		gas = g;
        System.out.println("set number " + num + ",set gas " + gas);
	}

	public void show() 
	{
		System.out.println("number is " + num);
		System.out.println("gas is  " + gas);
		System.out.println("speed is " + speed);
	}
}

class Plane extends Vehicle 
{
	private int flight;
	public Plane(int f) 
	{
		flight = f;
		System.out.println("made a  " + flight + " schedule plane");
	}
	public void show() 
	{
		System.out.println("The flight schedule is " + flight);
		System.out.println("speed is " + speed);
	}
}

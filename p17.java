public class p17 
{
	public static void main(String[] args) 
	{
		Car cars[];
		cars = new Car[2];

		cars[0] = new Car();
		cars[0].setCar(1234, 20.5);

		cars[1] = new RacingCar();
		cars[1].setCar(4567, 30.5);

		for (int i = 0; i < cars.length; i++) 
		{
			cars[i].show();
		}
	}
}

class Car 
{
    protected int num;
    protected double gas;

    public Car() 
    {
        num = 0;
        gas = 0.0;
        System.out.println("made a car");
    }

    public void setCar(int n, double g) 
    {
        num = n;
        gas = g;
        System.out.println("set number " + num + ",set gas " + gas);
    }

    public void show() 
    {
        System.out.println("number is " + num);
        System.out.println("gas is " + gas);
    }
}

class RacingCar extends Car 
{
	private int course;

	public RacingCar() 
	{
		course = 0;
		System.out.println("made a racingcar");
	}

	public void setCourse(int c) 
	{
		course = c;
        System.out.println("set racingcar course " + course);
	}

	public void Show() 
	{
		System.out.println("racingcar number is " + num);
		System.out.println("gas is  " + gas);
		System.out.println("racingcar course is " + course);
	}
}



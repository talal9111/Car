
class Car{
	public String name;
	public int model;
	public String color;
	
	Car(String name,int model,String color){
		this.name = name;
		this.model = model;
		this.color = color;
	}
}

public class CarTest {
	
	public static void main(String[] args) {
		Car car1 = new Car("Hilux",2015,"White");
		Car car2 = new Car("Camry",2020,"Red");
		Car car3 = new Car("Jeep",2021,"Brouwn");
		
		System.out.println("Car Name is: " + car1.name);
		System.out.println("Car Model is: " + car1.model);
		System.out.println("Car Color is: " + car1.color);
		System.out.println("----------------------------");
		System.out.println("Car Name is: " + car2.name);
		System.out.println("Car Model is: " + car2.model);
		System.out.println("Car Color is: " + car2.color);
		System.out.println("----------------------------");
		System.out.println("Car Name is: " + car3.name);
		System.out.println("Car Model is: " + car3.model);
		System.out.println("Car Color is: " + car3.color);
	}

}

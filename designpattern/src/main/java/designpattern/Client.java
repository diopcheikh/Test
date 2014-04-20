package designpattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Standart st = new StandartImpl();
		Standart adapt = new Adapter();
		System.out.println(st.operation(2, 5));
		System.out.println(adapt.operation(2, 5));
	}

}

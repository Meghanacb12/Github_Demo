package Interface;

public class Smartphone implements GPS,Camera{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone obj = new Smartphone();
		obj.record();
		obj.getphoto();
		obj.getlocation();
		
	}

	public void record() {
		System.out.println("record");
	}
	public void getphoto() {
		System.out.println("getphoto");
	}
	public void getlocation() {
		System.out.println("getlocation");
	}
}


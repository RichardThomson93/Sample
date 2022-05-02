
public class Desktop implements Software,HardWare{

	@Override
	public void harwareResources() {
		System.out.println("Hardware Device---Printer");
	}

	@Override
	public void softwareResources() {
		System.out.println("Software---Selenium ");
	}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.harwareResources();
	d.softwareResources();
}
}

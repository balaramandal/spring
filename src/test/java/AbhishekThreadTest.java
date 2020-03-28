
public class AbhishekThreadTest extends Thread {
	
	public int x = 10;
	
	@Override
	public void run() {
		try {
			x = x+1;
			Thread.sleep(10);
			System.out.println(x);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		AbhishekThreadTest a1 = new AbhishekThreadTest();
		AbhishekThreadTest a2 = new AbhishekThreadTest();
		a1.start();
		a2.start();
	}

}

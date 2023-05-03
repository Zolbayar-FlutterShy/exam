package exam2;

public class exerciseTwo extends Thread {

	  public void run() {
			System.out.print("Ursgal ajillaj bain");
		}
		public static void main(String[] args) {
			exerciseTwo thread1 = new exerciseTwo();

			thread1.start();
		}

}

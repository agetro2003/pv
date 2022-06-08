package sql;

public class MultiThread {
	public static void main (String[] args) {
	
		for (int i=0; i<100000; i++) {
BDConexion mythread = new BDConexion();
mythread.start();

	}
	}
}

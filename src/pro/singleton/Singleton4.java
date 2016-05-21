package pro.singleton;

public class Singleton4 {
	private Singleton4() {
		
	}
	
	public static Singleton4 getInstance() {
		return SingletonHolder.instance;
	}
	
	private static class SingletonHolder {
		private static Singleton4 instance = new Singleton4();
	}
}

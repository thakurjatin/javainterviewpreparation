package pattern;


// Eager Singleton way
class SingletonEager{
	
	private static SingletonEager instancEager = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return instancEager;
	}
	
}

// lazy way

class SingletonLazy{
	
	private static SingletonLazy instancLazy;
	private SingletonLazy() {}
	
	public static SingletonLazy getInstance() {
		if(instancLazy == null) {
			instancLazy = new SingletonLazy();
		}
		return instancLazy;
	}
}

// thread safe when two class try to access same getInstane() may be 2 object created
class SingletonSyncMethod{
	
	private static SingletonSyncMethod instaSingletonSyncMethod;
	private SingletonSyncMethod() {}
	
	public static synchronized SingletonSyncMethod getInstance() {
		
		if(instaSingletonSyncMethod == null) {
			instaSingletonSyncMethod = new SingletonSyncMethod();
		}
		return instaSingletonSyncMethod;
	}
}

// thread safe sync but not whole function is sync user can read we are sync only object creation part

class SingletonSync{
	
	private static SingletonSync instanceSingletonSync;
	private SingletonSync() {}
	
	public static SingletonSync getInstance() {
		if(instanceSingletonSync == null) {
			synchronized (SingletonSync.class) {
				if(instanceSingletonSync == null) {
					instanceSingletonSync = new SingletonSync();
				}
			}
		}
		return instanceSingletonSync;
	}
}

public class SingeltonExample {

	public static void main(String[] args) {
		
		SingletonSyncMethod instance = SingletonSyncMethod.getInstance();
		System.out.println(instance.toString());
		
		
		SingletonSyncMethod instance1 = SingletonSyncMethod.getInstance();
		System.out.println(instance1);
	}
}

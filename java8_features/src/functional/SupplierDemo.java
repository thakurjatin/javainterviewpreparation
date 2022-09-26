package functional;

import java.util.function.Supplier;

//class SupplierImpl implements Supplier<String>{
//
//	@Override
//	public String get() {
//		return "Hi";
//	}
//	
//}

public class SupplierDemo {
	public static void main(String args[]) {
		
//		Supplier<String> supplier = new SupplierImpl();
//		System.out.println(supplier.get());
//	
	
	Supplier<String> siSupplier = () -> "Helloooo";
	System.out.println(siSupplier.get());
	}

}

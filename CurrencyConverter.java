public class CurrencyConverter {
		int rupee;
		int dirham;
		int real;
		int chileanPeso;
		int mexicanPeso;
		int _yen;
		int $australian;
		//int Ruppe = 63;
	
	 void printCurrency() {
		// exchange rates for 1 us dollar
		rupee = 63; //india
		dirham = 3; //UAE
		real = 3; //brazil
		chileanPeso = 595;
		mexicanPeso = 18;
		_yen = 107;
		$australian = 2;
		
		
		System.out.println("rupee: " + rupee);
		System.out.println("dirham: " + dirham);
		System.out.println("real: " + real);
		System.out.println("chilean peso: " + chileanPeso);
		System.out.println("mexican peso: " + mexicanPeso);
		System.out.println("yen: " + _yen);
		System.out.println("australian: " + $australian);
		
	}
	
	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrency();
	}

}
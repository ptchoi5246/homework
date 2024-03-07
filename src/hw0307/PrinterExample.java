package hw0307;
//Run
public class PrinterExample {
	public static void main(String[] args) {
		
		Printer printer = new Printer(); //객체 생성
		printer.println(0); //int
		printer.println(true); //boolean
		printer.println(5.7); //double
		printer.println("홍길동"); //String		
	}
}

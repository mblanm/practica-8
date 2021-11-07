import java.sql.Date;

public class MainDate {

	public static void main(String[] args) {
		Fecha today;
		
		try {
			today = new Fecha(11, 13, 2021);
			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			// Array
			int arrNum[] = {1,2,3};
			System.out.println(arrNum[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR >>>> " + e.getMessage());
		}

		try {
			int resultado = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ERROR >>>> " + e.getMessage());
		} finally {
			System.out.println("Se ha ejecutadodo el try catch");
		}
	}

}
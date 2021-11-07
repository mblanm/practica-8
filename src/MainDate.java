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
	}

}
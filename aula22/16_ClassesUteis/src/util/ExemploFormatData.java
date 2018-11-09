package util;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploFormatData {

	public static void main(String[] args) {
		Date data = new Date(0);
		System.out.println("data " + data);
		@Deprecated
		Date dataInserida = new Date(0);
		System.out.println("data inserida " + dataInserida);
		
		Calendar data2 = new GregorianCalendar();
		System.out.println("data2 "+ data2);

		data2.set(2011,3,19);
		System.out.println("mes "+ data2.get(Calendar.MONTH));
		System.out.println("dia da semana "+ data2.get(Calendar.DAY_OF_WEEK));
		System.out.println("dia dO mes "+ data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("dia do ano "+ data2.get(Calendar.DAY_OF_YEAR));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar data3 = new GregorianCalendar();
		data3.set(2010,8,25);
		System.out.println("data3 (FULL) "+ df3.format(data3.getTime()));
		
	}

}

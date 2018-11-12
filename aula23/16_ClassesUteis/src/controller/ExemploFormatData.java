package controller;

import java.sql.Date;
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

	}

}

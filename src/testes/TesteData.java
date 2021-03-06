package testes;

import java.util.Calendar;
import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		
		
		String data = "2015-03-12";
		String parte1 = data.substring(8);
		String parte2 = data.substring(5,7);
		String parte3 = data.substring(0,4);
		System.out.println(parte1 + "/" + parte2 + "/" + parte3);
		
		long retorno = DiferencaDatas("20151001", "20151013");
		System.out.println(retorno);
		
		
		
	}	
	
	public static long DiferencaDatas(String dataInicial, String dataFinal){  
	      
	    Date data1 = new Date(), data2 = new Date();  
	      
	    Calendar c1 = Calendar.getInstance();  
	      
	    //Pega a primeira data  
	    c1.set(Integer.parseInt(dataInicial.substring(0, 4)), Integer.parseInt(dataInicial.substring(4, 6)), Integer.parseInt(dataInicial.substring(6, 8)));  
	    data1.setTime(c1.getTimeInMillis());  
	      
	    //Pega a segunda data  
	    c1.set(Integer.parseInt(dataFinal.substring(0, 4)), Integer.parseInt(dataFinal.substring(4, 6)), Integer.parseInt(dataFinal.substring(6, 8)));  
	    data2.setTime(c1.getTimeInMillis());  
	  
	    return (data2.getTime() - data1.getTime()) /1000/60/60/24;  
	}  
	
}

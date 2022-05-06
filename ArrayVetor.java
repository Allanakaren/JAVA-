package helloword;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", 
				        "jul", "ago", "set", "out", "nov", "dez"};
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   
		for(int c = 0; c<mes.length; c++)
		{
			System.out.println("\nO mês de "+ mes[c]+ " tem "+tot[c]+" dias ao todo.");
		}
			
			
			
			
			
			
			
			
	}

}

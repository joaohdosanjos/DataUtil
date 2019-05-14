package es.datautil;

public class Data {
	private int ano; 
	
	/**
	 * Diz se um determinado ano � bissexto ou n�o
	 * 
	 * @param ano Inteiro com o valor do ano a avaliar
	 * @return true ou false consoante o ano for bissexto ou n�o
	 */
	public static boolean anoBissexto(int ano)
	{
		// IMPLEMENTAR
		// Implemente a l�gica a partir do Fluxograma dado em anexo!
		if (ano % 4 == 00 ) || ( ano % 100 == 0 ) || (ano % 400 == 0){
			return true;
	} else {
		return false;
	}
	
	
	/**
	 * Diz quantos dias um determinado m�s tem 
	 * 
	 * @param mes Valor do enumerado Meses com o m�s a avaliar
	 * @return Devolve o n�mero de dias do m�s
	 * @throws IllegalArgumentException se o m�s passado for Fevereiro, � necess�rio usar a outra assinatura do m�todo
	 */
	public static int diasMes( Meses mes)
	{
		// IMPLEMENTAR
		// Implemente a l�gica a partir do Fluxograma dado em anexo!
		
		
		return 0;
	}
	

	
	/**
	 * Diz quantos dias um determinado m�s tem. 
	 * esta assinatura com 2 argumentos � adequada quando � o m�s 2 (Fevereiro)
	 * 
	 * @param mes  Valor do enumerado Meses com o m�s a avaliar
	 * @param ano  Valor inteiro representando o ano 
	 * @return Devolve o n�mero de dias do m�s
	 */
	public static int diasMes( Meses mes, int ano)
	{
		// Testa se o ano � bisseexto caso o mes seja Meses.FEVEREIRO
		
			
		
		// Se n�o for Meses.FEVEREIRO, ignora o ano e chama o m�todo diasMes(mes)
		
		
		
		return 0;
	}

	
	
	
	
	
	
}

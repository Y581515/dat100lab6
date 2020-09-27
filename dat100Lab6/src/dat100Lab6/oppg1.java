package dat100Lab6;

public class oppg1 {

	public static void main(String[] args) {
		
		boolean[][] aud = 
			{ 
			  {true, true, true, true}, // rad 0
			  {true, true, true, true}, // rad 1
			  {true, true, true, true}, // rad 2
			  {true, true, true, true}, // rad 3
		};

		//a
		System.out.println("antall ledige plasser er: "+antall (aud));

		//b
		System.out.println("\n"+opptat (aud)+"% av plassene er opptatt.\n");
		
		//c
		førstLedigPlass (aud);
		
		//d
		System.out.println("there is a free sit!? "+ledigPlass(aud)+"\n");
		
		//e
		ledigPlassIMellom(aud);
		
		
	}
	
	//1a
	public static int antall (boolean [][]tab) {
		
		int antal=0;
		for (int r = 0; r < tab.length; r++) {
			
			for (int p = 0; p < tab[r].length; p++) {

				if (tab[r][p]) {
					antal++;
				}
			}
		}
		return antal;
	}
	
	//1b
	public static double opptat (boolean [][]tab) {
		double antFalse=0;
		double antTotalt=0;
		for (int r = 0; r < tab.length; r++) {

			for (int p = 0; p < tab[r].length; p++) {

				if (tab[r][p]) {
					antTotalt++;
					
				} else {
					antTotalt++;
					antFalse++;	
				}
			}
		}
		
		double opptattIProsent=(antFalse*100)/(antTotalt);
		return opptattIProsent;
	}
	
	//1c
	public static void førstLedigPlass (boolean [][]tab) {
		
		int r = 0;
		boolean funnet = false;
		
		while (r < tab.length && !funnet) {
			
			int p = 0;
			while (p<tab[r].length && !funnet) {
				
				if ((tab[r][p])) {
					funnet = true;
					System.out.println("["+r+","+p+"]\n");
				}
				
				p++;
			}
				r++;
		}
		if(!funnet) {
			System.out.println("det er ikke noe ledig plass desvere!!!\n");
		}
	}
	
	//1d
	public static boolean ledigPlass(boolean [][]tab) {

		boolean funnet=false;
		if(!funnet) {
			for (boolean[] rad : tab) {
	
				for (boolean plass : rad) {
	
					if (plass) {
						funnet=true;
					} 
				}
			}
		}
		return funnet;
	}
	
	//1e
	public static void ledigPlassIMellom(boolean [][]tab) {
		boolean toIMellom=true;
			if(toIMellom) {
				for (int r = 0; r < tab.length; r++) {
	
					for (int p = 0; p < tab[r].length-3; p++) {
							
							if ((tab[r][p+1] && tab[r][p+2])
									||(tab[r][p]&&tab[r][p+1]&tab[r][p+2])
									||(tab[r][p+1]&&tab[r][p+2]&&tab[r][p+3])
									||(tab[r][p]&&tab[r][p+1]&&tab[r][p+3])
									||(tab[r][p]&&tab[r][p+2]&&tab[r][p+3])) {
								System.out.println("det er minimum to ledige plasser mellom personer i rad: "+r);
								
							}else {
								toIMellom=false;
								System.out.println("det er ikke minimum to ledige plasser mellom personer i rad: "+r);
							}		
					}
				}
			}System.out.println(toIMellom);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

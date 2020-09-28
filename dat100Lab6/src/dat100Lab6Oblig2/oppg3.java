package dat100Lab6Oblig2;

import java.lang.reflect.Array;

public class oppg3 {

	public static void main(String[] args) {
		int [][]mat={{1,2,3},
				     {4,5,6},
					 {7,8,9}					
					};
		int [][]mat2= {{1,2,3},
					   {4,5,6},
					   {7,8,9}					
					  };
		
		int [][]a1={{1,2,3},
					{4,5,6}	
				   };
		
		int [][]b1={{1,4},
					{2,5},
					{3,6}				
				   };
		
		
		int [][]a2={{2,2,2,2,2},
					{3,3,3,3,3},
					{4,4,4,4,4},
					{5,5,5,5,5},
					{6,6,6,6,6}				
				   };
		
		int [][]b2={{5,5,5,5,5},
				    {6,6,6,6,6},
				    {7,7,7,7,7},
				    {7,7,7,7,7},
				    {8,8,8,8,8}				
			       };
		
		int [][]c={{1},
				   {2},
				   {3}				
			      };
	
		
		//3a
		System.out.println("skrivUt metoden: ");
		skrivUtv1(mat);
		
		//3b
		System.out.println("Streng metoden: ");
		System.out.println("matrise: mat");
		System.out.println(tilStreng (mat));
		System.out.println("matrise: mat2");
		System.out.println(tilStreng (mat2));
		System.out.println("matrise: a1");
		System.out.println(tilStreng (a1));
		System.out.println("matrise: b1");
		System.out.println(tilStreng (b1));
		System.out.println("matrise: a2");
		System.out.println(tilStreng (a2));
		System.out.println("matrise: b2");
		System.out.println(tilStreng (b2));
		System.out.println("matrise: c");
		System.out.println(tilStreng (c));
		
		//3f 
		//System.out.println(mat.length); //bare sjekker 
		//System.out.println(mat2[0].length); //bare sjekker 
		System.out.print(tilStreng (mat)+"*\n"+tilStreng (mat2)+" = \n");
		skrivUtv1((multipliser(mat,mat2)));
		System.out.print(tilStreng (a1)+"*\n"+tilStreng (b1)+" = \n");
		skrivUtv1(multipliser(a1,b1));
		System.out.print(tilStreng (a2)+"*\n"+tilStreng (b2)+" = \n");
		skrivUtv1(multipliser(a2,b2));
		System.out.print(tilStreng (a1)+"*\n"+tilStreng (c)+" = \n");
		skrivUtv1(multipliser(a1,c));
		
		//3d
		System.out.println("er matrise(mat) og og matrise(mat2) like: "+erLik(mat,mat2)+"\n");
		
		//3c
		skrivUtv1(mat);
		int z=2;
		System.out.println("matrise(mat) gang "+z+" er");
		skrivUtv1(skaler(z, mat));
		
		//3e
		System.out.println("speil til matrise(mat)*"+z+": ");
		skrivUtv1(speile(mat));
	}
	
	//3a
	public static void skrivUtv1(int[][] matrise) {
		
		for(int[] i: matrise) {
			
			System.out.print("[");
			for(int j:i){
				System.out.print(j+ " ");	
			}System.out.println("]");	
			
		}System.out.println();
	}

	//3b
	public static String tilStreng (int[][] matrise) {
		String mats="";
		for(int[] rad: matrise) {
		
			for(int plass:rad) {
				mats+=plass+" " ;		
			}mats+="\n";;
		}
		return mats;	
	}
	
	//3c
	public static int[][] skaler(int tall, int[][] matrise){
		
		for(int rad=0;rad<matrise.length;rad++) {
			
			for(int plass=0;plass<matrise[rad].length;plass++) {
				matrise[rad][plass]=matrise[rad][plass]*tall;
			}
		}		
		return matrise ;
	}

	//3d
	public static boolean erLik(int[][] matrise1, int[][] matrise2) {
		boolean erLike=true;
		for(int rad=0;rad<matrise1.length;rad++) {
			
			for(int plass=0;plass<matrise1[rad].length;plass++) {
				
				if(matrise1[rad][plass]!=matrise2[rad][plass]) {
					erLike=false;
				}
				
			}
		}
		return erLike;	
	}
		
	//3e
	public static int[][] speile(int[][] matrise) {
		
		
		for(int rad=0;rad<matrise.length;rad++) {
			for(int plass=0;plass<(matrise[rad].length)/2;plass++) {
				int temp=matrise[rad][plass];
				matrise[rad][plass]=matrise[rad][matrise.length-(1+plass)];
				matrise[rad][matrise.length-(1+plass)]=temp;
			}	
		}
		return matrise ;
	}

	//3f
	public static int[][] multipliser(int[][] a, int[][] b){
		int [][] c= new int [a.length][b[0].length];
		for(int radNr=0;radNr<c.length;radNr++){
				
				int radlengde=c[0].length;
				int[] rad=c[radNr];
		
				for(int k=0;k<radlengde;k++) {
					
					int sum=0;
					for(int r=0;r<b.length;r++) {		
						sum+=a[0+1*radNr][r]*b[r][k];		
					}
					rad[k]=sum;
				}	
		}
		return c;
	}

}









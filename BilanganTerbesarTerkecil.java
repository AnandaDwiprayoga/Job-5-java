import java.util.Scanner;
public class BilanganTerbesarTerkecil { 			
	public static void main(String[] args) {		
		Scanner xy = new Scanner(System.in);		
		
		int angka1, angka2, angka3;				
		
		System.out.print("Masukkan angka pertama: ");	
		angka1 = xy.nextInt();	
		System.out.print("Masukkan angka kedua: ");		
		angka2 = xy.nextInt();	
		System.out.print("Masukkan angka ketiga: "); 	
		angka3 = xy.nextInt();	
		
		if(angka1 > angka2  && angka2 > angka3) {						
			System.out.println("angka terbesar adalah: " + angka1);
			System.out.println("angka terkecil adalah: " + angka3);
		}else if(angka2 > angka3 && angka3 > angka1) {					
			System.out.println("angka terbesar adalah: " + angka2); 
			System.out.println("angka terkecil adalah: " + angka1);
		}else if(angka3 > angka1 && angka1 > angka2) {	
			System.out.println("angka terbesar adalah: " + angka3); 
			System.out.println("angka terkecil adalah: " + angka2); 
		}else if(angka1 > angka3  && angka3 > angka2) {  
			System.out.println("angka terbesar adalah: " + angka1);	
			System.out.println("angka terkecil adalah: " + angka2);	
		}else if(angka2 > angka1 && angka1 > angka3) {   
		System.out.println("angka terbesar adalah: " + angka2); 
		System.out.println("angka terkecil adalah: " + angka3); 
		}else if(angka3 > angka2 && angka2 > angka1) { 	
			System.out.println("angka terbesar adalah: " + angka3); 
			System.out.println("angka terkecil adalah: " + angka1); 
		}else {												
			System.out.println("INPUTAN JANGAN KEMBAR"); 
		}
	}
}
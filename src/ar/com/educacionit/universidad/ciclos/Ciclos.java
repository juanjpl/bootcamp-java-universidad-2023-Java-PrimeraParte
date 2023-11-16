package ar.com.educacionit.universidad.ciclos;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for
		/*
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		*/
		
		//while
		/*
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		*/
		//Do-while
		
		int i=0;
		do {
			System.out.println(i++);
		}while(i<10);

		
		//arrays
		int[] edades = { 0,2,4,5,6,9};
		int[] edades2 = new int[6];
		
for(int v : edades) {
	System.out.println(v);
}

for(int j=0; j<edades2.length;i++) {
	
	edades2[j]= edades[j];
	System.out.println(edades2[j]);
}


}
}

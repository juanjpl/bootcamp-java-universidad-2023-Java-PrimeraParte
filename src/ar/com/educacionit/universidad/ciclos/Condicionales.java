package ar.com.educacionit.universidad.ciclos;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean llueve = true;
		if(llueve) {
System.out.println("Llueve");
	}else {
		System.out.println("No llueve");
}
		
		int edad = 37;
		if(edad == 18) {
			System.out.println("18");
		}else if(edad ==35) {
			System.out.println("35");
		}else if(edad >36 && edad<=37) {
			System.out.println("36 o 37");
		}else {
			System.out.println("Ninguno");
		}
		
		//switch
		int edades = 29;
		switch(edades) {
		case 18:{System.out.println("18"); break;}
		case 36:{System.out.println("36"); break;}
		case 37:{System.out.println("37"); break;}

		default:{System.out.println("Edad no encontrada"); break;}
		}
		
	}
}

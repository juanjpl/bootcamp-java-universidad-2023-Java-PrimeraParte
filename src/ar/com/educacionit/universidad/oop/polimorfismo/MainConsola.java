package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playstation play1 = new Playstation("1111","Gris",1,false,32,false);
		Playstation play2 = new Playstation("2222","Negro",2,false,64,false);
		Playstation play5 = new Playstation("5555","Blanco",5,true,32,true);

		Xbox xbox360= new Xbox("111111","Negro",true,500,true);
		
		play1.play();
		play2.play();
		play5.play();
		
		xbox360.play();
		
		Consola[] consolas = new Consola[] {play1,play2,play5,xbox360};
	
		for(Consola o : consolas) {
			//abro el objecto y pido la consola que se aloja
			
			o.play();
			
			//Verificar si es play
			//	if(o.getClass().isAssignableFrom(Playstation.class)) {
			//Playstation p = (Playstation)o;
			if(o instanceof Playstation p) {
				p.getMemoria();
			}
			if(o instanceof Xbox x ) {
				x.getNombre();
			}
		}
	}

}

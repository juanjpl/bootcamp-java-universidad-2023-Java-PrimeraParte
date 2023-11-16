package ar.com.educacionit.universidad.oop.polimorfismo;

public class Playstation extends  Consola{
	
	//como digo que es hijo dee... EXTENEDS
	
	private boolean internet;
	private String[] puertosUsb;
	private int memoria;
	private boolean digital;
	private int version;
	private String modelo;
	private DiscoExterno discoExterno;
	
	public Playstation(String serie, String color, int version, boolean internet, int memoria, boolean digital) {
		//Super hace referencia al padre
		//invocamos con atributos del padre
		super(serie,"Sony","Playstation"+version, color);
	
		//primero el padre - luego el hijo
		
		//atributos propios seteando.
		this.version = version;
		this.internet = internet;
		this.digital = digital;
	}

	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}

	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}

	public boolean isInternet() {
		return internet;
	}

	public String[] getPuertosUsb() {
		return puertosUsb;
	}

	public int getMemoria() {
		return memoria;
	}

	public boolean isDigital() {
		return digital;
	}

	public int getVersion() {
		return version;
	}

	public String getModelo() {
		return modelo;
	}
	
	
	@Override
	public void play() {
		System.out.println("Jugando con la Playstation");
	}
	
	
	

}

package ar.com.educacionit.universidad.oop.polimorfismo;

public final class Xbox extends  Consola{
	
	//como digo que es hijo dee... EXTENEDS
	
	private boolean internet;
	private String[] puertosUsb;
	private int memoria;
	private boolean digital;
	private String modelo;
	private DiscoExterno discoExterno;
	
	public Xbox(String serie, String color, boolean internet, int memoria, boolean digital) {
		//Super hace referencia al padre
		//invocamos con atributos del padre
		super(serie,"Microsoft","Xbox", color);
	
		//primero el padre - luego el hijo
		
		//atributos propios seteando.
	
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

	

	public String getModelo() {
		return modelo;
	}
	
	
	
	

}

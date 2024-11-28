package dataLayer;

public class Registro {
	private int cve;
	private String nombre, direccion, telefono;
	private float saldo;
	private boolean borrado;
	
	public Registro(int cve, String nombre, String direccion, String telefono, float saldo, boolean borrado) {
		super();
		this.cve = cve;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.saldo = saldo;
		this.borrado = borrado;
	}
	
	@Override
	public String toString() {
		return cve + " | " + nombre + " | " + direccion + " | " 
				+ telefono + " | " + saldo + " | " + borrado;
	}

	public Registro() {
		this(0,"","","", 0, false);
	}

	public int getCve() {
		return cve;
	}

	public void setCve(int cve) {
		this.cve = cve;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
	
	
}

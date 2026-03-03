package ej1;

public abstract class Mascotas {
	//atributo
	protected String nombre;
	protected int edad;
	protected String estado;
	protected long fechaNacimiento;
	//constructor
	public Mascotas(String nombre, int edad, String estado, long fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEstado() {
		return estado;
	}
    //metodo para sobrescribir su nombre
	public void avanzar() {
		System.out.println(nombre);
	}// metodo de su nombre y pasos avanzado
	public void avanzarMascota(int pasos) {
		System.out.println(nombre +" avanzo " + pasos + " pasos");
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
    
	
	

}

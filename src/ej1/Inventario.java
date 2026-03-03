package ej1;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Mascotas> lista = new ArrayList<>();
	
	//vaciar inventario
	public void vaciar() {
		lista.clear();
	}
	//insertar mascota
	public void insertarMascota(Mascotas a) {
		lista.add(a);
	}
	//eliminar por nombre
	public void imprimirInventario() {
		for (Mascotas m : lista) {
			System.out.println(m.getNombre());
		}
	}
	//imprimir solo perros
	public void imprimirPerros() {
		for (Mascotas m : lista) {
			if (m instanceof Perro) {
				System.out.println(m.getNombre());
			}
		}
	}

}

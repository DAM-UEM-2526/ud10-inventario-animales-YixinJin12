package ej1;

public class Main {

	public static void main(String[] args) {

		Perro n = new Perro("Rock", 1, "OK", 11022017);
		Gato g = new Gato("Negro", 2, "OK", 05012016);
		// muestro perro
		System.out.println(n.toString());
		System.out.println(n.getNombre());
		System.out.println(n.getEstado());
		// muestro gato
		System.out.println(g.toString());
		System.out.println(g.getNombre());
		System.out.println(g.getEstado());

		// avanzo
		n.avanzar();
		// avanzo pasos
		n.avanzarMascota(2);

		// imprime el metodo propio de perro
		n.vacunarPerros();
        //cremos inventario para mostrar el perro
		Inventario in = new Inventario();
		in.insertarMascota(n);
		in.imprimirInventario();

	}

}

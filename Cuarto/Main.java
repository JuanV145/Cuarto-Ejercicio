package Cuarto;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Trabajador trabajador = new Trabajador();

		cliente.setEdad(10);
		cliente.setNombre("pepe");
		cliente.setTelefono(12345);
		cliente.setCredito(100);

		trabajador.setEdad(12);
		trabajador.setNombre("pedro");
		trabajador.setTelefono(67890);
		trabajador.setSalario(1000);

		System.out.println("Edad Cliente: " + cliente.getEdad() + " Nombre Cliente: " + cliente.getNombre()
				+ " Telefono Cliente: " + cliente.getTelefono() + " Credito: " + cliente.getCredito());

		System.out.println("Edad Trabajador: " + trabajador.getEdad() + " Nombre Trabajador: " + trabajador.getNombre()
				+ " Telefono Trabajador: " + trabajador.getTelefono() + " Salario: " + trabajador.getSalario());
	}

}

package pruebas;

import model.Cliente;
import service.ClienteService;

public class Prueba01 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Liseth", "Suarez", "Montilla", "2000-06-23", "Los Sauces 23", "Las Viñas", 
				15, 50, 18, "li12341@gmail.com", "12345", "999888777");
		ClienteService service = new ClienteService();
		
		Cliente clie = service.validarAcceso(cliente);
		System.out.println(clie);
	}

}

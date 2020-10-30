package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Cliente;
import service.ClienteService;

public class ActionLogin extends ActionSupport {
	
	private String rptLogin;
	Cliente cliente = new Cliente();
	
	public String validarLogin() {
		String rptaLogin = "";

		if (cliente.getEmail().isEmpty()) {
			addActionError("usuario vacio");
		}

		if (new ClienteService().validarAcceso(cliente) != null ) {
			addActionMessage("Bienvenido");
			rptLogin = "ok";
		} else {
			addActionError("usuario o contraseña incorrecta");
			//rptLogin = "Usuario o clave incorrecta";
			rptLogin = "error";
		}

		return rptLogin;
	}

	public String getRptLogin() {
		return rptLogin;
	}

	public void setRptLogin(String rptLogin) {
		this.rptLogin = rptLogin;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}

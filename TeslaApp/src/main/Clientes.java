package main;


public class Clientes {
private String CorreoElectronico;
private String Contrasenia; 


public Clientes(String CorreoElectronico, String Contrasenia) {
	this.CorreoElectronico = CorreoElectronico;
	this.Contrasenia = Contrasenia;
}


public String getCorreoElectronico() {
	return CorreoElectronico;
}


public void setCorreoElectronico(String correoElectronico) {
	CorreoElectronico = correoElectronico;
}


public String getContrasenia() {
	return Contrasenia;
}


public void setContrasenia(String contrasenia) {
	Contrasenia = contrasenia;
}



}



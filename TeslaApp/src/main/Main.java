package main;
import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;
import controlP5.*;

public class Main extends PApplet {
	
	int pantallas;
	PImage Compra;
	PImage Historial;
	PImage Home;
	PImage Inicio;
	PImage LogIn;
	PImage NewAccount;
	PImage Pay;
	PImage TeslaS;
	PImage TeslaSAudi;
	PImage TeslaX;
	PImage TeslaXAudi;
	PImage TeslaY;
	PImage TeslaYAudi;
	ControlP5 cp5;
	String correoclienteUno;
	String contraClienteUno;
	
	ArrayList<Clientes> clientes;
	String [] usuarios;
	String correoElectronico;
	String contrasenia;

	public static void main(String[] args) {
		
      PApplet.main("main.Main");
	}
	

	
public void settings() {
	size(375,675);	

	}

public void setup() {
	
	background(0);	
	cp5 = new ControlP5(this);
	pantallas = 0;
	Compra = loadImage("imagenes/Thanks.png");
	Historial = loadImage("imagenes/History.png");
	Home = loadImage("imagenes/Menu.png");
	Inicio = loadImage("imagenes/Inicio.png");
	LogIn = loadImage("imagenes/LogIn.png");
	NewAccount = loadImage("imagenes/Register.png");
    Pay = loadImage("imagenes/PayInfo.png");
	TeslaS = loadImage("imagenes/TeslaS.png");
	TeslaSAudi = loadImage("imagenes/TeslaSAudi.png");
	TeslaX = loadImage("imagenes/TeslaX.png");
	TeslaXAudi = loadImage("imagenes/TeslaXAudi.png");
	TeslaY = loadImage("imagenes/TeslaY.png");
	TeslaYAudi = loadImage("imagenes/TeslaYAudi.png");
	
	usuarios = new String [2];
	
	usuarios[0] = "correo";
	usuarios[1] = "contrasena";

	
	camposDeTexto();
	botones();
}


public void draw() {
	
	
	
	switch(pantallas) {
	
	case 0:
		ocultarCamposDeTexto();
		ocultarBotones();
		
		image(Inicio,0,0);
		cp5.get(Button.class,"login").show();
		cp5.get(Button.class,"createNewAccount").show();
		
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
	
	case 1:
		
		// Registro Nueva Cuenta
		image(NewAccount,0,0);
		ocultarBotones();
		
		cp5.get(Button.class,"StartNewAccount").show();
		cp5.get(Button.class,"BackToStart").show();
		cp5.get(Textfield.class,"Name").setVisible(true);
		cp5.get(Textfield.class,"Age").setVisible(true);
		cp5.get(Textfield.class,"Id").setVisible(true);;
		cp5.get(Textfield.class,"Phone").setVisible(true);
		cp5.get(Textfield.class,"Email").setVisible(true);
		cp5.get(Textfield.class,"Password").setVisible(true);
		
		cp5.get(Textfield.class,"CardNumber").setVisible(false);
		cp5.get(Textfield.class,"Country").setVisible(false);
		cp5.get(Textfield.class,"HomeAdress").setVisible(false);
		cp5.get(Textfield.class,"ExpDate").setVisible(false);
		cp5.get(Textfield.class,"CardPassword").setVisible(false);
		cp5.get(Textfield.class,"Bank").setVisible(false);

		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		
		
		break;
		
	case 2:
		
		// Entrar con cuenta existente		
		image(LogIn,0,0);
		
		cp5.get(Button.class,"login").hide();
		cp5.get(Button.class,"createNewAccount").hide();
		cp5.get(Button.class,"StartLogIn").show();
		cp5.get(Button.class,"BackToStart").show();
		cp5.get(Textfield.class,"EmailLogIn").setVisible(true);
		cp5.get(Textfield.class,"PasswordLogIn").setVisible(true);
		
		cp5.get(Textfield.class,"CardNumber").setVisible(false);
		cp5.get(Textfield.class,"Country").setVisible(false);
		cp5.get(Textfield.class,"HomeAdress").setVisible(false);
		cp5.get(Textfield.class,"ExpDate").setVisible(false);
		cp5.get(Textfield.class,"CardPassword").setVisible(false);
		cp5.get(Textfield.class,"Bank").setVisible(false);
		
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
	case 3:
		// Ingreso al menu
		image(Home,0,0);
		
		ocultarBotones();
		ocultarCamposDeTexto();
		cp5.get(Button.class,"HomeBoton").show();
		cp5.get(Button.class,"BuyBoton").show();
		cp5.get(Button.class,"HistoryBoton").show();
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 4:
    	//Pantalla De Compras Tesla S
    	image(TeslaS,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"HomeBoton").show();
		cp5.get(Button.class,"BuyBoton").show();
		cp5.get(Button.class,"HistoryBoton").show();
		cp5.get(Button.class,"BackToTeslaX").show();
		cp5.get(Button.class,"NextToTeslaY").show();
		cp5.get(Button.class,"PayMyCar").show();
		cp5.get(Button.class,"TeslaSAudi").show();
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 5:
    	//Pantalla De Compras Tesla Y
    	image(TeslaY,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"HomeBoton").show();
		cp5.get(Button.class,"BuyBoton").show();
		cp5.get(Button.class,"HistoryBoton").show();
		cp5.get(Button.class,"BackToTeslaS").show();
		cp5.get(Button.class,"NextToTeslaX").show();
		cp5.get(Button.class,"PayMyCar").show();
		cp5.get(Button.class,"TeslaYAudi").show();
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 6:
    	//Pantalla De Compras Tesla X
    	image(TeslaX,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"HomeBoton").show();
		cp5.get(Button.class,"BuyBoton").show();
		cp5.get(Button.class,"HistoryBoton").show();
		cp5.get(Button.class,"BackToTeslaY").show();
		cp5.get(Button.class,"NextToTeslaS").show();
		cp5.get(Button.class,"PayMyCar").show();
		cp5.get(Button.class,"TeslaXAudi").show();
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 7:
    	//Pay My Car
    	image(Pay,0,0);
    	ocultarBotones();
    	
    	cp5.get(Textfield.class,"CardNumber").setVisible(true);
    	cp5.get(Textfield.class,"Country").setVisible(true);
    	cp5.get(Textfield.class,"HomeAdress").setVisible(true);
    	cp5.get(Textfield.class,"ExpDate").setVisible(true);
    	cp5.get(Textfield.class,"CardPassword").setVisible(true);
    	cp5.get(Textfield.class,"Bank").setVisible(true);
    	
    	cp5.get(Button.class,"BackToTeslaS").show();
    	cp5.get(Button.class,"PayCar").show();
    
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 8:
    	//Comparacion entre Audi y tesla S
    	image(TeslaSAudi,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"BackToTeslaS").show();
    		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 9:
    	//Comparacion entre Audi y tesla Y
    	image(TeslaYAudi,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"BackToTeslaY").show();
    	
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
		
    case 11:
    	//Comparacion entre Audi y tesla X
    	image(TeslaXAudi,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"BackToTeslaX").show();
    		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
    case 12:
    	//Gracias por su compra
    	image(Compra,0,0);
    	ocultarBotones();
    	ocultarCamposDeTexto();
    	cp5.get(Button.class,"BackToTeslaS").show();
    	cp5.get(Button.class,"Close").show();
    	cp5.get(Button.class,"BuyAnother").show();
    		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
		
		
		
    case 10:
		//Pantalla De Historia de compras
		image(Historial,0,0);
		ocultarBotones();
		ocultarCamposDeTexto();
		cp5.get(Button.class,"HomeBoton").show();
		cp5.get(Button.class,"BuyBoton").show();
		cp5.get(Button.class,"HistoryBoton").show();
		break;
		
		
	
	
	}
	
	
}


private void ocultarCamposDeTexto() {

	cp5.get(Textfield.class,"Name").setVisible(false);
	cp5.get(Textfield.class,"Age").setVisible(false);
	cp5.get(Textfield.class,"Id").setVisible(false);
	cp5.get(Textfield.class,"Phone").setVisible(false);
	cp5.get(Textfield.class,"Email").setVisible(false);
	cp5.get(Textfield.class,"Password").setVisible(false);
	cp5.get(Textfield.class,"EmailLogIn").setVisible(false);
	cp5.get(Textfield.class,"PasswordLogIn").setVisible(false);
	cp5.get(Textfield.class,"CardNumber").setVisible(false);
	cp5.get(Textfield.class,"Country").setVisible(false);
	cp5.get(Textfield.class,"HomeAdress").setVisible(false);
	cp5.get(Textfield.class,"ExpDate").setVisible(false);
	cp5.get(Textfield.class,"CardPassword").setVisible(false);
	cp5.get(Textfield.class,"Bank").setVisible(false);
}

private void ocultarBotones() {
	cp5.get(Button.class,"login").hide();
	cp5.get(Button.class,"createNewAccount").hide();
	cp5.get(Button.class,"StartNewAccount").hide();
	cp5.get(Button.class,"StartLogIn").hide();
	cp5.get(Button.class,"HomeBoton").hide();
	cp5.get(Button.class,"BuyBoton").hide();
	cp5.get(Button.class,"HistoryBoton").hide();
	cp5.get(Button.class,"BackToTeslaX").hide();
	cp5.get(Button.class,"BackToTeslaS").hide();
	cp5.get(Button.class,"BackToTeslaY").hide();
	cp5.get(Button.class,"NextToTeslaY").hide();
	cp5.get(Button.class,"NextToTeslaX").hide();
	cp5.get(Button.class,"NextToTeslaS").hide();
	cp5.get(Button.class,"PayMyCar").hide();
	cp5.get(Button.class,"TeslaSAudi").hide();
	cp5.get(Button.class,"TeslaYAudi").hide();
	cp5.get(Button.class,"TeslaXAudi").hide();
	cp5.get(Button.class,"PayCar").hide();
	cp5.get(Button.class,"Close").hide();
	cp5.get(Button.class,"BuyAnother").hide();
	cp5.get(Button.class,"BackToStart").hide();


}

public void camposDeTexto() {

	
cp5.addTextfield("Name")
.setPosition(93,211)
.setSize(231,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");



cp5.addTextfield("Age")
.setPosition(93,275)
.setSize(231,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");



cp5.addTextfield("Id")
.setPosition(93,340)
.setSize(231,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");


cp5.addTextfield("Phone")
.setPosition(93,402)
.setSize(231,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");


cp5.addTextfield("Email")
.setPosition(93,467)
.setSize(231,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");


cp5.addTextfield("Password")
.setPosition(114,530)
.setSize(209,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setPasswordMode(true)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");


cp5.addTextfield("EmailLogIn")
.setPosition(83,267)
.setSize(257,27)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");


cp5.addTextfield("PasswordLogIn")
.setPosition(117,338)
.setSize(222,27)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setPasswordMode(true)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

cp5.addTextfield("CardNumber")
.setPosition(138,208)
.setSize(187,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

cp5.addTextfield("Country")
.setPosition(138,464)
.setSize(187,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

cp5.addTextfield("HomeAdress")
.setPosition(138,526)
.setSize(187,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

cp5.addTextfield("ExpDate")
.setPosition(116,273)
.setSize(209,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

cp5.addTextfield("CardPassword")
.setPosition(116,399)
.setSize(209,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setPasswordMode(true)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

cp5.addTextfield("Bank")
.setPosition(84,338)
.setSize(241,26)
.setFocus(true)
//.setFont(font)
.setColor(100)
.setColorBackground(color(255,255,255,1))
.setColorActive(color(255,255,255,1)) 
.removeBehavior() 
.setLabelVisible(false)
.setCaptionLabel("");

}

public void botones() {
	
	cp5.addButton("login")
    .setPosition(30,532)
    .setSize(248,48)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("createNewAccount")
    .setPosition(30,597)
    .setSize(314,48)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("StartNewAccount")
    .setPosition(41,595)
    .setSize(288,43)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;

	cp5.addButton("StartLogIn")
    .setPosition(31,423)
    .setSize(313,47)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("HomeBoton")
    .setPosition(35,606)
    .setSize(50,50)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("BuyBoton")
    .setPosition(162,606)
    .setSize(50,50)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("HistoryBoton")
    .setPosition(289,606)
    .setSize(50,50)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("BackToTeslaX")
    .setPosition(20,24)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("BackToTeslaS")
    .setPosition(20,24)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("BackToTeslaY")
    .setPosition(20,24)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("NextToTeslaY")
    .setPosition(316,23)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("NextToTeslaX")
    .setPosition(316,23)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("NextToTeslaS")
    .setPosition(316,23)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("PayMyCar")
    .setPosition(215,461)
    .setSize(105,44)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("TeslaSAudi")
    .setPosition(215,523)
    .setSize(105,44)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("TeslaYAudi")
	.setPosition(215,523)
    .setSize(105,44)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("TeslaXAudi")
	.setPosition(215,523)
    .setSize(105,44)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("PayCar")
    .setPosition(41,595)
    .setSize(288,43)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("BuyAnother")
    .setPosition(33,589)
    .setSize(146,57)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("Close")
    .setPosition(197,589)
    .setSize(146,57)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	cp5.addButton("BackToStart")
	.setPosition(20,24)
    .setSize(37,37)
    .setColorActive(color(150)) 
    .setColorBackground(color(255,255,255,1))
    .setColorForeground(color(0,0,0,30))
    .setCaptionLabel("") 
    ;
	
	
}

public void login() {
	pantallas=2;
	entrar();
}

public void createNewAccount() {
	pantallas=1;
}

public void StartLogIn() {
	pantallas=3;
}

public void StartNewAccount() {
	pantallas=3;
	registro();
}

public void HomeBoton() {
	pantallas = 3;
}

public void BuyBoton() {
	pantallas = 4;
}

public void HistoryBoton() {
	pantallas = 10;
}

public void BackToTeslaX() {
	pantallas = 6;
}

public void BackToTeslaS() {
	pantallas = 4;
}

public void BackToTeslaY() {
	pantallas = 5;
}

public void NextToTeslaY() {
	pantallas = 5;
}

public void NextToTeslaX() {
	pantallas = 6;
}

public void NextToTeslaS() {
	pantallas = 4;
}

public void PayMyCar() {
	pantallas = 7;
}

public void TeslaSAudi() {
	pantallas = 8;
	
}

public void TeslaYAudi() {
	pantallas = 9;
	
}

public void TeslaXAudi() {
	pantallas = 11;
	
}

public void PayCar() {
	pantallas = 12;
	
}

public void Close() {
	pantallas = 0;
	
}

public void BuyAnother() {
	pantallas = 3;
	
}
public void BackToStart() {
	pantallas=0;
}


public void registro() {

	correoElectronico = cp5.get(Textfield.class, "Email").getText();
	usuarios[0] = correoElectronico;
	contrasenia = cp5.get(Textfield.class, "Password").getText();
	usuarios[1] = contrasenia;
	
	
	clientes.add(new Clientes(correoElectronico, contrasenia));


}


public void entrar() {
	
	for (int i=0; i<clientes.size();i++) {
	
		correoclienteUno = clientes.get(i).getCorreoElectronico();
		contraClienteUno=clientes.get(i).getContrasenia();
	
	if(cp5.get(Textfield.class, "Email").getText().equals(correoclienteUno) && cp5.get(Textfield.class, "Password").getText().equals(contraClienteUno)) {
		pantallas=3;
	}}
}
	 
}

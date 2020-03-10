package main;
import processing.core.PApplet;
import processing.core.PImage;
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
	
	camposDeTexto();
	botones();
}


public void draw() {
	
	ocultarCamposDeTexto();
	ocultarBotones();
	
	switch(pantallas) {
	
	case 0:
		
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
		
		cp5.get(Button.class,"StartNewAccount").show();
		cp5.get(Textfield.class,"Name").setVisible(true);
		cp5.get(Textfield.class,"Age").setVisible(true);
		cp5.get(Textfield.class,"Id").setVisible(true);;
		cp5.get(Textfield.class,"Phone").setVisible(true);
		cp5.get(Textfield.class,"Email").setVisible(true);
		cp5.get(Textfield.class,"Password").setVisible(true);

		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		
		
		break;
		
	case 2:
		
		// Entrar con cuenta existente		
		image(LogIn,0,0);
		
		cp5.get(Button.class,"StartLogIn").show();
		cp5.get(Textfield.class,"EmailLogIn").setVisible(true);
		cp5.get(Textfield.class,"PasswordLogIn").setVisible(true);
		
		
		fill(0);
		textSize(10);
		text("x: "+mouseX+"y: "+mouseY,mouseX,mouseY);
		break;
		
	case 3:
		// Ingreso con cuenta existente
		
		
		break;
		
	case 4:
		
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
}

private void ocultarBotones() {
	cp5.get(Button.class,"login").hide();
	cp5.get(Button.class,"createNewAccount").hide();
	cp5.get(Button.class,"StartNewAccount").hide();
	cp5.get(Button.class,"StartLogIn").hide();

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
	
}
public void login() {
	pantallas=2;
	
}

public void createNewAccount() {
	pantallas=1;
}


 
}

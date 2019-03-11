package mx.uaz.edu.calculadora.vistas;

import java.util.Arrays;

import com.vaadin.event.ShortcutAction;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class CalculadoraForm extends VerticalLayout{
	private TextField resultado;
	private GridLayout grid;
	
	public CalculadoraForm()
	{
		/*this.addShortcutListener(new ShortcutListener("",KeyCode.,null) {
			
			@Override
			public void handleAction(Object sender, Object target) {
				Notification.show("Hola");
				
			}
		});
		*/
		
		grid = new GridLayout(4, 6);
		
		String[] elementos = {"C","+/-","%","/","7","8","9","X","4","5","6","-","1","2","3","+","0",".","="};
		String[] elementosNaranja = {"/","X","-","+","="};
		resultado = new TextField();
		resultado.setSizeFull();
		resultado.setHeight("80px");
		grid.addComponent(resultado, 0, 0, 3, 0);
		for (String elemento : elementos) {
			Button boton = new Button(elemento);
			boton.setHeight("50px");
			
			boton.addClickListener(new Operaciones());
			if (elemento == "0"){
				grid.addComponent(boton, 0,5,1,5);
				boton.setWidth("100px");
			}
			else{
				grid.addComponent(boton);
				boton.setWidth("50px");
			}
			if (Arrays.asList(elementosNaranja).contains(elemento)){
				boton.setStyleName("btn-naranja");
			}
		}
		addComponent(grid);
	}
	class Operaciones implements ClickListener{

		@Override
		public void buttonClick(ClickEvent event) {
			String op = event.getButton().getCaption();
			switch(op) {
			//Ejemplos
				case "1":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "2":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "3":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "4":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "5":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "6":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "7":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "8":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
				case "9":
					//Notification.show(op);
					resultado.setValue(resultado.getValue()+op);
					break;
			}
			
		}
		
	}
}

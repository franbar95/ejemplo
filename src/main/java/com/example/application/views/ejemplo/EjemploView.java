package com.example.application.views.ejemplo;

import com.example.application.Application;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Ejemplo")
@Route(value = "ejemplo", layout = MainLayout.class)
public class EjemploView extends VerticalLayout {
    private static final long serialVersionUID = 1L;
    
    private int maximo = 2147483647;

	public EjemploView() {
        setSpacing(false);       
        
        TextField texto = new TextField();
        texto.setHelperText("Cantidad de clicks desde la ejecución del server.!");
        texto.setLabel("CLICKS");
        texto.setEnabled(false);
        texto.setWidth("600px");
        texto.setValue(Application.getContador()+" Clicks egristrados, faltan "+(maximo-Application.getContador())+" para tumbar el server.!");
        
        Button boton = new Button("CLIKEAME!", event -> {
        	Application.sumar();
        	//System.out.print("se han echo "+clicks +" clicks desde la ejecucion.!");
        	texto.setValue(Application.getContador()+" Clicks egristrados, faltan "+(maximo-Application.getContador())+" para tumbar el server.!");
        });
        
        boton.setHeight("100px");
        boton.setWidth("200px");
        boton.getStyle().set("textSize", "38px");
        
        add(boton);

        add(new H2("DON'T CLICK THE BUTTON!"));
        add(new Paragraph("THE CAKE IS A LIE!!!"));
                
        add(texto);

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}

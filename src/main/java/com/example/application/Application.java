package com.example.application;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@Theme(value = "ejemplo", variant = Lumo.DARK)
@PWA(name = "Ejemplo", shortName = "Ejemplo", offlineResources = {})
@NpmPackage(value = "line-awesome", version = "1.3.0")
@NpmPackage(value = "@vaadin-component-factory/vcf-nav", version = "1.0.6")
public class Application implements AppShellConfigurator {
    private static final long serialVersionUID = 1L;
    
    private static int contador = 0;

    public static void sumar() {
    	contador++;
    }
    
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Application.contador = contador;
	}
}

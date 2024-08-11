package com.ejemplo.biblioteca.modelo;

// Importa las clases necesarias de Spring Boot.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// La anotación @SpringBootApplication marca la clase principal de la aplicación y habilita la configuración automática,
// el escaneo de componentes, y la configuración de Spring Boot.
@SpringBootApplication
public class ModeloApplication {

	// El método main es el punto de entrada de la aplicación.
	public static void main(String[] args) {

		// Llama a SpringApplication.run() para iniciar la aplicación Spring Boot.
		// SpringApplication.run() arranca el contexto de la aplicación, configura el entorno y ejecuta el servidor embebido (como Tomcat).
		SpringApplication.run(ModeloApplication.class, args);
	}

}

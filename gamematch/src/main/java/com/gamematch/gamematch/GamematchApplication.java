package com.gamematch.gamematch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamematch.gamematch.modelo.Usuario;

@SpringBootApplication
@RestController
public class GamematchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamematchApplication.class, args);
	}

	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		
		Usuario usuario1 = new Usuario();
		usuario1.setNomUsuario("Juan");
		usuario1.setContraseña("1234");
		usuario1.setCorreo("juan@gmail.com");
		usuarios.add(usuario1);

		Usuario usuario2 = new Usuario();
		usuario2.setNomUsuario("Maria");
		usuario2.setContraseña("5678");
		usuario2.setCorreo("maria@gmail.com");
		usuarios.add(usuario2);

		return usuarios;
	}

}

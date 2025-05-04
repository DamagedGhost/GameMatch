package GameMatch.GameMatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gamematch.gamematch.modelo.Usuario;

@SpringBootApplication
public class GameMatchApplication {


	//prueba

	public static void main(String[] args) {
		SpringApplication.run(GameMatchApplication.class, args);

		System.out.println("Hola mundo desde GameMatchApplication");

		// prueba usuarios
		Usuario usuario = new Usuario(1, "Juan", "1234", "Juanito");
		}
}

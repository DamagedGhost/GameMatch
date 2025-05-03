package GameMatch.GameMatch.repository;

import java.util.ArrayList;
import GameMatch.GameMatch.model.Juego;

public class juegoCRUD {

    ArrayList<Juego> listaJuego = new ArrayList<>();

    public ArrayList<Juego> listar() {
        return listaJuego;
    }

    public Juego guardar(Juego juego) {
        listaJuego.add(juego);
        return juego;
    }

    public Juego buscar(Long id) {
        for (Juego juego : listaJuego) {
            if (juego.getId() == id) {
                return juego;
            }
        }
        return null;
    }

    public Juego eliminar(Long id) {
        for (Juego juego : listaJuego) {
            if (juego.getId() == id) {
                listaJuego.remove(juego);
                return juego;
            }
        }
        return null;
    }

    public Juego actualizar(Juego juego) {
        for (Juego j : listaJuego) {
            if (j.getId() == juego.getId()) {
                j.setNombre(juego.getNombre());
                j.setGenero(juego.getGenero());
                j.setPublicador(juego.getPublicador());
                j.setPlataforma(juego.getPlataforma());
                j.setFechaLanzamiento(juego.getFechaLanzamiento());
                return j;
            }
        }
        return null;
    }

} 

package com.gamematch.gamematch.controller;

@RestController
@RequestMaping("/api/juegos")
public class JuegoControlador {

    @Autowired
    private JuegoService juegoservice;

    @GetMapping
    public List<Juego> obtenerTodos() {
        return juegoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Juego obtenerPorId(@PathVariable Long id) {
        return juegoService.obtenerPorId(id);
    }

    @PostMapping
    public Juego guardarJuego(@RequestBody Juego juego) {
        return juegoService.guardarJuego(juego);
    }

    @DeleteMapping("/{id}")
    public void eliminarJuego(@PathVariable Long id) {
        juegoService.eliminarJuego(id);
    }
}



package com.ejemplo.biblioteca.controller;

// Importa las clases necesarias de Spring y otras bibliotecas.
import com.ejemplo.biblioteca.modelo.User;
import com.ejemplo.biblioteca.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Anotación que indica que esta clase es un controlador REST y se utilizará para manejar solicitudes HTTP.
@RestController
// Define la ruta base para todos los métodos en este controlador.
// Los endpoints comenzarán con "/User".

@RequestMapping("/User")
public class UsuarioController {

    // Inyección de dependencia para el repositorio de usuarios.
    // Esto permite que Spring gestione automáticamente la instancia del repositorio.
    @Autowired
    private UsuarioRepositorio userRepository;

    // Maneja las solicitudes HTTP GET para obtener todos los usuarios.
    // Esta ruta corresponde a GET /User.
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Maneja las solicitudes HTTP POST para crear un nuevo usuario.
    // Esta ruta corresponde a POST /User.
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Maneja las solicitudes HTTP GET para obtener un usuario específico por su ID.
    // Esta ruta corresponde a GET /User/{id}.
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Maneja las solicitudes HTTP PUT para actualizar un usuario existente.
    // Esta ruta corresponde a PUT /User/{id}.
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    // Maneja las solicitudes HTTP DELETE para eliminar un usuario específico por su ID.
    // Esta ruta corresponde a DELETE /User/{id}.
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}

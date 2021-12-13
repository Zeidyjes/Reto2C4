/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zorrillo.colonias.controlador;

import com.zorrillo.colonias.servicio.UserService;
import com.zorrillo.colonias.modelo.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zeidy Johana Estupiñan S.
 * @since 6 de diciebre de 2021
 * @Autowired hacer llamado al objeto
 */
@RestController// comentario requerido
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * se utilizara para mapear HTTP GET solicitudes de los datos de los
     * usuarios
     *
     * @return la lista de los usuarios
     */
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    /**
     * se utilizara para mapear HTTP POST solicitudes en la creacion de los
     * datos de los usuarios
     *
     * @param user
     * @return los nuevos usuarios
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    /**
     * se utilizan para enviar información al servidor. Si está agregando
     * información
     *
     * @param user
     * @return la actualización de los usuarios por id
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    /**
     * Elimina la asignación de URL
     *COMENTARIO REQUERIDO
     * @param id
     * @return no devuelve nada (vacio porque ha borrado al usuario por el id)
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    /**
     * se utilizara para mapear HTTP GET solicitudes de los datos de los
     * usuarios en este caso email y password
     *
     * @param email
     * @param password
     * @return la autenticación del usuario
     */
    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.authenticateUser(email, password);
    }

    /**
     * se utilizara para mapear HTTP GET solicitudes de los datos de los
     * usuarios en este caso email
     *
     * @param email
     * @return si el usuario ya existe o se encuentra registrado
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExists(@PathVariable("email") String email) {
        return userService.emailExists(email);
    }

}

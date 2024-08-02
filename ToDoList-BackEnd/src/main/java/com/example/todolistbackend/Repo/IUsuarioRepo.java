package com.example.todolistbackend.Repo;

import com.example.todolistbackend.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario AND u.esActivo = 'S'")
    Optional<Usuario> obtieneUsuarioXIdUsuario(Integer idUsuario);

    @Query("SELECT u FROM Usuario u WHERE u.correo = :correo AND u.esActivo = 'S'")
    Optional<Usuario> obtieneUsuarioXCorreo(String correo);
}

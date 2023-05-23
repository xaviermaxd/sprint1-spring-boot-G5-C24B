package com.example.TCMFriend.Service;

import com.example.TCMFriend.Dto.LoginDTO;
import com.example.TCMFriend.Dto.UsuarioDTO;
import com.example.TCMFriend.Entity.Usuario;
import com.example.TCMFriend.response.LoginResponse;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface UsuarioService {
	
	public List<Usuario> obtenerUsuario();

    String addUsuario(UsuarioDTO usuarioDTO);

	LoginResponse loginUsuario(LoginDTO loginDTO);

}

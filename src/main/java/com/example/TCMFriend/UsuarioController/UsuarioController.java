package com.example.TCMFriend.UsuarioController;

import com.example.TCMFriend.Dto.LoginDTO;
import com.example.TCMFriend.response.*;
import com.example.TCMFriend.Dto.UsuarioDTO;
import com.example.TCMFriend.Entity.Usuario;
import com.example.TCMFriend.Service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("api/v1/usuario")



public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("")
	public List<Usuario> obtenerUsuario(){
		return usuarioService.obtenerUsuario();
	}

    @PostMapping(path = "/save")
    public String saveUsuario(@RequestBody UsuarioDTO usuarioDTO)
    {
        String id = usuarioService.addUsuario(usuarioDTO);
        return id;
    }
    
    
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUsuario(@RequestBody LoginDTO loginDTO){
    	LoginResponse loginResponse = usuarioService.loginUsuario(loginDTO);
    	return ResponseEntity.ok(loginResponse);
    }


}















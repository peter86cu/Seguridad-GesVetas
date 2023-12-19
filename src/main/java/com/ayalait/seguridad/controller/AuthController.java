package com.ayalait.seguridad.controller;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayalait.seguridad.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;


import static com.ayalait.seguridad.utils.Constants.CLAVE;
import static com.ayalait.seguridad.utils.Constants.ENCABEZADO;
import static com.ayalait.seguridad.utils.Constants.PREFIJO_TOKEN;
import static com.ayalait.seguridad.utils.Constants.TIEMPO_VIDA;

@RestController
public class AuthController {

	@Autowired
	UsuarioService service;
	
	@PostMapping("login/token")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> login(@RequestParam("user") String user, @RequestParam("pwd") String pwd) throws BadCredentialsException {

		return service.buscarUsuario(user,pwd);
		
	}
	

	
	@PostMapping("login/validar")
	private boolean validarToken(HttpServletRequest request) {
		String token = request.getHeader(ENCABEZADO);
		if (token != null) {
			// Se procesa el token y se recupera el usuario y los roles.
			Claims claims=Jwts.parser()
					.setSigningKey(CLAVE)
					.parseClaimsJws(token.replace(PREFIJO_TOKEN, ""))
					.getBody();
			String user = claims.getSubject();
			List<String> authorities=(List<String>) claims.get("authorities");
			if (user != null) {
				//creamos el objeto con la información del usuario
				return true;
			}
			return false;
		}
		//throw new Exception("Debe enviar un token");
		return false;
	}
	
	@PostMapping(value="login/salir")  
	    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
	        if (auth != null){      
	           new SecurityContextLogoutHandler().logout(request, response, auth);  
	        }  
	         return "redirect:/";  
	     }  
		
}

package br.com.jogo.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.api.config.security.TokenService;
import br.com.jogo.api.dtos.TokenDto;
import br.com.jogo.api.forms.LoginForm;
import br.com.jogo.api.services.UsuarioService;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody @Valid LoginForm form){
		UsernamePasswordAuthenticationToken dadosLogin = form.converter();
		try {
			System.out.println(form);
			Authentication authentication = authenticationManager.authenticate(dadosLogin);
			Long id = usuarioService.buscarPorNome(form.getNome());
			String token = tokenService.gerarToken(authentication);
			return ResponseEntity.ok(new TokenDto(token, "Bearer", id));
		} catch (AuthenticationException e) {
			return ResponseEntity.notFound().build();
		}
	}
}

package br.com.jogo.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.BalancoPatrimonial;
import br.com.jogo.api.models.Mensagem;
import br.com.jogo.api.models.Usuario;
import br.com.jogo.api.repositories.BalancoPatrimonialRepository;
import br.com.jogo.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BalancoPatrimonialRepository balancoRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Usuario cadastro(Usuario usuario){
		configuraSenha(usuario);
		new EmailService(usuario, new Mensagem(), javaMailSender).executa();
		Usuario usuarioCriado = usuarioRepository.save(usuario);
		balancoRepository.save(new BalancoPatrimonial(usuarioCriado));
		return usuarioCriado;
	}

	private void configuraSenha(Usuario usuario) {
		String pass = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(pass);
	}

	public Long buscarPorNome(String nome) {
		Optional<Usuario> usuario = usuarioRepository.findByNome(nome);
		
		if (usuario.isPresent()) 
			return usuario.get().getId();
		
		return 0L;
	}
}

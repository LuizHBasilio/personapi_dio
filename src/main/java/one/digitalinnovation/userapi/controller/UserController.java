package one.digitalinnovation.userapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.userapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.userapi.entity.User;
import one.digitalinnovation.userapi.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@PostMapping
	public MessageResponseDTO createPerson(@RequestBody User user) {
		User savedUser = userRepository.save(user);
		return MessageResponseDTO.builder().message("Usuário criado com ID  " + savedUser.getId()).build();
	}

}

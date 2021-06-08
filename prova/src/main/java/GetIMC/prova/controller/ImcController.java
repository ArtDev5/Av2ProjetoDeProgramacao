package GetIMC.prova.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GetIMC.prova.dto.ImcDto;

@RestController
@RequestMapping("/imc")
public class ImcController {
	
	@GetMapping
	public ResponseEntity<String> calcularImc(@RequestBody ImcDto input){
		new ImcDto(input.getPeso(), input.getAltura());
		return ResponseEntity.ok(input.getResultado());
	}
}

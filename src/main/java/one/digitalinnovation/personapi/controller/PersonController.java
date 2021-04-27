package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Classe que é o ponto de entrada do projeto

@RestController // controlador que vai ser acessado por uma API Rest
@RequestMapping("/api/v1/people")  // caminho principal da API
public class PersonController {

    @GetMapping // requisição da pagina
    public String getBook() {
        return  "API Test!";
    }
}

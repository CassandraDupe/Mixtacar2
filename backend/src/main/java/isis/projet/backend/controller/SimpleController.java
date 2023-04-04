package isis.projet.backend.controller;

import isis.projet.backend.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;

@RestController
@RequestMapping("/rest")
@Slf4j
public class SimpleController {
    private final UtilisateurService utilisateurService;

    public SimpleController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        log.info("Service Hello World");
        return Map.of("message", "Hello, World !");
    }

    @PutMapping("/combienDePays")
    public Map<String, Long> combienDInscrits() {
        log.info("Service combienDePays");
        return Map.of("combien", utilisateurService.combienDInscrits());
    }
}



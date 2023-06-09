package uz.urinov.springhrmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.urinov.springhrmanagementsystem.payload.LoginDTO;
import uz.urinov.springhrmanagementsystem.service.AuthService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService service;

    @Autowired
    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginToSystem(@RequestBody @Valid LoginDTO dto) {
        return service.login(dto);
    }

    @GetMapping("/verify")
    public ResponseEntity<?> verifyEmail(@RequestParam(name = "email") String email, @RequestParam(name = "emailCode") String emailCode) {
        return service.verifyEmail(email, emailCode);
    }
}

package cloud.example.java.app.service;

import cloud.example.java.app.entity.User;
import cloud.example.java.app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}

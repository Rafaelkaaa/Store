package ua.teamchallenge.store.persistence.repository.user;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ua.teamchallenge.store.persistence.entity.user.User;
import ua.teamchallenge.store.persistence.repository.BaseRepository;

import java.util.Optional;

@Repository
public interface UserRepository<U extends User> extends BaseRepository<U> {

    boolean existsByLogin(String login);
    Optional<U> findByLogin(String login);

    default Mono<U> findByUsername(String login) {
        return Mono.fromCallable(() -> findByLogin(login).orElse(null));
    }
}

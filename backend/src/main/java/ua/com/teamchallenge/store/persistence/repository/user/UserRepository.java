package ua.com.teamchallenge.store.persistence.repository.user;

import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.persistence.entity.user.User;
import ua.com.teamchallenge.store.persistence.repository.BaseRepository;

public interface UserRepository<U extends User> extends BaseRepository<U> {

    Mono<Boolean> existsByLogin(String login);

    Mono<U> findByLogin(String login);
}

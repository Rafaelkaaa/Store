package ua.teamchallenge.store.persistence.repository.token;

import org.springframework.stereotype.Repository;
import ua.teamchallenge.store.persistence.entity.token.Token;
import ua.teamchallenge.store.persistence.repository.BaseRepository;

@Repository
public interface TokenRepository extends BaseRepository<Token> {
}

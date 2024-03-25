package ua.teamchallenge.store.persistence.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.teamchallenge.store.persistence.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity> extends ReactiveCrudRepository<E, Long> { }

package ua.com.teamchallenge.store.service;

import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.persistence.entity.BaseEntity;

public interface BaseService<E extends BaseEntity> {

    Mono<E> findById(Long id);
}

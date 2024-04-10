package ua.com.teamchallenge.store.service;

import reactor.core.publisher.Flux;
import ua.com.teamchallenge.store.persistence.entity.BaseEntity;

public interface FindAllService<E extends BaseEntity> {

    Flux<E> findAll();
}

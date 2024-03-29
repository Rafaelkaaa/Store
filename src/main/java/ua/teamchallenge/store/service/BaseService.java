package ua.teamchallenge.store.service;

import ua.teamchallenge.store.persistence.entity.BaseEntity;

public interface BaseService<E extends BaseEntity> {

    E findById (Long id);
}

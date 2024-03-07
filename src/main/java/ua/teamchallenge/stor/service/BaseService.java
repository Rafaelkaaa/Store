package ua.teamchallenge.stor.service;

import ua.teamchallenge.stor.persistence.entity.BaseEntity;

public interface BaseService<E extends BaseEntity> {

    E findById (Long id);
}

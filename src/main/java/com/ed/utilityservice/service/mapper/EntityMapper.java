package com.ed.utilityservice.service.mapper;

import java.util.List;

public interface EntityMapper<E, D> {
    D toDTO(E e);
    E toEntity(D dto);

    List<D> toDTO(List<E> e);
    List<E> toEntity(List<D> dto);
}

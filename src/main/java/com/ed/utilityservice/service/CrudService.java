package com.ed.utilityservice.service;

import com.ed.utilityservice.model.PatchModel;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudService<D> {
    /**
     * Method to save entity
     *
     * @param dto
     * @return {@link D}
     */
    D save(D dto);

    /**
     * Method to update entity
     *
     * @param dto
     * @return
     */
    D update(D dto);

    /**
     * Method to create partial update on entity
     *
     * @param id
     * @param model
     * @return
     */
    D patch(Long id, PatchModel model);

    /**
     * Method to find all
     *
     * @param pageable
     * @return {@link Page}
     */
    Page<D> findAll(Pageable pageable);

    /**
     * Method to find one entity
     *
     * @param id
     * @return
     */
    Optional<D> findOne(Long id);

    /**
     * Method to delete entity
     *
     * @param id
     */
    void delete(Long id);
}

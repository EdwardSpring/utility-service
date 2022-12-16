package com.ed.utilityservice.resource;

import com.ed.utilityservice.model.ObjectResponse;
import com.ed.utilityservice.model.PaginationResponse;
import com.ed.utilityservice.model.PatchModel;
import java.net.URISyntaxException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface CrudResource<D, Q> {
    /**
     *
     * @param dto
     * @return
     * @throws URISyntaxException
     */
    ResponseEntity<ObjectResponse<D>> create(@RequestBody D dto) throws URISyntaxException;

    /**
     *
     * @param dto
     * @return
     */
    ResponseEntity<ObjectResponse<D>> update(@RequestBody D dto);

    /**
     *
     * @param id
     * @param model
     * @return
     */
    ResponseEntity<ObjectResponse<D>> partialUpdate(@PathVariable Long id, @RequestBody PatchModel model);

    /**
     *
     * @param id
     * @return
     */
    ResponseEntity<ObjectResponse<D>> findOne(@PathVariable Long id);

    /**
     *
     * @param q
     * @param pageable
     * @return
     */
    ResponseEntity<PaginationResponse<D>> findAll(@RequestBody(required = false) Q q, Pageable pageable);

    /**
     *
     * @param id
     */
    void delete(@PathVariable Long id);
}

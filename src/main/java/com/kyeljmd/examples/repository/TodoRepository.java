package com.kyeljmd.examples.repository;

import com.kyeljmd.examples.model.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by kyel on 2/5/2017.
 */
public interface TodoRepository extends PagingAndSortingRepository<Todo,Long> {
}

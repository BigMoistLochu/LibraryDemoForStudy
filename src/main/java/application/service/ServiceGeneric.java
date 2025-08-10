package application.service;

import java.util.Optional;

public interface ServiceGeneric <T>{
    void save(T entity);
    Optional<T> getById(Integer id);
}

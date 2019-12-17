package orm.data_mapper_and_identity_map.mappers;

import orm.data_mapper_and_identity_map.entities.Entity;

import java.sql.Connection;
import java.util.List;

public interface Mapper <T extends Entity>{
    T findOneById(Integer id);
    void save(T entity);
    void update(Integer id, T newEntity);
    void delete(Integer id);
}

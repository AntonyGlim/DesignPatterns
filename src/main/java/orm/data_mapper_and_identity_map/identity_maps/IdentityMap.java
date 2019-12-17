package orm.data_mapper_and_identity_map.identity_maps;

import orm.data_mapper_and_identity_map.entities.Entity;

public interface IdentityMap <T extends Entity>{
    T findOneById(Integer id);
    void save(T entity);
    void update(Integer id, T newEntity);
    void delete(Integer id);
}

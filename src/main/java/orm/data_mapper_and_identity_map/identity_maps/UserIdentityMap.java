package orm.data_mapper_and_identity_map.identity_maps;

import orm.data_mapper_and_identity_map.entities.Entity;
import orm.data_mapper_and_identity_map.entities.User;
import orm.data_mapper_and_identity_map.mappers.UserMapper;

import java.util.HashMap;
import java.util.Map;

public class UserIdentityMap implements IdentityMap<User> {

    Map<Integer, User> users = new HashMap();
    UserMapper userMapper = new UserMapper();

    public User findOneById(Integer id) {
        User user = null;
        if (users.containsKey(id)) return users.get(id);
        else {
            user = userMapper.findOneById(id);
            if (user != null) users.put(id, user);
        }
        return user;
    }

    public void save(User user) {
        userMapper.save(user);
    }

    public void update(Integer id, User newUser) {
        userMapper.update(id, newUser);
    }

    public void delete(Integer id) {
        userMapper.delete(id);
    }

}

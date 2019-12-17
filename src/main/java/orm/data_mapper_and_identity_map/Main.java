package orm.data_mapper_and_identity_map;

import orm.data_mapper_and_identity_map.entities.User;
import orm.data_mapper_and_identity_map.identity_maps.IdentityMap;
import orm.data_mapper_and_identity_map.identity_maps.UserIdentityMap;

public class Main {
    public static void main(String[] args) {
        User user = new User("NewUser", 12);
        IdentityMap userIdentityMap = new UserIdentityMap();
        userIdentityMap.save(user);
        user.setAge(66);
        userIdentityMap.update(1, user);
        userIdentityMap.delete(5);
        System.out.println(userIdentityMap.findOneById(1));
    }
}

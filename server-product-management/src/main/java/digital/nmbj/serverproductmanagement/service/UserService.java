package digital.nmbj.serverproductmanagement.service;

import digital.nmbj.serverproductmanagement.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    //save can be used for update and insert operation
    User updateUser(User user);

    void deleteUser(Long userid);

    User findByUsername(String username);

    List<User> findAllUsers();

    Long numberOfUsers();
}

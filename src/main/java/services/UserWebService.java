package services;

import data.entities.UserWeb;
import data.repositories.RoleRepository;
import data.repositories.UserWebRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserWebService {

    @Autowired
    private UserWebRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    public List<UserWeb> findAll(){
        List<UserWeb> items = new ArrayList<>();

        for (UserWeb item :repository.findAll()) {
            items.add(item);
        }
        return items;
    }

    public UserWeb findOne(String id){
        return repository.findById(new ObjectId(id)).get();
    }

    public UserWeb create(UserWeb item){
        item.setRole(roleRepository.findByName("USER_WEB"));
        return repository.save(item);
    }

    public UserWeb update(UserWeb item){
        return repository.save(item);
    }

    public void delete(String id){
        repository.delete(findOne(id));
    }

    public UserWeb findOneByUsername(String username){
        return repository.findByUsername(username);
    }
}

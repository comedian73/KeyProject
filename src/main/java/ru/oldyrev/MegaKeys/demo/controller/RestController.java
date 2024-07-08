package ru.oldyrev.MegaKeys.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import ru.oldyrev.MegaKeys.demo.model.*;
import ru.oldyrev.MegaKeys.demo.service.ContractorService;
import ru.oldyrev.MegaKeys.demo.service.KeyService;
//import ru.oldyrev.MegaKeys.demo.service.OrganizationService;
import ru.oldyrev.MegaKeys.demo.service.UserService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {

    private final UserService userService;
    private final KeyService keyService;
    private final ContractorService contractorService;
//    private final OrganizationService organizationService;

    @GetMapping("/users-list")
    public List<User> listUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/authentication-user")
    public User authUser() {
       Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return (User) userService.loadUserByUsername(auth.getName());
    }

    @GetMapping("/role-list")
    public List<Role> listRole() {
        return userService.getAllRoles();
    }

//    @GetMapping("/organization-list")
//    public List<Organization> listOrganization() {
//        return organizationService.getAll();
//    }

    @DeleteMapping("/user/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @PostMapping(value = "/addNewUser", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addNewUser(@ModelAttribute User user) {
        userService.saveUser(user);
    }

    @PutMapping(value = "/editUser")
    public void editUser(@ModelAttribute User user) {
        userService.updateUser(user);
    }

    @GetMapping("/keys-list")
    public List<Key> keyList() {return keyService.getAllKey();}

    @GetMapping("/contractor-list")
    public List<Contractor> contractorsList() {return contractorService.getAllContractor();}

    @PostMapping(value = "/addNewKey", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addNewKey(@ModelAttribute Key key) {keyService.save(key);}

    @PostMapping(value = "/addNewContractor", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addNewContractor(@ModelAttribute Contractor contractor) {contractorService.saveContractor(contractor);}
}

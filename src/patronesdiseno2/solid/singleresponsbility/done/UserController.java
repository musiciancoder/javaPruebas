package patronesdiseno2.solid.singleresponsbility.done;

/*
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User
public class UserController { //  --> una sola responsabilidad: crear usuario

    private UserPersistenceService persistenceService = new UserPersistenceService(); //esto en spring vendria con una inyeccion de dependencias
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper(); //no compila por la falta de libreria !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        User user = mapper.readValue(userJson, User.class);

        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);
        
        if(!valid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        
        return "SUCCESS";
    } 

}*/

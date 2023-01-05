package wiwiel.training.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
//assignment - err 5 - the @Service annotation is required
@Service
//assignment - err 6 - DogPetService must  implement PetService
public class DogPetService  implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}

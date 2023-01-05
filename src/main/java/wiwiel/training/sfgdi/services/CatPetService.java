package wiwiel.training.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */

//assignment - err 3 - the @Profile annotation is required
@Profile("cat")
//assignment - err 4 - the bean name isn't really needed here
@Service("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}

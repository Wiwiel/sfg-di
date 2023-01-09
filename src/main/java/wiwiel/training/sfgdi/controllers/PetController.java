package wiwiel.training.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import com.training.pets.PetService;

/**
 * Created by jt on 12/28/19.
 */

//assignment - err 2 - the @Controller annotation is required
@Controller
public class PetController {

    private final PetService petService;

    //assignment - err 1 - constructor's required
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

package io.sdsolutions.particle.starter.thing.presentation.controller;

import io.sdsolutions.particle.exceptions.NotFoundException;
import io.sdsolutions.particle.starter.thing.persistence.ThingRepository;
import io.sdsolutions.particle.starter.thing.presentation.model.ThingDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Everything in this controller will have no security applied to it. These are public endpoints.
 */
@Controller
@RequestMapping("/api/public")
public class PublicController {

    private ThingRepository thingRepository;

    public PublicController(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    @GetMapping(value = "/things")
    @ResponseBody
    public List<ThingDTO> getThings() {
        List<ThingDTO> dtos = thingRepository.getThings();

        if(dtos.isEmpty()) {
            throw new NotFoundException();
        }

        return dtos;
    }

}

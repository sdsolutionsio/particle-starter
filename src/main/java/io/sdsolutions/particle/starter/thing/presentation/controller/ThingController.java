package io.sdsolutions.particle.starter.thing.presentation.controller;

import io.sdsolutions.particle.core.dozer.DozerMapperPlus;
import io.sdsolutions.particle.exceptions.NotFoundException;
import io.sdsolutions.particle.starter.thing.persistence.ThingRepository;
import io.sdsolutions.particle.starter.thing.presentation.model.ThingDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ThingController {

    private ThingRepository thingRepository;
    private DozerMapperPlus objectMapper;

    public ThingController(ThingRepository thingRepository, DozerMapperPlus objectMapper) {
        this.thingRepository = thingRepository;
        this.objectMapper = objectMapper;
    }

    @RequestMapping(value = "/api/things", method = RequestMethod.GET)
    @ResponseBody
    public List<ThingDTO> getThings() {
        List<ThingDTO> dtos = thingRepository.getThings();

        if(dtos.isEmpty()) {
            throw new NotFoundException();
        }

        return dtos;
    }
}

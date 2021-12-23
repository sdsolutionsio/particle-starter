package io.sdsolutions.particle.starter.thing.persistence;

import io.sdsolutions.particle.starter.thing.presentation.model.ThingDTO;

import java.util.List;

public interface ThingRepository {

    List<ThingDTO> getThings();

}


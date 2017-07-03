package org.epolicy.service;

import org.epolicy.domain.Country;
import org.epolicy.model.AgentTO;

import java.util.List;

/**
 * Created by rahulwagh on 07-06-2017.
 */
public interface AgentService {

    List<Country> getAllCountry();

    void registerAgent(AgentTO agentTO);
}

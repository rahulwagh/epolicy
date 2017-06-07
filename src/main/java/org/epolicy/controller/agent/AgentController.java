package org.epolicy.controller.agent;

import org.epolicy.entity.Country;
import org.epolicy.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rahulwagh on 07-06-2017.
 */
@RestController
public class AgentController {

    private AgentService agentService;

    @Autowired
    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    public List<Country> getAllCountryName() {
        return agentService.getAllCountry();
    }
}

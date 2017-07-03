package org.epolicy.controller.agent;

import org.epolicy.domain.Country;
import org.epolicy.model.AgentTO;
import org.epolicy.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/api/epolicy/country",
            method = RequestMethod.GET,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public List<Country> getAllCountryName() {
        return agentService.getAllCountry();
    }

    @RequestMapping(value = "/api/epolicy/agent/register",
            method = RequestMethod.POST,
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public void registerAgent(@RequestBody AgentTO agentTO) {
        agentService.registerAgent(agentTO);
    }
}

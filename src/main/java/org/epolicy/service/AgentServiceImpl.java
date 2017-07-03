package org.epolicy.service;

import org.epolicy.domain.Country;
import org.epolicy.domain.User;
import org.epolicy.model.AgentTO;
import org.epolicy.repository.CountryRepository;
import org.epolicy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rahulwagh on 07-06-2017.
 */
@Service
public class AgentServiceImpl implements AgentService {

    private CountryRepository countryRepository;

    private UserRepository userRepository;

    @Autowired
    public AgentServiceImpl(CountryRepository countryRepository,
                            UserRepository userRepository) {
        this.countryRepository = countryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Country> getAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public void registerAgent(AgentTO agentTO) {
        userRepository.save(toUser(agentTO));
    }

    public User toUser(AgentTO agentTO) {
        User user = new User();
        user.setAddress(agentTO.getAddress());
        user.setCityName(agentTO.getCityName());
        user.setCountry(agentTO.getCountry());
        user.setDateOfBirth(agentTO.getDateOfBirth());
        user.setFirstName(agentTO.getFirstName());
        user.setGender(agentTO.getGender());
        user.setLastName(agentTO.getLastName());
        user.setUserType(agentTO.getUserType());
        return user;
    }
}

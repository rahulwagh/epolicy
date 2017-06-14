package org.epolicy.service;

import org.epolicy.domain.Country;
import org.epolicy.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rahulwagh on 07-06-2017.
 */
@Service
public class AgentServiceImpl implements AgentService{

    private CountryRepository countryRepository;

    @Autowired
    public AgentServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountry() {
        return countryRepository.findAll();
    }
}

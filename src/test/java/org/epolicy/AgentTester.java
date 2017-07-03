package org.epolicy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.epolicy.model.AgentTO;
import org.epolicy.model.CountryTO;
import org.epolicy.model.UserTypeTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by rahulwagh on 20-06-2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AgentTester extends BaseEndpointTest {

    private final static String FIRST_NAME = "TEST_AGENT_FIRST_NAME";
    private final static String LAST_NAME = "TEST_AGENT_LAST_NAME";
    private final static String GENDER = "M";
    private final static Date DATE_OF_BIRTH = new Date();
    private final static String ADDRESS = "TEST_AGENT_ADDRESS";
    private final static String CITY = "TEST_NAME";

    private final static String ISO = "IN";
    private final static String NAME = "INDIA";
    private final static String NICE_NAME = "India";
    private final static String ISO3 = "IND";
    private final static Long NUM_CODE = 356L;
    private final static Long PHONE_CODE = 91L;

    private final static String USER_TYPE_DESCRIPTION = "Epolicy Agent";
    private final static String USER_TYPE = "EPOLICY_AGENT";


    @Before
    public void setup() throws Exception {

        super.setup();
    }

    @Test
    public void registerAgent() throws Exception {
        mockMvc.perform(post("/api/epolicy/agent/register").content(agentToAsJsonString()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(JSON_MEDIA_TYPE))
                .andReturn();
    }

    public String agentToAsJsonString() throws JsonProcessingException {
        final ObjectMapper mapper = new ObjectMapper();

        CountryTO countryTO = new CountryTO();
        countryTO.setIso(ISO);
        countryTO.setIso3(ISO3);
        countryTO.setName(NAME);
        countryTO.setNicename(NICE_NAME);
        countryTO.setNumcode(NUM_CODE);
        countryTO.setPhonecode(PHONE_CODE);

        UserTypeTO userType = new UserTypeTO();
        userType.setDescription(USER_TYPE_DESCRIPTION);
        userType.setUserType(USER_TYPE);

        AgentTO agentTO = new AgentTO();
        agentTO.setAddress(ADDRESS);
        agentTO.setCityName(CITY);
        agentTO.setCountry(countryTO);
        agentTO.setDateOfBirth(DATE_OF_BIRTH);
        agentTO.setFirstName(FIRST_NAME);
        agentTO.setGender(GENDER);
        agentTO.setLastName(LAST_NAME);
        agentTO.setUserType(userType);

        return mapper.writeValueAsString(agentTO);

    }
}

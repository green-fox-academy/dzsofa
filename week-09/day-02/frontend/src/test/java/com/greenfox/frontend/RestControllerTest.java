package com.greenfox.frontend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void successfulDoubling() throws Exception {
        mockMvc.perform(get("/doubling?input=5")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.received", is(5)))
                .andExpect(jsonPath("$.result", is("10")));
    }

    @Test
    public void unsuccessfulDoubling() throws Exception {
        mockMvc.perform(get("/doubling")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void successfulGreeter() throws Exception {
        mockMvc.perform(get("/greeter/?name=Petike&title=student")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name", is("Petike")))
                .andExpect(jsonPath("$.title", is("student")))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
    }

    @Test
    public void missingNameGreeter() throws Exception {
        mockMvc.perform(get("/greeter/?title=student")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void missingTitleGreeter() throws Exception {
        mockMvc.perform(get("/greeter/?name=Petike")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void successfulDoUntil() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": \"5\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(15)));
    }

    @Test
    public void unsuccessfulDoUntil() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content(""))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.error", is("Please provide a number!")));
    }

}

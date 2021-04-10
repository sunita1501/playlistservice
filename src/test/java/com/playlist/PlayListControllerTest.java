package com.playlist;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class PlayListControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    /*When a playlist is created with a name
    Then a confirmation is returned that it was successful.
    And the playlist is empty.*/
    @Test
    void fetchEmptyList() throws Exception {
        //VisitorDTO input = new VisitorDTO("Zackry","Good");
        mockMvc.perform(get("/playlist"))
                .andExpect(status().isOk());

    }

    @Test
    void createPlayListTest() throws Exception {
        PlayListDTO input = new PlayListDTO("PlayList1","song1");
        mockMvc.perform(
                post("/playlist")
                        .content(objectMapper.writeValueAsString(input))
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isCreated());

        mockMvc.perform(get("/playlist"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("length()").value(2));
                //.andExpect(jsonPath("[0].name").value("PlayList1"))
                //.andExpect(jsonPath("[0]).value("song1"));*/
    }
}

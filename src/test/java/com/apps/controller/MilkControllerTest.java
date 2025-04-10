package com.apps.controller;

import com.apps.model.Milk;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MilkController.class)
class MilkControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testAddMilk_ValidData() throws Exception {
        Milk milk = new Milk(1, "Buffalo Milk", "Green Farm");

        mockMvc.perform(post("/api/milk/g2")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(milk)))
                .andExpect(status().isCreated())
                .andExpect(content().string("Milk added successfully"));
    }

    @Test
    void testAddMilk_InvalidData() throws Exception {
        Milk milk = new Milk(2, "", ""); // Invalid input

        mockMvc.perform(post("/api/milk/g2")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(milk)))
                .andExpect(status().isBadRequest());
    }

    @Test
    void testGetAllMilk() throws Exception {
        mockMvc.perform(get("/api/milk/g1"))
                .andExpect(status().isOk());
    }
}

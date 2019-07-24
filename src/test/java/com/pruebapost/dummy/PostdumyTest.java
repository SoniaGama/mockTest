package com.pruebapost.dummy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.pruebapost.dummy.restController.DummyRestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostdumyTest {

	private static final String URL = "/entity";
	private MockMvc mockMvc;

	DummyRestController restController = new DummyRestController();

	@Before
	public void beforeTest() {
		mockMvc = MockMvcBuilders.standaloneSetup(restController).build();
	}

	@Test
	public void PostTestCode() throws Exception {
		mockMvc.perform(post(URL).param("postTest", "Prueba Test")).andExpect(status().isOk());
	}

	@Test
	public void PostParameterTest() throws Exception {
		mockMvc.perform(post(URL)).andExpect(status().isBadRequest());
	}
}

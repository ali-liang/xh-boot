package com.example.springbootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.xingkong.XhApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XhApplication.class)
@AutoConfigureMockMvc
public class TestTest {
	@Autowired
	private MockMvc mvc;
	@Test
	public void findAllTest() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/findAll")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}

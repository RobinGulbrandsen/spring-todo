package no.rg.controller;

import java.io.IOException;
import java.util.List;

import no.rg.domain.Todo;
import no.rg.service.TodoService;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	private ObjectMapper mapper = new ObjectMapper();

	@RequestMapping("/")
	public @ResponseBody String get() throws JsonGenerationException, JsonMappingException, IOException {
		return mapper.writeValueAsString(todoService.getAll());
	}

	@RequestMapping("/all")
	public @ResponseBody String getAll() {
		List<Todo> list = todoService.getAll();
		return "Length: " + list.size();
	}
}

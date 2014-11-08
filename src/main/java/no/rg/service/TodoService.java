package no.rg.service;


import java.util.List;

import javax.transaction.Transactional;

import no.rg.domain.Todo;
import no.rg.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo> getAll() {
		return todoRepository.findAll();
	}

}

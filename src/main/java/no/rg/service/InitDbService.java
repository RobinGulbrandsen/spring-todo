package no.rg.service;

import javax.annotation.PostConstruct;

import no.rg.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitDbService {

	@Autowired
	private TodoRepository todoRepository;
	
	@PostConstruct
	public void init() {
		
	}
}

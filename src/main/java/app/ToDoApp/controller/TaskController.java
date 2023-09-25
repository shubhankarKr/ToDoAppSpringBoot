package app.ToDoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.ToDoApp.entity.ToDo;
import app.ToDoApp.modelDTO.ToDoDTO;
import app.ToDoApp.service.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin
public class TaskController {
	
	@Autowired
	TaskService service; 
	
	@PostMapping(path = "/add")
	public ToDoDTO addTask(@RequestBody ToDoDTO toDoDTO) {
		return service.addTask(toDoDTO);
	}

	@GetMapping("/getAllTasks")
	public List<ToDoDTO> getTasks() {
		return service.getTasks();
	}

	@PutMapping("/update")
	public ToDoDTO update(@RequestBody ToDoDTO toDoDTO) {
		return service.update(toDoDTO);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable int id) {
		return service.delete(id);
	}
	
	@GetMapping("/search/{inputString}")
	public List<ToDoDTO> searchByString(@PathVariable String inputString ){
		return service.searchByString(inputString);
	}
	
	@GetMapping("/{id}")
	public ToDoDTO getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
}

package app.ToDoApp.dao;

import java.util.List;

import app.ToDoApp.modelDTO.ToDoDTO;

public interface TaskDAO {
	public ToDoDTO addTask(ToDoDTO toDoDTO);
	public List<ToDoDTO> getTasks();
	public ToDoDTO update(ToDoDTO toDoDTO);
	public Boolean delete(int id);
	public List<ToDoDTO> searchByString( String inputString );
	public ToDoDTO getUserById(int id);
}

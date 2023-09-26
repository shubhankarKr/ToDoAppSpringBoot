package app.ToDoApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.ToDoApp.dao.TaskDAO;
import app.ToDoApp.modelDTO.ColorCodeDTO;
import app.ToDoApp.modelDTO.ColorUpdateModel;
import app.ToDoApp.modelDTO.ToDoDTO;
import app.ToDoApp.service.TaskService;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskDAO dao;

	@Override
	public ToDoDTO addTask(ToDoDTO toDoDTO) {
		// TODO Auto-generated method stub
		return dao.addTask(toDoDTO);
	}

	@Override
	public List<ToDoDTO> getTasks() {
		// TODO Auto-generated method stub
		return dao.getTasks();
	}

	@Override
	public ToDoDTO update(ToDoDTO toDoDTO) {
		// TODO Auto-generated method stub
		return dao.update(toDoDTO);
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<ToDoDTO> searchByString(String inputString) {
		// TODO Auto-generated method stub
		return dao.searchByString(inputString);
	}

	@Override
	public ToDoDTO getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

	@Override
	public List<ColorCodeDTO> getColors() {
		// TODO Auto-generated method stub
		return dao.getColors();
	}

	@Override
	public Boolean updateColor(ColorUpdateModel colorUpdateModel) {
		// TODO Auto-generated method stub
		return dao.updateColor(colorUpdateModel);
	}
}

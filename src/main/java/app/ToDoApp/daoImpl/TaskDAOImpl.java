package app.ToDoApp.daoImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.ToDoApp.dao.TaskDAO;
import app.ToDoApp.entity.ToDo;
import app.ToDoApp.modelDTO.ToDoDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class TaskDAOImpl implements TaskDAO{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public ToDoDTO addTask(ToDoDTO toDoDTO) {
		ToDo toDo=toDoDTO.createEntity(toDoDTO);
		Date date=new Date();
		toDo.setCreatedDate(date);
		toDo.setLastUpdatedDate(date);
		entityManager.persist(toDo);
		
		
		ToDoDTO dto=toDo.createDTO(toDo);
		return dto;
	}

	@Override
	public List<ToDoDTO> getTasks() {
		Query q=entityManager.createQuery("select t from ToDo t");
		List<ToDo> toDoList=q.getResultList();
		List<ToDoDTO> list=new ArrayList<>();
		for (ToDo toDo : toDoList) {
			ToDoDTO doDTO=new ToDoDTO();
			ToDoDTO dto=toDo.createDTO(toDo);
			list.add(dto);
		}
		return list;
	}

	@Override
	public ToDoDTO update(ToDoDTO toDoDTO) {
		ToDo do1=entityManager.find(ToDo.class, toDoDTO.getId());
		do1.setColourCode(toDoDTO.getColourCode());
		do1.setDesciption(toDoDTO.getDesciption());
		do1.setLastUpdatedDate(new Date());
		do1.setTitle(toDoDTO.getTitle());
		return do1.createDTO(do1);
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		ToDo do1=entityManager.find(ToDo.class, id);
		entityManager.remove(do1);
		return true;
	}

	@Override
	public List<ToDoDTO> searchByString(String inputString) {
		// TODO Auto-generated method stub
		List<ToDoDTO> res=new ArrayList<>();
		Query query=entityManager.createQuery("select t from ToDo t where t.title like :inputString");
		query.setParameter("inputString","%"+inputString+"%");
		List<ToDo> data=query.getResultList();
		if(!data.isEmpty()) {
			for (ToDo toDo : data) {
				ToDoDTO dto= toDo.createDTO(toDo);
				res.add(dto);
			}
		}
		return res;
	}

}

package gt.edu.umg.task.controllers;

import gt.edu.umg.task.entities.Task;
import gt.edu.umg.task.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class TaskController {
    @Autowired
    ProductService TaskService;
    @GetMapping


    public List<Task> listaTask(){

        return TaskService.findAll();

    }
    
    public Task findById( Long id){
        return null;
    }


    public Task createTask( Task task){
        return null;
    }


    public Task modifyTask( Long id,  Task task){
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(Long id){
    }
}

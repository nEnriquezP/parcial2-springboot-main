package gt.edu.umg.task.daos;

import gt.edu.umg.task.entities.Task;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface TaskDao {
    Optional<Task> findById(Long id);
}

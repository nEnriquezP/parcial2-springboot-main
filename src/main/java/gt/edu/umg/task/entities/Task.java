package gt.edu.umg.task.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="agenda")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private String Description;
    private Date dueDate;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)

    public Long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return Description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}

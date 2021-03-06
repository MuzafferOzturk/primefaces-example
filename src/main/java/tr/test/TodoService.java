package tr.test;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "todoService")
@ApplicationScoped
public class TodoService {

    private List<Todo> todos;

    @PostConstruct
    public void init() {
        todos = new ArrayList<>();
        todos.add(new Todo("0", "", "todo-1"));
        todos.add(new Todo("1", "text-2", "todo-2"));
        todos.add(new Todo("2", "", "todo-3"));
        todos.add(new Todo("3", "", "todo-4"));
        todos.add(new Todo("4", "", "todo-5"));
        todos.add(new Todo("5", "", "todo-6"));
    }

    public List<Todo> getTodos() {
        return todos;
    }
}

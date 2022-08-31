package com.escuelaing.ieti.springboot.service;

import com.escuelaing.ieti.springboot.entities.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {
    private HashMap<String, Task> tasks = new HashMap<String, Task>();

    @Override
    public Task create(Task task) {
        if (tasks.containsKey(task.getId())) {
            return null;
        } else {
            tasks.put(task.getId(), task);
            return tasks.get(task.getId());
        }
    }

    @Override
    public Task findById(String id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> getAll() {
        Collection<Task> values = tasks.values();
        return new ArrayList<Task>(values);
    }

    @Override
    public boolean deleteById(String id) {
        tasks.remove(id);
        return false;
    }

    @Override
    public Task update(Task task, String id) {
        if (tasks.containsKey(id)) {
            tasks.replace(id, task);
        }
        return tasks.get(id);
    }
}

package com.example.laptoptcc.session4.databases.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laptopTCC on 2/8/2017.
 */

public class DbContext {
    public static DbContext instance = new DbContext();
    public List<Task> allTasks(){
        //1:create arrayList
        ArrayList<Task> tasks = new ArrayList<>();
        //2: add some tasks and return
        tasks.add(new Task("Study recycleView","#FF0000"));
        tasks.add(new Task("Practice recycleView","#A2AFAE"));
        tasks.add(new Task("Practice netWork","#81AF43"));
        tasks.add(new Task("Party end-lecture","#CFDFAE"));
        tasks.add(new Task("Study end lession","#FFFFFF"));
        return tasks;
    }
}

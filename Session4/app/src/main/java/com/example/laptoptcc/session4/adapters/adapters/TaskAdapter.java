package com.example.laptoptcc.session4.adapters.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.laptoptcc.session4.R;
import com.example.laptoptcc.session4.adapters.viewholders.TaskViewHolder;
import com.example.laptoptcc.session4.databases.Models.DbContext;
import com.example.laptoptcc.session4.databases.Models.Task;

/**
 * Created by laptopTCC on 2/8/2017.
 */

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //1: Create View
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_task,parent,false);
        //2: Create ViewHolder
        TaskViewHolder taskViewHolder = new TaskViewHolder(itemView);
        return taskViewHolder;
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
        //1: Get data based on position
        Task task = DbContext.instance.allTasks().get(position);
        //2: Bind data into View
        holder.bind(task);
    }

    @Override
    public int getItemCount() {
        return DbContext.instance.allTasks().size();
    }
}

package com.example.laptoptcc.session4.adapters.viewholders;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.laptoptcc.session4.R;
import com.example.laptoptcc.session4.databases.Models.Task;

import butterknife.BindView;
import butterknife.ButterKnife;



/**
 * Created by laptopTCC on 2/8/2017.
 */

public class TaskViewHolder extends RecyclerView.ViewHolder {
    //được cắm với itemView

    @BindView(R.id.v_task_color)
    View vTaskColor;

    @BindView(R.id.tv_task_name)
    TextView tvTaskName;

    public TaskViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(Task task){
        //1: Bind color
        //vTaskColor.setBackgroundColor(Color.parseColor(task.getColor()));
        GradientDrawable drawable = (GradientDrawable) vTaskColor.getBackground();
        drawable.setColor(Color.parseColor(task.getColor()));
        //2: Bind Task name
        tvTaskName.setText(task.getName());
    }
}

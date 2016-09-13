package com.zcy.ghost.ghost.mvptest;

import android.os.Bundle;

import com.zcy.ghost.ghost.R;
import com.zcy.ghost.ghost.app.BaseActivity;


/**
 * 测试MVP Activity
 */
public class AddEditTaskActivity extends BaseActivity {
    AddEditTaskView addEditTaskView;
    AddEditTaskPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtask_act);
        addEditTaskView = (AddEditTaskView) findViewById(R.id.add_edit_task_view);
        presenter = new AddEditTaskPresenter(addEditTaskView);
    }

}

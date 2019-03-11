package com.devyry.templatejavamvvm.ui.views.main;


import com.devyry.templatejavamvvm.R;
import com.devyry.templatejavamvvm.ui.base.BaseToolbarActivity;
import com.devyry.templatejavamvvm.utils.enums.ToolbarActions;

public class MainActivity extends BaseToolbarActivity {

    @Override
    protected void initializeView() {
        setToolbar(ToolbarActions.NO_ACTION, R.string.app_name);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

}

package com.devyry.templatejavamvvm.ui.views.login;

import com.devyry.templatejavamvvm.R;
import com.devyry.templatejavamvvm.ui.base.BaseToolbarActivity;
import com.devyry.templatejavamvvm.utils.enums.ToolbarActions;

/**
 * Created by Yeray Rguez on 01/03/2019.
 */
public class LoginActivity extends BaseToolbarActivity {


    @Override
    protected void initializeView() {
        setToolbar(ToolbarActions.NO_ACTION, R.string.app_name);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

}

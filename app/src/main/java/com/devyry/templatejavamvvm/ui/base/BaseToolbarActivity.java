package com.devyry.templatejavamvvm.ui.base;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.devyry.templatejavamvvm.R;
import com.devyry.templatejavamvvm.utils.enums.ToolbarActions;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Yeray Rguez on 01/03/2019.
 */
public abstract class BaseToolbarActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setToolbar(ToolbarActions toolbarAction, @StringRes int title) {
        if (!toolbarAction.equals(ToolbarActions.NONE))
        {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowTitleEnabled(false);
                switch (toolbarAction) {
                    case BACK:
                        actionBar.setDisplayHomeAsUpEnabled(true);
                        break;
                    case MENU:
                        actionBar.setDisplayHomeAsUpEnabled(true);
                        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white);
                        break;
                }
            }

            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent));
            }

            if (title != 0)
                this.setToolbarTitle(getString(title));
            else
                this.setToolbarTitle(getString(R.string.app_name));
        }
    }

    protected void setToolbarTitle(String title) {
        this.toolbarTitle.setText(title);
    }

}

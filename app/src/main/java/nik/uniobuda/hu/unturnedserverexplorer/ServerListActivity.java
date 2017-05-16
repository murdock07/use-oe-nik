package nik.uniobuda.hu.unturnedserverexplorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServerListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_list);
    }

    public void clickevent(View view) {
        Intent intent=new Intent(this,ServerInformationActivity.class);
        startActivity(intent);
    }
}

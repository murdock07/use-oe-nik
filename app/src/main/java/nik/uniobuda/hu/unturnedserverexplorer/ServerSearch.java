package nik.uniobuda.hu.unturnedserverexplorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServerSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_search);
    }

    public void clickeventsearch(View view) {
        Intent intent=new Intent(this, ServerSearch.class);
        startActivity(intent);
    }
}

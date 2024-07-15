package com.oneteamplus.loginapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DisplayData extends AppCompatActivity {
    private DataView dataView;
    List <String> itemsList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ItemListAdapter adapter = new ItemListAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        String json = intent.getStringExtra("data");
        ResModel resModel = ResModel.fromJson(json);
        TextView output = findViewById(R.id.displayed_text);
        TextView display_data = findViewById(R.id.display_data);
        if (output != null && resModel != null) {
            output.setText(String.format("%s", resModel.getSession_id()));
        } else {
            return;
        }
        ResModel passData = new ResModel(resModel.getUser_id(),resModel.getSession_id(),resModel.getSkey());


        dataView = new ViewModelProvider(this).get(DataView.class);
        dataView.displayReport(passData);
        dataView.reportModelMutableLiveData.observe(this, new Observer<ViewDataModel>() {
            @Override
            public void onChanged(ViewDataModel viewDataModel) {
                if(viewDataModel != null){
                    display_data.setText(viewDataModel.getColumns().get(0));
                    itemsList = new ArrayList<>(viewDataModel.getColumns());
                    adapter.setArray(itemsList);


                }


            }
        });





    }
}
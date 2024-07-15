package com.oneteamplus.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;



import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import java.security.MessageDigest;

public class MainActivity extends AppCompatActivity {

    private LoginView loginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToNextPage(ResModel resModel){
        Intent intent = new Intent(this, DisplayData.class);


        intent.putExtra("data",resModel.toJson());
        startActivity(intent);


    }

public  String getSha256(final String base) {
        try{
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            final byte[] hash = digest.digest(base.getBytes("UTF-8"));
            final StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                final String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(Exception ex){
            Log.e("Exception getting password hashing SHA-256", ex.getMessage());
            throw new RuntimeException(ex);
        }
    }


    public void userLogin(View v){
        TextView userName = findViewById(R.id.userNameId);
        String userNameId = userName.getText().toString();
        TextView userPassword= findViewById(R.id.userPasswordId);
        String userPasswordId = userPassword.getText().toString();
        userPasswordId = getSha256(userPasswordId);
        RequestModel requestModel = new RequestModel();
        requestModel.setLogin_id(userNameId);

        requestModel.setPassword(userPasswordId);

        loginView = new ViewModelProvider(this).get(LoginView.class);
        loginView.login(requestModel);
        loginView.postsMutableLiveData.observe(this, new Observer<ResModel>() {

            @Override
            public void onChanged(ResModel resModel) {
                if (resModel != null) {

                    navigateToNextPage(resModel);



                }
            }
        });

    }
}
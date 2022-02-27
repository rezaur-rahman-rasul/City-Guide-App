package com.example.cityguide.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.cityguide.R;
import com.example.cityguide.User.AllCategories;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    RelativeLayout progressbar;
    TextInputLayout userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_login);

        //Hooks
        userName = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
//        progressbar = findViewById(R.id.lo)

    }

//    void letTheUserLogedIn(View view) {
//        if (!validateFields()) {
//            return;
//        }
//    }

//    private boolean validateFields() {
//        String _userName =
//    }

    //Back Pressed Button
    public void backPressed(View view) {
        Login.super.onBackPressed();
    }

    //
    public void callSignupScreenFromLogin(View view) {
        Intent signup = new Intent(getApplicationContext(), SignUp.class);
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View, String>(findViewById(R.id.signup_btn), "transition_signup");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
        startActivity(signup, options.toBundle());
    }

    public void goToForgetPassword(View view) {
        Intent forgetPassword = new Intent(getApplicationContext(), ForgetPassword.class);
        startActivity(forgetPassword);
    }

    public void letTheUserLogedIn(View view) {

    }
}
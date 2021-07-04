package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class AuthPage extends AppCompatActivity {

    private static final int RC_SIGN_IN = 1;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_page);

        mAuth = FirebaseAuth.getInstance();

        if (mAuth.getCurrentUser() == null) {
            List<AuthUI.IdpConfig> providers = Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build());
            startActivityForResult(
                    AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(),
                    RC_SIGN_IN);
        } else {
            launchMainPage();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);
            if (resultCode == RESULT_OK) {
                // Successfully signed in
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                // Init user in firebase if new
                IdpResponse idpResponse = data.getParcelableExtra("extra_idp_response");
                Log.e("TAG", "isVerified = " + user.isEmailVerified());
                Log.e("TAG", "isNewUser = " + idpResponse.isNewUser());
                if (idpResponse.isNewUser()) {
                    user.sendEmailVerification();
                }

                if (user.isEmailVerified()) {
                    launchMainPage();
                } else {
                    Toast.makeText(AuthPage.this, "Please verify your email", Toast.LENGTH_SHORT).show();
                    AuthUI.getInstance()
                            .signOut(getApplicationContext())
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    refresh();
                                }
                            });
                }
            } else {
                // Sign in failed. If response is null the user canceled the
                // sign-in flow using the back button. Otherwise check
                // response.getError().getErrorCode() and handle the error.
                Log.e("TAG", "error = " + response.getError().getErrorCode());
            }
        }
    }

    private void launchMainPage() {
        Intent intent = new Intent(AuthPage.this, MainPage.class);
        startActivity(intent);
    }

    private void refresh() {
        Intent intent = new Intent(AuthPage.this, AuthPage.class);
        startActivity(intent);
    }
}
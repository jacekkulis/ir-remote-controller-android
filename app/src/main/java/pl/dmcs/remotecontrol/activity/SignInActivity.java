/**
 * Copyright 2016 Google Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.dmcs.remotecontrol.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;

import pl.dmcs.remotecontrol.R;

public class SignInActivity extends BaseActivity implements
        View.OnClickListener {

    private static final String TAG = "Sign in";

    private EditText mEmailField;
    private EditText mPasswordField;

    private FirebaseAuth mAuth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mEmailField = findViewById(R.id.fieldEmail);
        mPasswordField = findViewById(R.id.fieldPassword);

        // Buttons
        findViewById(R.id.emailSignInButton).setOnClickListener(this);
        findViewById(R.id.emailCreateAccountButton).setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser != null) {
            startActivity(new Intent(SignInActivity.this, MainActivity.class));
            Toast.makeText(SignInActivity.this, "User is already logged in.",
                    Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_signin;
    }


    private void createAccount(String email, String password) {
        Log.d(TAG, "createAccount:" + email);
        if (!validateForm()) {
            return;
        }
        showProgressDialog();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(SignInActivity.this, "Your account has been successfully created!",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignInActivity.this, MainActivity.class));
                            finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            String errorCode = ((FirebaseAuthException) task.getException()).getErrorCode();
                            toastError(errorCode);
                        }

                        hideProgressDialog();
                    }
                });
    }

    private void toastError(String errorCode) {
        switch (errorCode) {
            case "ERROR_INVALID_CREDENTIAL":
                Toast.makeText(SignInActivity.this, "The supplied auth credential is malformed or has expired.",
                        Toast.LENGTH_SHORT).show();
                break;
            case "ERROR_INVALID_EMAIL":
                mEmailField.setError("The email address is badly formatted.");
                mEmailField.requestFocus();
                break;
            case "ERROR_WRONG_PASSWORD":
                mEmailField.setError("The password is invalid or the user does not have a password.");
                mEmailField.requestFocus();
                break;
            case "ERROR_EMAIL_ALREADY_IN_USE":
                mEmailField.setError("The email address is already in use by another account.");
                mEmailField.requestFocus();
                break;
            case "ERROR_CREDENTIAL_ALREADY_IN_USE":
                Toast.makeText(SignInActivity.this, "This credential is already associated with a different user account.",
                        Toast.LENGTH_SHORT).show();
                break;
            case "ERROR_USER_DISABLED":
                Toast.makeText(SignInActivity.this, "The user account has been disabled by an administrator.",
                        Toast.LENGTH_SHORT).show();
                break;
            case "ERROR_USER_NOT_FOUND":
                Toast.makeText(SignInActivity.this, "There is no user record corresponding to this identifier. The user may have been deleted.",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void signIn(String email, String password) {
        Log.d(TAG, "signIn:" + email);
        if (!validateForm()) {
            return;
        }

        showProgressDialog();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "signInWithEmail:success");
                            startActivity(new Intent(SignInActivity.this, MainActivity.class));
                            finish();
                        } else {
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            String errorCode = ((FirebaseAuthException) task.getException()).getErrorCode();
                            toastError(errorCode);
                        }

                        hideProgressDialog();
                    }
                });
    }

    private void signOut() {
        mAuth.signOut();
    }

    private boolean validateForm() {
        boolean valid = true;

        String email = mEmailField.getText().toString();
        if (TextUtils.isEmpty(email)) {
            mEmailField.setError("Required.");
            valid = false;
        } else {
            mEmailField.setError(null);
        }

        String password = mPasswordField.getText().toString();
        if (TextUtils.isEmpty(password)) {
            mPasswordField.setError("Required.");
            valid = false;
        } else {
            mPasswordField.setError(null);
        }
        return valid;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.emailCreateAccountButton) {
            createAccount(mEmailField.getText().toString(), mPasswordField.getText().toString());
        } else if (i == R.id.emailSignInButton) {
            signIn(mEmailField.getText().toString(), mPasswordField.getText().toString());
        }
    }
}

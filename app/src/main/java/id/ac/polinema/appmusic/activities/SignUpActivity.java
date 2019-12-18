package id.ac.polinema.appmusic.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.appmusic.R;

public class SignUpActivity extends AppCompatActivity {
//    EditText emailId, password;
//    Button btnSignUp;
//    TextView tvSignIn;
//    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        mFirebaseAuth = FirebaseAuth.getInstance();
//        emailId = findViewById(R.id.emailSignup);
//        password = findViewById(R.id.passSignup);
//        btnSignUp = findViewById(R.id.buttonreg);
//        tvSignIn = findViewById(R.id.textReg);
//        btnSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email = emailId.getText().toString();
//                String pwd = password.getText().toString();
//                if(email.isEmpty()){
//                    emailId.setError("Please enter email id");
//                    emailId.requestFocus();
//                }
//                else if(pwd.isEmpty()){
//                    password.setError("Please enter your password");
//                    password.requestFocus();
//                }
//                else if(email.isEmpty() && pwd.isEmpty()){
//                    Toast.makeText(SignUpActivity.this,"Fields Are Empty!",Toast.LENGTH_SHORT).show();
//                }
//                else if(!(email.isEmpty()) && pwd.isEmpty()){
//                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                           if(!task.isSuccessful()){
//                               Toast.makeText(SignUpActivity.this,"SignUp Unsuccessful, Please Try Again",Toast.LENGTH_SHORT).show();
//                           }
//                           else{
////                               StartActivity(new Intent(SignUpActivity.this,MainActivity.class));
//                           }
//                        }
//                    });
//                }
//                else {
//                    Toast.makeText(SignUpActivity.this,"Error Occured!",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        tvSignIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(SignUpActivity.this,LoginActivity.class);
////                StartActivity(i);
//            }
//        });
//    }
    }
}

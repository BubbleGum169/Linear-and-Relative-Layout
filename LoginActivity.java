public class LoginActivity extends AppCompatActivity {
    EditText edtStudentId, edtPassword;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtStudentId = findViewById(R.id.edtStudentId);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(v -> {
            String id = edtStudentId.getText().toString().trim();
            String pass = edtPassword.getText().toString().trim();

            if (id.isEmpty()) {
                edtStudentId.setError("Student ID required");
            } else if (pass.isEmpty()) {
                edtPassword.setError("Password required");
            } else {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
            }
        });

        btnSignup.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}

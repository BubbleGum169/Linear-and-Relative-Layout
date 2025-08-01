public class RegisterActivity extends AppCompatActivity {
    EditText edtFirstName, edtUsername, edtPhone, edtEmail, edtNote;
    Button btnBack, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtUsername = findViewById(R.id.edtUsername);
        edtPhone = findViewById(R.id.edtPhone);
        edtEmail = findViewById(R.id.edtEmail);
        edtNote = findViewById(R.id.edtNote);
        btnBack = findViewById(R.id.btnBack);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            if (validateFields()) {
                Toast.makeText(this, "Registered Successfully!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(v -> finish());
    }

    private boolean validateFields() {
        if (edtFirstName.getText().toString().isEmpty()) {
            edtFirstName.setError("First Name required");
            return false;
        } else if (edtUsername.getText().toString().isEmpty()) {
            edtUsername.setError("Username required");
            return false;
        } else if (edtPhone.getText().toString().isEmpty()) {
            edtPhone.setError("Phone required");
            return false;
        } else if (edtEmail.getText().toString().isEmpty()) {
            edtEmail.setError("Email required");
            return false;
        } else if (edtNote.getText().toString().isEmpty()) {
            edtNote.setError("Note required");
            return false;
        }
        return true;
    }
}

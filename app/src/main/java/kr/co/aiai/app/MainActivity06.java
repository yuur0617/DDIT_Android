package kr.co.aiai.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity06 extends AppCompatActivity {

    Button btn;
    EditText et_first;
    EditText et_last;
    TextView et_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main06);

        btn = findViewById(R.id.btn);
        et_first = findViewById(R.id.et_first);
        et_last = findViewById(R.id.et_last);
        et_disp = findViewById(R.id.et_disp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick();
            }
        });
    }

    void myClick() {
        String fir = et_first.getText().toString();
        String las = et_last.getText().toString();
        try {

            int first = Integer.parseInt(fir);
            int last = Integer.parseInt(las);
            StringBuilder star = new StringBuilder();

            for (int i = first; i <= last; i++) {
                for (int j = 0; j < i; j++) {
                    star.append("*");
                }
                star.append("\n");
            }
            et_disp.setText(star.toString());
        } catch (NumberFormatException e) {
            et_disp.setText("숫자를 입력해주세요.");
        }
    }
}



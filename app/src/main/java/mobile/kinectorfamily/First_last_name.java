package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class First_last_name extends AppCompatActivity {
    TextView Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_last_name);
        Next = (TextView)findViewById(R.id.textView4);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(First_last_name.this, Home.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
    }
}

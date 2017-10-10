package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Add_image_screen extends AppCompatActivity {
    TextView Not_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_image_screen);
        Not_now = (TextView)findViewById(R.id.textView12);
        Not_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Add_image_screen.this, invitesms.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
    }
}

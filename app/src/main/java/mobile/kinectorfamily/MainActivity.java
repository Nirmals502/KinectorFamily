package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout Rlv_Continue_with_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rlv_Continue_with_phone = (RelativeLayout)findViewById(R.id.relativeLayout);
        Rlv_Continue_with_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, Phone_number_screen.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
    }
}

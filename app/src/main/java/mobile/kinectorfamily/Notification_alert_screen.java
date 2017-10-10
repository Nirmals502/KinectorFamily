package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Notification_alert_screen extends AppCompatActivity {
TextView Txt_allow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_alert_screen);
        Txt_allow = (TextView)findViewById(R.id.textView10);
        Txt_allow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Notification_alert_screen.this, Add_image_screen.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
            }
        });
    }
}

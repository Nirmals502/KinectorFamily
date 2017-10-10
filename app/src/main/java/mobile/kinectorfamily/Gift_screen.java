package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gift_screen extends AppCompatActivity {
    ImageView Img_back;
    String[] Me_Array = {"Username","Notification","People Chats","Photos,Videos,Emoji",
            "Account","Report a Problem","Tell a Family Member"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_screen);
        Img_back = (ImageView) findViewById(R.id.imageView19);
        Img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Gift_screen.this, Upcoming_birthday.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_right);
            }
        });
    }
}

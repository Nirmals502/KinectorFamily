package mobile.kinectorfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Recepies extends AppCompatActivity {
    ImageView Img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies);
        Img_back = (ImageView) findViewById(R.id.imageView19);
        Img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Recepies.this, Home.class);

                startActivity(i1);

                finish();
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_right);
            }
        });
    }
}

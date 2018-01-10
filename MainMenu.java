package example.colors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button startGameBtn;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        startGameBtn = (Button) findViewById(R.id.startGameBtn);

        animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
    }
}

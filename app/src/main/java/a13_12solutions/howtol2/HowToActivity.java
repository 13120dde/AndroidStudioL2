package a13_12solutions.howtol2;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HowToActivity extends Activity {

    private TextView tvWhatToDo, tvContent;
    private Button btnPrevious, btnNext;
    private Controller controller;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        instantiateComponents();
        registerListeners();
        controller = new Controller(this);
    }

    private void registerListeners() {
        btnPrevious.setOnClickListener(new PreviousListener());
        btnNext.setOnClickListener(new NextListener());
    }

    private void instantiateComponents() {
        tvWhatToDo = (TextView) findViewById(R.id.tvWhatToDo);
        tvContent = (TextView) findViewById(R.id.tvContent);
        btnPrevious = (Button) findViewById(R.id.btnPrevious);
        btnNext = (Button) findViewById(R.id.btnNext);
        image = (ImageView) findViewById(R.id.ivBear);
    }

    public void setWhatToDo(String whatToDo) {
        tvWhatToDo.setText(whatToDo);
    }

    public void setImage(int img){
        this.image.setImageResource(img);

    }

    public void setContent(String content){
        tvContent.setText(content);
    }

    private class PreviousListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
           controller.previousClick();
        }
    }

    private class NextListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            controller.nextClick();
        }
    }
}

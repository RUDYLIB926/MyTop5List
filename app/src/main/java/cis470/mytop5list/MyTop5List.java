package cis470.mytop5list;

/*
 Ruudolph Libertini
 2500491
 Homework 1
 2/17/2017
*/


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyTop5List extends AppCompatActivity {
    ImageView Dogs;
    TextView Number;
    TextView Description;
    Button NextBtn;
    Button PreviousBtn;
    int[] picArray = {R.drawable.red_tibetan_mastiff, R.drawable.bernese_mountain_dog, R.drawable.african_lion_hunting_dog, R.drawable.portuguese_water_dog, R.drawable.australian_shepherd};
    int startIndex = 4;
    int endIndex = 0;
    int currentIndex = 4;
    String[] descriptionArray = {"Tibetan Mastiff: ITs So FLUFFY", "Bernese Mountain Dog: A big fluffy dog", "African Lion Hunting Dog: Can literally keep a lion at bay", "Portuguese Water Dog: Fun and energetic, and they love to swim", "Australian Shepherd: A little ball of energy, take it to the dog park"};
    int number = currentIndex + 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_top5_list);
        Dogs = (ImageView) findViewById(R.id.dogPics);
        Number= (TextView) findViewById(R.id.image_number);
        Description = (TextView) findViewById(R.id.description);
        NextBtn= (Button) findViewById(R.id.nextbutton);
        PreviousBtn = (Button) findViewById(R.id.previousbutton);
        setInitialPic();
    }

    public void setInitialPic(){
        setCurrentPic();
        buttonVisibility();

    }

    public void nextPic(View view){
        currentIndex--;
        number = currentIndex + 1;
        setCurrentPic();
        buttonVisibility();
    }

    public void previousPic(View view){
        currentIndex++;
        number = currentIndex + 1;
        setCurrentPic();
        buttonVisibility();
    }

    public void setCurrentPic(){

        Dogs.setImageResource(picArray[currentIndex]);
        Number.setText("Number " + number);
        Description.setText(descriptionArray[currentIndex]);

    }

    public void buttonVisibility(){

        if(currentIndex == startIndex){
            PreviousBtn.setVisibility(View.INVISIBLE);
        }else if(currentIndex == endIndex){
            NextBtn.setVisibility(View.INVISIBLE);
        }else {
            PreviousBtn.setVisibility(View.VISIBLE);
            NextBtn.setVisibility(View.VISIBLE);
        }
    }

}

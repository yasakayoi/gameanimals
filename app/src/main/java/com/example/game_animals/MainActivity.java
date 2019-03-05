package com.example.game_animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] pic_adress ={R.drawable.bear,R.drawable.bird,R.drawable.cat,R.drawable.elephant,
            R.drawable.fish,R.drawable.flower,R.drawable.giraffe,R.drawable.house,R.drawable.kangaroo,R.drawable.leo,
            R.drawable.lion,R.drawable.pig,R.drawable.rhino,R.drawable.tiger,R.drawable.wolf};
    String[] animal_name={"bear","bird","cat","elephant","fish",
            "flower","giraffe","house","kangaroo","leo",
            "lion","pig","rhino","tiger","wolf"};
    int correct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // update();
    }


    public void btn_play_Click(View view) {
        setContentView(R.layout.gaming);
        update();

    }
    public void btn_exit_Click(View view) {
        setContentView(R.layout.gameover);
    }


    public  void image_clik1(View view) {
        if(correct==0)
        {
            String line=((TextView) findViewById(R.id.textView2)).getText().toString();
            int i=Integer.valueOf(line)+1;
            ((TextView) findViewById(R.id.textView2)).setText(String.valueOf(i));

            if(i<5)
            {
                update();
            }
            else setContentView(R.layout.gamepass);
        }
        else setContentView(R.layout.gameover);
    }
    public  void image_clik2(View view) {
        if(correct==1)
        {
            String line=((TextView) findViewById(R.id.textView2)).getText().toString();
            int i=Integer.valueOf(line)+1;
            ((TextView) findViewById(R.id.textView2)).setText(String.valueOf(i));
            //++
            if(i<5)
            {
                update();
            }
            else setContentView(R.layout.gamepass);
        }
        else setContentView(R.layout.gameover);
    }
    public  void image_clik3(View view) {
        if(correct==2)
        {
            String line=((TextView) findViewById(R.id.textView2)).getText().toString();
            int i=Integer.valueOf(line)+1;
            ((TextView) findViewById(R.id.textView2)).setText(String.valueOf(i));
            //++
            if(i<5)
            {
                update();
            }
            else setContentView(R.layout.gamepass);
        }
        else setContentView(R.layout.gameover);
    }
    public  void image_clik4(View view) {
        if(correct==3)
        {
            String line=((TextView) findViewById(R.id.textView2)).getText().toString();
            int i=Integer.valueOf(line)+1;
            ((TextView) findViewById(R.id.textView2)).setText(String.valueOf(i));
            //++
            if(i<5)
            {
                update();
            }
            else setContentView(R.layout.gamepass);
        }
        else setContentView(R.layout.gameover);
    }

    public  void update() {
        int[] num= new int[4];//{(int)(Math.random()*(15)),(int)(Math.random()*(15)),(int)(Math.random()*(15)),(int)(Math.random()*(15))};
        num[0] = (int)(Math.random()*(15));
        int i = 1;
        while(i <=3) {
            int x = (int)(Math.random()*(15));
            for (int j = 0; j <= i - 1; j++) {
                if (num[j] == x) {
                    break;
                }
                //执行完循环和前几个生成的都不同则这个就是新的随机数
                if(j+1==i){
                    num[i] = x;
                    i++;
                }
            }
        }
        ((ImageView) findViewById(R.id.imageView)).setImageResource(pic_adress[num[0]]);
        ((ImageView) findViewById(R.id.imageView2)).setImageResource(pic_adress[num[1]]);
        ((ImageView) findViewById(R.id.imageView3)).setImageResource(pic_adress[num[2]]);
        ((ImageView) findViewById(R.id.imageView4)).setImageResource(pic_adress[num[3]]);

        correct =(int)(Math.random()*(4));

        ((TextView) findViewById(R.id.textView1)).setText(animal_name[num[correct]]);
    }

}

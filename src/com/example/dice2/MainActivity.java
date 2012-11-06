package com.example.dice2;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	Button btn;
	ImageView diceimg1, diceimg2;
	TextView txt, txt1, txt2;
	int i, j;
	Random ran = new Random();
	Random ran2 = new Random();
	int c, p;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        diceimg1 = (ImageView) findViewById(R.id.imageView1);
        diceimg2 = (ImageView) findViewById(R.id.imageView2);
        
        txt = (TextView) findViewById(R.id.textView4);
        txt1 = (TextView) findViewById(R.id.textView6);
        txt2 = (TextView) findViewById(R.id.textView7);
        
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(this);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		i = ran.nextInt(6);
    	diceimg1.setImageResource(R.drawable.dice21+i);
    	j = ran2.nextInt(6);
    	diceimg2.setImageResource(R.drawable.dice21+j);
    	
    	if(i > j){
    		txt.setText("Winer is Computer!!");
    		c++;
    		txt1.setText(""+c);
    	}
    	else if(j > i){
    		txt.setText("Winer is Player!!");
    		p++;
    		txt2.setText(""+p);
    	}
    	else{
    		txt.setText("ºñ±è¿ä ¤Ñ¤Ñ");
    		c++;
    		p++;
    		txt1.setText(""+c);
    		txt2.setText(""+p);
    	}
    		
	}
}

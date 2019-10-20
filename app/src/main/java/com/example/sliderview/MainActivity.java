package com.example.sliderview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView slider;
    BottomNavigationView bvn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = (SliderView) findViewById(R.id.sv);
        bvn = (BottomNavigationView)findViewById(R.id.bottomnavigation);

        //slider view
        SliderAdapter adapter = new SliderAdapter(this);
        slider.setSliderAdapter(adapter);

//Animation Part

        slider.setIndicatorAnimation(IndicatorAnimations.FILL); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        slider.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        slider.setScrollTimeInSec(6); //set scroll delay in seconds :
        slider.startAutoCycle();

  //bottomnavigation

        bvn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.home:
                        Toast.makeText(MainActivity.this,"home selected",Toast.LENGTH_SHORT).show();
                        Log.i("TAG", "home selected ");
                        return true;
                    case R.id.favorite:
                        Toast.makeText(MainActivity.this,"favorite selected",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.search:
                        Toast.makeText(MainActivity.this,"search selected",Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return true;
                }


            }
        });




    }


}

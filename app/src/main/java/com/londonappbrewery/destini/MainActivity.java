package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button top_Button;
    Button bottom_button;
    TextView StoryView;
    int StoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        top_Button = findViewById(R.id.buttonTop);
        bottom_button = findViewById(R.id.buttonBottom);
        StoryView = findViewById(R.id.storyTextView);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (StoryIndex == 1 || StoryIndex == 2) {
                    StoryView.setText(R.string.T3_Story);
                    top_Button.setText(R.string.T3_Ans1);
                    bottom_button.setText(R.string.T3_Ans2);
                    StoryIndex = 3;
                } else if (StoryIndex == 3) {
                    StoryView.setText(R.string.T6_End);
                    top_Button.setVisibility(View.GONE);
                    bottom_button.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (StoryIndex == 1) {
                    StoryView.setText(R.string.T2_Story);
                    top_Button.setText(R.string.T2_Ans1);
                    bottom_button.setText(R.string.T2_Ans2);
                    StoryIndex = 2;
                } else if (StoryIndex == 2) {
                    StoryView.setText(R.string.T4_End);
                    top_Button.setVisibility(View.GONE);
                    bottom_button.setVisibility(View.GONE);
                } else if (StoryIndex == 3) {
                    StoryView.setText(R.string.T5_End);
                    top_Button.setVisibility(View.GONE);
                    bottom_button.setVisibility(View.GONE);
                }

            }
        });

    }
}

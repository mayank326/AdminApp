package com.farmerskorner.adminapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SuggestionData extends AppCompatActivity {

    List<Suggestion> suggestionList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion_data);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        suggestionList= new ArrayList<>();

        String name="Vijay";
        String imageText=name.substring(0,1);

        String rating="4.0";
        float numberRating=Float.parseFloat(rating);
        String comment="hello my name is vijay.this app is great";
        suggestionList.add(
                new Suggestion(
                        imageText,
                        name,
                        numberRating,
                        comment));



         name="Kamal";
         imageText=name.substring(0,1);

        rating="3.5";
        numberRating=Float.parseFloat(rating);
        comment="hello my name is kamal.i hava given good rating to this app";
        suggestionList.add(
                new Suggestion(
                        imageText,
                        name,
                        numberRating,
                        comment));


        SuggestionAdapter adapter = new SuggestionAdapter(this, suggestionList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);



    }
}

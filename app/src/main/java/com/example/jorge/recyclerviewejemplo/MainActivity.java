package com.example.jorge.recyclerviewejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Alumnos> alumnosList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        alumnosList = new ArrayList<>();


        //adding some items to our list
        alumnosList.add(
                new Alumnos(
                       1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)

                        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",
                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",

                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",

                        "TICS",
                        R.drawable.icono)
        );
        alumnosList.add(
                new Alumnos(
                        1,
                        "Jorge Daniel Rubio Rodriguez",
                        "14401047",

                        "TICS",
                        R.drawable.icono)
        );



        //creating recyclerview adapter
        AlumAdapter adapter = new AlumAdapter(this, alumnosList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}

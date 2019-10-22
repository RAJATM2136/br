package com.example.likecounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 1;

    private ArrayList<String> mlikes=new ArrayList<>();
    private ArrayList<String> mimagebut=new ArrayList<>();
    private ArrayList<String> mimage=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allocate();
    }

    private void allocate() {
        Log.d(TAG, "allocate: ");
        mimage.add("mipmap-mdpi/screenshot100.png");
        mimage.add("mipmap-mdpi/screenshot101.png");
        mimage.add("mipmap-mdpi/s.png");
        mimage.add("mipmap-mdpi/screenshot103.png");
        mimage.add("mipmap-mdpi/screenshot10.png");
        mimage.add("mipmap-mdpi/screenshot105.png");
        mimage.add("mipmap-mdpi/screensh.png");
        mimage.add("mipmap-mdpi/hg.png");
        mimage.add("mipmap-mdpi/jghih.png");
        mimage.add("mipmap-mdpi/jjjj.png");
        mimage.add("mipmap-mdpi/jjjjjjkkl.png");
        mimage.add("mipmap-mdpi/creenshot7.png");
        mimage.add("mipmap-mdpi/creenshot91.png");
        mimage.add("mipmap-mdpi/creenshot92.png");

        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");
        mimagebut.add("drawable-anydpi-v24/ic_stat_name.xml");

        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");
        mlikes.add("0");

        intitrecylerview();
    }

    private void intitrecylerview() {
        Log.d(TAG, "intitrecylerview: ");
        RecyclerView recyclerView=findViewById(R.id.recyler);
        Adapter adapter=new Adapter(this,mimagebut,mimage,mlikes);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}

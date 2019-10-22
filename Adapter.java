package com.example.likecounter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {




    private static final String TAG = "Adapter";

    private ArrayList<String> mimagebut =new ArrayList<>();
    private ArrayList<String> mimage=new ArrayList<>();
    private ArrayList<String> mlikes=new ArrayList<>();

    private Context mcontexxt;

    public Adapter(Context mcontexxt, ArrayList<String> imagebt, ArrayList<String> image,ArrayList<String> likes) {
        mimagebut =imagebt;
        this.mimage =image;
        this.mlikes =likes;
        this.mcontexxt = mcontexxt;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cards, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int i) {
        Log.d(TAG, "onBindViewHolder: called.");



        holder.imagecolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: colorwillchange");




                String count=mlikes.get(i).toString();
                int c=Integer.parseInt(count);
                c++;
                mlikes.set(i,String.valueOf(c));
                holder.likes.setText(mlikes.get(i));

                mimagebut.set(i,"drawable-hdpi/ic_stat_name1.xml");
                holder.imagecolor.setBackground(Drawable.createFromPath(mimagebut.get(i)));



            }


        });
        holder.imagecolor.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                String count=mlikes.get(i).toString();
                int c=Integer.parseInt(count);
                c++;c++;
                mlikes.set(i,String.valueOf(c));
                holder.likes.setText(mlikes.get(i));

                mimagebut.set(i,"drawable-hdpi/ic_stat_name1.xml");
                holder.imagecolor.setBackground(Drawable.createFromPath(mimagebut.get(i)));

                return true;
            }
        });
        holder.image.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


                Log.d(TAG, "onClick: clicked  card"+ mimagebut.get(i));
                 Intent intent=new Intent(mcontexxt.getApplicationContext(),FullscreenActivity.class);
                 intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 mcontexxt.getApplicationContext().startActivity(intent);
                return true;
            }
        });




    }

    @Override
    public int getItemCount() {
        return mimage.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        ImageButton imagecolor;
        TextView likes;

        public  ViewHolder (View itemview){
            super(itemview);
            this.image=itemview.findViewById(R.id.image);
            this.imagecolor =itemview.findViewById(R.id.imb);
            this.likes=itemview.findViewById(R.id.counts);
        }
    }


}

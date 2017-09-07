package com.aeappss.hashtags.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.aeappss.hashtags.R;

import java.util.ArrayList;
import java.util.List;

public class GridAdapterPopular extends RecyclerView.Adapter<GridAdapterPopular.ViewHolder> {
    List<EndangeredItem> mItems;
    Button button;

    public GridAdapterPopular() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem nama = new EndangeredItem();
        nama.setName("#cat #meow #pussycat #picpets #pets #kittensofinstagram #sweet #pet #catsofinstagram #kitten #ilovemypet #petsagram #kitty #ilovecats #ilovemycat #instapets #cats #animal #nature #kittens #catlover #life #instacat #cutie #ilovecat #catstagram #catlovers #cutecate #petstagram");
        nama.setThumbnail(R.drawable.ic_android_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.tomato_16);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.tomato_512);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.tomato_256);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_bb4fa6_duck_256);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Maidah Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Al-Baqoroh Ayat 1-10");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Surat Yasin Ayat 1-100");
        nama.setThumbnail(R.drawable.ic_camera_enhance_black_24dp);
        mItems.add(nama);


    }

    @Override
    public GridAdapterPopular.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view_popular, viewGroup, false);
        GridAdapterPopular.ViewHolder viewHolder = new GridAdapterPopular.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GridAdapterPopular.ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        //viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        //public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            //imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.editText);

        }
    }
}

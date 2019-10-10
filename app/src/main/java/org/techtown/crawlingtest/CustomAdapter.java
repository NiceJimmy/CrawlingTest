package org.techtown.crawlingtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private final List<CustomDataClass> mDataList;

    Context context;

    public CustomAdapter(List<CustomDataClass> mDataList, Context context) {
        this.mDataList = mDataList;
        this.context = context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView_img;
        private TextView textView_title, textView_release, texView_director;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_img = (ImageView) itemView.findViewById(R.id.imageView1);
            textView_title = (TextView) itemView.findViewById(R.id.city1);


        }
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {


        holder.textView_title.setText(String.valueOf(mDataList.get(position).getTitle()));

        //다 해줬는데도 GlideApp 에러가 나면 rebuild project를 해주자.

        Glide.with(holder.itemView.getContext())
                .load(mDataList.get(position).getImg_url())
                .into(holder.imageView_img);




    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }


}

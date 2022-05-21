package com.example.atmosphere;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HappyAdapter extends RecyclerView.Adapter<HappyAdapter.ViewHolder> {

    interface OnitemClickListener{  //콜백리스너
        String onItemClick(int position);
    }
    OnitemClickListener mListener;

    public void setOnitemClickListener(OnitemClickListener listener){
        mListener = listener;
    }

    private final List<CardItem> mDataList;

    //외부에서 데이터를 받음
    public HappyAdapter(List<CardItem> dataList){
        mDataList = dataList;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //뷰홀더를만드는부분
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false); //아이템카드 레이아웃을가져온다

        return new ViewHolder(view); //뷰를 뷰홀더에 넣음
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) { //위에 뷰홀더가 넘어옴 데이터를 바인드해주는부분
            CardItem item = mDataList.get(position);
            holder.title.setText(item.getTitle());
            holder.image.setImageResource(item.getImage());

           holder.Playbt.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(mDataList !=null)
                    mListener.onItemClick(position);
               }
           });
    }

    @Override
    public int getItemCount() { //어댑터아이템개수
        return mDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        Button Playbt;


        public ViewHolder(@NonNull View itemView) { //construct를만들어줌
            super(itemView);
            image = itemView.findViewById(R.id.mainimage);
            title = itemView.findViewById(R.id.title_text);
            Playbt = itemView.findViewById(R.id.Playbt1);


        }
    }
}

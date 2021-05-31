package com.arends.cw1_customlistview_heinrich_arends;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {

    ImageView itemImage;
    TextView author;
    TextView title;

    ProgramViewHolder(View v){

        itemImage = v.findViewById(R.id.imageView);
        author = v.findViewById(R.id.textView1);
        title = v.findViewById(R.id.textView2);
    }
}

package com.designrknight.projectconfluence;

import android.content.Context;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

@GlideModule
public class Utility extends AppGlideModule{

    public static void loadImage(Context context, String imageUrl, int placeholder, ImageView imageView) {

        Glide.with(context)
                .load(imageUrl)
                .apply(new RequestOptions()
                .placeholder(placeholder))
                .into(imageView);
    }

}

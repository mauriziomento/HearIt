package com.everis.hearit.hearit;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by mauriziomento on 23/03/17.
 */

public class Sound extends RecyclerView.ViewHolder {

    private String name;
    private String path;

    public Sound(View itemView) {
        super(itemView);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

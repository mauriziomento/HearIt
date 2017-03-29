package com.everis.hearit.hearit;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauriziomento on 23/03/17.
 */

public class SoundListAdapter extends RecyclerView.Adapter<SoundListAdapter.SoundListView> {

    private final Activity act;
    private final int res;
    private final List<Sound> sounds = new ArrayList<Sound>();

    public SoundListAdapter(Activity act, int resource, List<Sound> sounds) {

        this.act = act;
        this.res = resource;
        this.sounds.addAll(sounds);
    }


    @Override
    public SoundListView onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(res, parent, false);
        return new SoundListView(itemView);
    }

    @Override public void onBindViewHolder(SoundListView holder, int position) {

        Sound sound = sounds.get(position);
        holder.sound_name.setText(sound.getName());

    }

    @Override public int getItemCount() {

        return sounds.size();
    }

    public class SoundListView extends RecyclerView.ViewHolder {

        TextView sound_name;

        public SoundListView(View view) {
            super(view);
            sound_name = (TextView) view.findViewById(R.id.adapter_row_sound_name);
        }
    }
}

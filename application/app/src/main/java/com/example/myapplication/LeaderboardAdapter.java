package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class LeaderboardAdapter extends RecyclerView.Adapter<LeaderboardAdapter.LeaderboardViewHolder> {
    private ArrayList<Leaderboard> mLeaderboard;

    public LeaderboardAdapter(ArrayList<Leaderboard> leaderboards) {
        mLeaderboard = leaderboards;
    }

    @NonNull
    @Override
    public LeaderboardAdapter.LeaderboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.leaderboard_list_row, parent, false);
        LeaderboardViewHolder holder = new LeaderboardViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderboardAdapter.LeaderboardViewHolder holder, int position) {
        Leaderboard leaderboard = mLeaderboard.get(position);
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        holder.ranking.setText(df.format(position + 1));
        holder.username.setText(leaderboard.getUsername());
        holder.highscore.setText(df.format(leaderboard.getHighscore()));
        if (leaderboard.getProfile().isEmpty()) {
            Picasso.get().load(R.drawable.ic_default_background).transform(new PicassoCircleTransformation()).fit().centerCrop().into(holder.profile);
        } else {
            Picasso.get().load(leaderboard.getProfile()).transform(new PicassoCircleTransformation()).fit().centerCrop().into(holder.profile);
        }
    }

    @Override
    public int getItemCount() {
        return mLeaderboard.size();
    }

    public class LeaderboardViewHolder extends RecyclerView.ViewHolder {
        public TextView ranking, username, highscore;
        public ImageView profile;

        public LeaderboardViewHolder(@NonNull View itemView) {
            super(itemView);
            ranking = itemView.findViewById(R.id.tvDisplayRankingLeaderboard);
            username = itemView.findViewById(R.id.tvDisplayUsernameLeaderboard);
            highscore = itemView.findViewById(R.id.tvDisplayScoreLeaderboard);
            profile = itemView.findViewById(R.id.ivDisplayUserProfilePic);
        }
    }

    public void setData(ArrayList<Leaderboard> data) {
        mLeaderboard.clear();
        mLeaderboard.addAll(data);
        notifyDataSetChanged();
    }
}

package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> {
    private ArrayList<Language> mLanguage;

    public LanguageAdapter(ArrayList<Language> languages) {
        mLanguage = languages;
    }

    @NonNull
    @Override
    public LanguageAdapter.LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.langauge_list_row, parent, false);
        LanguageViewHolder holder = new LanguageViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageAdapter.LanguageViewHolder holder, int position) {
        Language language = mLanguage.get(position);
        holder.name.setText(language.getName());
        holder.symbol.setImageResource(language.getImage());
    }

    @Override
    public int getItemCount() {
        return mLanguage.size();
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView symbol;

        public LanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvCourseName);
            symbol = itemView.findViewById(R.id.ivLanguagePic);
        }
    }

    public void setData(ArrayList<Language> data) {
        mLanguage.clear();
        mLanguage.addAll(data);
        notifyDataSetChanged();
    }
}

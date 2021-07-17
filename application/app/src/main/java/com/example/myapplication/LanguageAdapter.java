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
    private Listener mListener;

    public LanguageAdapter(ArrayList<Language> languages, Listener listener) {
        mLanguage = languages;
        mListener = listener;
    }

    public interface Listener {
        void onClick(View view, String name);
    }

    @NonNull
    @Override
    public LanguageAdapter.LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.langauge_list_row, parent, false);
        LanguageViewHolder holder = new LanguageViewHolder(v, mListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageAdapter.LanguageViewHolder holder, int position) {
        Language language = mLanguage.get(position);
        holder.name.setText(language.getName());
        holder.symbol.setImageResource(language.getImage());
        holder.itemView.setTag(language.getName());
    }

    @Override
    public int getItemCount() {
        return mLanguage.size();
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public ImageView symbol;
        private Listener listener;

        public LanguageViewHolder(@NonNull View itemView, Listener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.tvCourseName);
            symbol = itemView.findViewById(R.id.ivLanguagePic);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, (String) view.getTag());
        }
    }

    public void setData(ArrayList<Language> data) {
        mLanguage.clear();
        mLanguage.addAll(data);
        notifyDataSetChanged();
    }
}

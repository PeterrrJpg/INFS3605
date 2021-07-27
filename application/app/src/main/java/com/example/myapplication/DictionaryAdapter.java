package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.DictionaryViewHolder> implements Filterable {
    private ArrayList<Dictionary> mDictionary;
    private ArrayList<Dictionary> mDictionaryFiltered;

    public DictionaryAdapter(ArrayList<Dictionary> dictionaries) {
        mDictionary = dictionaries;
        mDictionaryFiltered = dictionaries;
    }

    @NonNull
    @Override
    public DictionaryAdapter.DictionaryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dictionary_list_row, parent, false);
        DictionaryViewHolder holder = new DictionaryViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DictionaryAdapter.DictionaryViewHolder holder, int position) {
        Dictionary dictionary = mDictionaryFiltered.get(position);
        holder.engWord.setText(dictionary.getEngWord());
        holder.firstNationsWord.setText(dictionary.getFirstNationsWord());
        holder.category.setText(dictionary.getCategory());
        holder.pronunciation.setText(dictionary.getPronunciation());
    }

    @Override
    public int getItemCount() {
        return mDictionaryFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    mDictionaryFiltered = mDictionary;
                } else {
                    ArrayList<Dictionary> filteredList = new ArrayList<>();
                    for (Dictionary dictionary : mDictionary) {
                        if (dictionary.getEngWord().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(dictionary);
                        }
                    }
                    mDictionaryFiltered = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mDictionaryFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mDictionaryFiltered = (ArrayList<Dictionary>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class DictionaryViewHolder extends RecyclerView.ViewHolder {
        public TextView engWord, firstNationsWord, category, pronunciation;

        public DictionaryViewHolder(@NonNull View itemView) {
            super(itemView);
            engWord = itemView.findViewById(R.id.tvEngWord);
            firstNationsWord = itemView.findViewById(R.id.tvFirstNationsWord);
            category = itemView.findViewById(R.id.tvCategory);
            pronunciation = itemView.findViewById(R.id.tvPronunciation);
        }
    }

    public void setData(ArrayList<Dictionary> data) {
        mDictionary.clear();
        mDictionary.addAll(data);
        notifyDataSetChanged();
    }

    public void sort(final int sortMethod) {
        if (mDictionaryFiltered.size() > 0) {
            Collections.sort(mDictionaryFiltered, new Comparator<Dictionary>() {
                @Override
                public int compare(Dictionary dictionary, Dictionary t1) {
                    if (sortMethod == 1) {
                        return dictionary.getEngWord().compareTo(t1.getEngWord());
                    } else {
                        return dictionary.getCategory().compareTo(t1.getCategory());
                    }
                }
            });
        }
        notifyDataSetChanged();
    }
}

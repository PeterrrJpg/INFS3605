package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    private ArrayList<Course> mCourse;
    private Listener mListener;

    public CourseAdapter(ArrayList<Course> courses, Listener listener) {
        mCourse = courses;
        mListener = listener;
    }

    public interface Listener {
        void onClick(View view, String language);
    }

    @NonNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_list_row, parent, false);
        CourseViewHolder holder = new CourseViewHolder(v, mListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        Course course = mCourse.get(position);
        holder.name.setText(course.getName());
        holder.pic.setImageResource(course.getImage());
        holder.itemView.setTag(course.getName());
    }

    @Override
    public int getItemCount() {
        return mCourse.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public ImageView pic;
        private Listener listener;

        public CourseViewHolder(@NonNull View itemView, Listener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.tvCourseName);
            pic = itemView.findViewById(R.id.ivCoursePic);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, (String) view.getTag());
        }
    }

    public void setData(ArrayList<Course> data) {
        mCourse.clear();
        mCourse.addAll(data);
        notifyDataSetChanged();
    }
}

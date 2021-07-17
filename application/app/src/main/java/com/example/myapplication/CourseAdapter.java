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

    public CourseAdapter(ArrayList<Course> courses) {
        mCourse = courses;
    }

    @NonNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_list_row, parent, false);
        CourseViewHolder holder = new CourseViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
        Course course = mCourse.get(position);
        holder.name.setText(course.getName());
        holder.pic.setImageResource(course.getImage());
    }

    @Override
    public int getItemCount() {
        return mCourse.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView pic;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvCourseName);
            pic = itemView.findViewById(R.id.ivCoursePic);
        }
    }

    public void setData(ArrayList<Course> data) {
        mCourse.clear();
        mCourse.addAll(data);
        notifyDataSetChanged();
    }
}

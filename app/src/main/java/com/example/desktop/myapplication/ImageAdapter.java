package com.example.desktop.myapplication;

/**
 * Created by Desktop on 11/2/2017.
 */

public class ImageAdapter {
    String course_name;
    int images;

    public ImageAdapter (){

    }
    public ImageAdapter(String course_name, int images) {
        this.course_name = course_name;
        this.images = images;
    }
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }


}

package com.himanshumauri.nallebache.Story;

public class MyStory {
    String title;
    String story;
    String moral;

    public MyStory() {
    }

    public MyStory(String title, String story, String moral) {
        this.title = title;
        this.story = story;
        this.moral = moral;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }
}

package com.example.uniapp.model;

public class Group {
    private String name2;
    private String help2;
    private int image;


    public Group(String name2, String help2, int image) {
        this.name2 = name2;
        this.help2 = help2;
        this.image = image;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getHelp2() {
        return help2;
    }

    public void setHelp2(String help2) {
        this.help2 = help2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}

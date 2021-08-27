package com.example.uniapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable{
    private String name;
    private String help;
    private int image;

    public User(String name, String help, int image) {
        this.name = name;
        this.help = help;
        this.image = image;
    }

    public User() {
    }

    protected User(Parcel in){
        name = in.readString();
        help = in.readString();
        image = in.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(help);
        dest.writeInt(image);

    }
}

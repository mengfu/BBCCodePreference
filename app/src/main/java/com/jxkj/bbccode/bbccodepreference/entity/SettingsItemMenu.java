package com.jxkj.bbccode.bbccodepreference.entity;



public class SettingsItemMenu {
    private int leftIcon;
    private String title;
    public SettingsItemMenu() {
    }

    public SettingsItemMenu(int leftIcon, String title) {
        this.leftIcon = leftIcon;
        this.title = title;
    }

    public int getLeftIcon() {
        return leftIcon;
    }

    public void setLeftIcon(int leftIcon) {
        this.leftIcon = leftIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LeftItemMenu{" +
                "leftIcon=" + leftIcon +
                ", title='" + title + '\'' +
                '}';
    }
}

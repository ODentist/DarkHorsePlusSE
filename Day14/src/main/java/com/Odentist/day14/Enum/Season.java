package com.Odentist.day14.Enum;

public enum Season {
    SPRING("春","spring"),
    SUMMER("夏","summer"),
    AUTUMN("秋","AUTUMN"),
    WINTER("冬","WINTER");

    private String chinese;
    private String english;

    Season(String chinese, String english) {
        this.chinese=chinese;
        this.english=english;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}

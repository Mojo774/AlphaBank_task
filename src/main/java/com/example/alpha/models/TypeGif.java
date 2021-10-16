package com.example.alpha.models;

public enum TypeGif {
    RICH,BROKE;

    public static TypeGif getType(int t){
        return t >= 0 ? RICH : BROKE;
    }
}

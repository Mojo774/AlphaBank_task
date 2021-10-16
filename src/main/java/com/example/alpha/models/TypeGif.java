package com.example.alpha.models;

public enum TypeGif {
    rich, broke;

    public static TypeGif getType(int t){
        return t >= 0 ? rich : broke;
    }
}

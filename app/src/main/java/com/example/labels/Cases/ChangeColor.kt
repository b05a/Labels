package com.example.labels.Cases

class ChangeColor {
    fun changeColor(color: String): String {
        return when (color) {
            "green" -> "white"
            "white" -> "grey"
            "grey" -> "green"
            else -> "white"
        }
    }
}
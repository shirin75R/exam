package com.shirin.myapp

data class Result(
    val id: Int,
    val name : String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin : List<Origin>,
    val location : List<Location>,
    val image: String,
    val episode : List<String>
)

data class Origin(
    val name : String,
    val url : String
)
data class Location(
    val name : String,
    val url : String
)
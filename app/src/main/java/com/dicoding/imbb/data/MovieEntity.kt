package com.dicoding.imbb.data

data class MovieEntity(
    var movieId: String,
    var title: String,
    var director: String,
    var writer: String,
    var description: String,
    var rating: String,
    var imagePath: String,
    var genre: String,
    var ratingUser: String,
    var year: String,
    var date: String,
    var duration: String,
    var link: String
)
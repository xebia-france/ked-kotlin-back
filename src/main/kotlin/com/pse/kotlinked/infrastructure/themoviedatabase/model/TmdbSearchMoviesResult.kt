package com.pse.kotlinked.infrastructure.themoviedatabase.model

import com.fasterxml.jackson.annotation.JsonProperty

data class TmdbSearchMoviesResult(
    var page: Int,
    @JsonProperty("total_pages")
    var totalPages: Int,
    @JsonProperty("total_results")
    var totalResults: Int,
    var results: List<TmdbMovie>

) {
    data class TmdbMovie(
        val id: Int,
        val adult: Boolean = false,
        @JsonProperty("backdrop_path")
        val backdropPath: String?,
        @JsonProperty("genre_ids")
        val genreIds: List<Int>?,
        @JsonProperty("original_title")
        val originalTitle: String?,
        @JsonProperty("original_language")
        val originalLanguage: String?,
        val overview: String?,
        val popularity: Double?,
        @JsonProperty("poster_path")
        val posterPath: String?,
        @JsonProperty("release_date")
        val releaseDate: String?,
        val title: String,
        @JsonProperty("vote_average")
        val voteAverage: Double?,
        @JsonProperty("vote_count")
        val voteCount: Int?
    )
}
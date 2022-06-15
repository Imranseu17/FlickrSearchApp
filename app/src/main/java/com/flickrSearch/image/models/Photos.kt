package com.flickrSearch.image.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Photos (

	@JsonProperty("page") val page : Int,
	@JsonProperty("pages") val pages : Int,
	@JsonProperty("perpage") val perpage : Int,
	@JsonProperty("total") val total : Int,
	@JsonProperty("photo") val photo : List<Photo>
)
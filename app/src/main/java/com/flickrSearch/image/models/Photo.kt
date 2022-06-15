package com.flickrSearch.image.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity(tableName = "photo")
data class Photo (
	@PrimaryKey()
	@JsonProperty("id"                   ) var id                   : String,
	@JsonProperty("owner"                ) var owner                : String,
	@JsonProperty("secret"               ) var secret               : String,
	@JsonProperty("server"               ) var server               : String,
	@JsonProperty("farm"                 ) var farm                 : Int,
	@JsonProperty("title"                ) var title                : String,
	@JsonProperty("ispublic"             ) var ispublic             : Int,
	@JsonProperty("isfriend"             ) var isfriend             : Int,
	@JsonProperty("isfamily"             ) var isfamily             : Int,
	@JsonProperty("datetaken"            ) var datetaken            : String,
	@JsonProperty("datetakengranularity" ) var datetakengranularity : Int,
	@JsonProperty("datetakenunknown"     ) var datetakenunknown     : String,
	@JsonProperty("url_h"                ) var urlH                 : String? = null,
	@JsonProperty("height_h"             ) var heightH              : Int? = null,
	@JsonProperty("width_h"              ) var widthH               : Int? = null

)
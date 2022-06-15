
package com.flickrSearch.image.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Root (

	@JsonProperty("photos") val photos : Photos,
	@JsonProperty("stat") val stat : String
)
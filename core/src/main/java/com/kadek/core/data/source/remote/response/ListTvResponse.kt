package com.kadek.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListTvResponse(

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("results")
    val result: List<TvResponse>
)
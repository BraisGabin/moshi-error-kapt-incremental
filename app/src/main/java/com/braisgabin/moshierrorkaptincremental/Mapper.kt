package com.braisgabin.moshierrorkaptincremental

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Mapper(
    val string: String
)
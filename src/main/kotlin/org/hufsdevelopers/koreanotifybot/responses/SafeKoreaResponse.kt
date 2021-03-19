package org.hufsdevelopers.koreanotifybot.responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SafeKoreaResponse<T> {
    @SerializedName("total")
    @Expose
    var total: Int? = null

    @SerializedName("page")
    @Expose
    var page: String? = null

    @SerializedName("records")
    @Expose
    var records: Int? = null

    @SerializedName("currentPageNo")
    @Expose
    var currentPageNo: Int? = null

    @SerializedName("rows")
    @Expose
    var rows: List<T>? = null
}
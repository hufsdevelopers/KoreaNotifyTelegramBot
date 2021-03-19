package org.hufsdevelopers.koreanotifybot.responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DiasterMessageRow {
    @SerializedName("rnum")
    @Expose
    var rnum: String? = null

    @SerializedName("createDate")
    @Expose
    var createDate: String? = null

    @SerializedName("msg")
    @Expose
    var msg: String? = null
}
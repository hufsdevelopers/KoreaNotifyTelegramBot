package org.hufsdevelopers.koreanotifybot.api

import org.hufsdevelopers.koreanotifybot.responses.DiasterMessageRow
import org.hufsdevelopers.koreanotifybot.responses.SafeKoreaResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SafeKoreaApi {
    @FormUrlEncoded
    @POST("disasterBreaking/showList2.do")
    fun showList(@Field("rows") rows: Int, @Field("page") page: Int): Single<SafeKoreaResponse<DiasterMessageRow>>
}
package com.example.android.myproject.network.model

import com.google.gson.annotations.SerializedName

data class Teams(
   val teams: List<Team>
)

data class Team(
   @SerializedName("idTeam")
   val id: Int,

   @SerializedName("idSoccerXML")
   val idSoccerXML: Int,

   @SerializedName("idAPIfootball")
   val idAPIfootball: Int,

   @SerializedName("intLoved")
   val intLoved: Int,

   @SerializedName("strTeam")
   val teamName: String,

   @SerializedName("strTeamShort")
   val strTeamShort: String,

   @SerializedName("strAlternate")
   val strAlternate: String,

   @SerializedName("intFormedYear")
   val intFormedYear: Int,

   @SerializedName("strSport")
   val strSport: String,

   @SerializedName("strLeague")
   val strLeague: String,

   @SerializedName("idLeague")
   val idLeague: Int,

   @SerializedName("strDivision")
   val strDivision: String?,

   @SerializedName("strManager")
   val strManager: String?,

   @SerializedName("strStadium")
   val strStadium: String,

   @SerializedName("strKeywords")
   val strKeywords: String,

   @SerializedName("strRSS")
   val strRSS: String,

   @SerializedName("strStadiumThumb")
   val strStadiumThumb: String,

   @SerializedName("strStadiumDescription")
   val strStadiumDescription: String,

   @SerializedName("strStadiumLocation")
   val strStadiumLocation: String,

   @SerializedName("intStadiumCapacity")
   val intStadiumCapacity: Int,

   @SerializedName("strWebsite")
   val strWebsite: String,

   @SerializedName("strFacebook")
   val strFacebook: String,

   @SerializedName("strTwitter")
   val strTwitter: String,

   @SerializedName("strInstagram")
   val strInstagram: String,

   @SerializedName("strDescriptionEN")
   val strDescriptionEN: String?,

   @SerializedName("strDescriptionDE")
   val strDescriptionDE: String?,

   @SerializedName("strDescriptionFR")
   val strDescriptionFR: String?,

   @SerializedName("strDescriptionCN")
   val strDescriptionCN: String?,

   @SerializedName("strDescriptionIT")
   val strDescriptionIT: String?,

   @SerializedName("strDescriptionJP")
   val strDescriptionJP: String?,

   @SerializedName("strDescriptionRU")
   val strDescriptionRU: String?,

   @SerializedName("strDescriptionES")
   val strDescriptionES: String?,

   @SerializedName("strDescriptionPT")
   val strDescriptionPT: String?,

   @SerializedName("strDescriptionSE")
   val strDescriptionSE: String?,

   @SerializedName("strDescriptionNL")
   val strDescriptionNL: String?,

   @SerializedName("strDescriptionHU")
   val strDescriptionHU: String?,

   @SerializedName("strDescriptionNO")
   val strDescriptionNO: String?,

   @SerializedName("strDescriptionIL")
   val strDescriptionIL: String?,

   @SerializedName("strDescriptionPL")
   val strDescriptionPL: String?,

   @SerializedName("strGender")
   val strGender: String?,

   @SerializedName("strCountry")
   val strCountry: String?,

   @SerializedName("strTeamBadge")
   val strTeamBadge: String?,

   @SerializedName("strTeamJersey")
   val strTeamJersey: String?,

   @SerializedName("strTeamLogo")
   val strTeamLogo: String?,

   @SerializedName("strTeamFanart1")
   val strTeamFanart1: String?,

   @SerializedName("strTeamFanart2")
   val strTeamFanart2: String?,

   @SerializedName("strTeamFanart3")
   val strTeamFanart3: String?,

   @SerializedName("strTeamFanart4")
   val strTeamFanart4: String?,

   @SerializedName("strTeamBanner")
   val strTeamBanner: String?,

   @SerializedName("strYoutube")
   val strYoutube: String?,

   @SerializedName("strLocked")
   val strLocked: String?
)
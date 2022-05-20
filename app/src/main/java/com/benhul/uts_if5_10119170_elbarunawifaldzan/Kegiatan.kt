package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kegiatan(
    val imgKegiatan: Int,
    val namaKegiatan: String,
) : Parcelable

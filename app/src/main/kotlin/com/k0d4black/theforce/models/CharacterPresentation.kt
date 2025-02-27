package com.k0d4black.theforce.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class CharacterPresentation(
    val name: String,
    val birthYear: String,
    val heightInCm: String,
    val heightInInches: String,
    val url: String
) : Parcelable
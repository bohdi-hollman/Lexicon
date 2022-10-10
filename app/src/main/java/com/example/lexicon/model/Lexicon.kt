package com.example.lexicon.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Lexicon(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
package com.example.lab4.model

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
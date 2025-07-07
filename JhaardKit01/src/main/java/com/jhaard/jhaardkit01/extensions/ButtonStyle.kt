package com.jhaard.jhaardkit01.extensions

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.jhaard.jhaardkit01.models.ButtonPresetStyle

/**
 * Button style modifier to use for presets and custom use.
 *
 * @param style The preset to choose. Else pick Custom if needed and add
 * BasicButtonStyle in constructor.
 * @return this modifier.
 */
fun Modifier.buttonStyle(style: ButtonPresetStyle): Modifier {
    val s = style.styleParams
    return this
        .padding(s.padding)
        .border(
            width = s.borderStroke,
            color = s.contentColor,
            shape = RoundedCornerShape(s.cornerRadius)
        )
        .clip(shape = RoundedCornerShape(s.cornerRadius))
        .background(s.backgroundColor)
}
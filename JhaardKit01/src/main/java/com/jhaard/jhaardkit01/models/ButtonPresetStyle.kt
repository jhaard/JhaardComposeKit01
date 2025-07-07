package com.jhaard.jhaardkit01.models

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Preset data objects.
 *
 * @property Default - Default settings.
 * @property Bordered - Thicker border and font.
 * @property Inverted - Inverted default colors white on black background.
 * @property LargeSize - Larger container and text size.
 * @property SmallSize - Smaller container and text size.
 * @property SquareShaped - Smaller corner radius.
 * @property Custom - Data model for custom style.
 *
 */
sealed class ButtonPresetStyle (val styleParams: BasicButtonStyle) {

    data object Default : ButtonPresetStyle(DefaultBasicButtonStyle)

    data object Bordered : ButtonPresetStyle(BasicButtonStyle(
        borderStroke = 4.dp,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    ))
    data object Inverted : ButtonPresetStyle(BasicButtonStyle(
        contentColor = Color.White,
        backgroundColor = Color.Black
    ))
    data object LargeSize : ButtonPresetStyle(BasicButtonStyle(
        width = 140.dp,
        height = 50.dp,
        fontSize = 20.sp,
        padding = 20.dp
    ))
    data object SmallSize : ButtonPresetStyle(BasicButtonStyle(
        width = 100.dp,
        height = 40.dp,
        fontSize = 14.sp,
        padding = 10.dp
    ))
    data object SquareShaped : ButtonPresetStyle(BasicButtonStyle(
        cornerRadius = 8.dp
    ))

    data class Custom(val customStyle: BasicButtonStyle) : ButtonPresetStyle(customStyle)

}

val DefaultBasicButtonStyle = BasicButtonStyle()


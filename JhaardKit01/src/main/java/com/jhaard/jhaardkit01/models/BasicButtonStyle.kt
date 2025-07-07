package com.jhaard.jhaardkit01.models

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jhaard.jhaardkit01.R

/**
 * Data model BasicButtonStyle - Can be used to customize the button if calling
 * Custom preset in the style modifier.
 *
 * @property padding The padding around button edges.
 * @property width The width of the button container.
 * @property height The height of the button container.
 * @property cornerRadius The corner radius of the button container.
 * @property borderStroke The thickness of the border of the button container.
 * @property fontFamily The font family of the button text. Default Nunito Sans Regular.
 * @property fontSize The size of the Button text.
 * @property fontWeight The Weight property of the button text.
 * @property textOverflow TextOverflow to Clip.
 * @property maxLines set to max 1 line.
 * @property backgroundColor the background color of the button. Set to white at default.
 * @property contentColor the color of the button content.
 */
@Stable
data class BasicButtonStyle(
    val padding: Dp = 8.dp,
    val width: Dp = 120.dp,
    val height: Dp = 50.dp,
    val cornerRadius: Dp = 50.dp,
    val borderStroke: Dp = 2.dp,
    val fontFamily: FontFamily = FontFamily(
        Font(
            R.font.nunito,
        )),
    val fontSize: TextUnit = 16.sp,
    val fontWeight: FontWeight = FontWeight.Normal,
    val textOverflow: TextOverflow = TextOverflow.Clip,
    val maxLines: Int = 1,
    val backgroundColor: Color = Color.White,
    val contentColor: Color = Color.Black,
)


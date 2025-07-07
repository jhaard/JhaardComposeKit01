package com.jhaard.jhaardkit01.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.jhaard.jhaardkit01.extensions.buttonStyle
import com.jhaard.jhaardkit01.models.ButtonPresetStyle

/**
 * A Basic modern text button with simple layout and high contrast.
 * @param modifier - The composable modifier.
 * @param text - The text of the button.
 * @param style - The ButtonPresetStyle to choose from. Choose Custom to change specifics.
 * @param onClick - lambda for click event.
 */
@Composable
fun BasicButton(
    modifier: Modifier = Modifier,
    text: String,
    style: ButtonPresetStyle,
    onClick: () -> Unit
) {
    Box(contentAlignment = Alignment.Center, modifier = modifier
        .buttonStyle(style)
        .size(width = style.styleParams.width, height = style.styleParams.height)
        .clickable { onClick() }) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontFamily = style.styleParams.fontFamily,
            fontSize = style.styleParams.fontSize,
            fontWeight = style.styleParams.fontWeight,
            overflow = style.styleParams.textOverflow,
            maxLines = style.styleParams.maxLines,
            color = style.styleParams.contentColor
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewBasicButton() {
    BasicButton(
        modifier = Modifier,
        text = "Submit",
        style = ButtonPresetStyle.SquareShaped,
        onClick = {
            println("Clicking button test")
        }
    )
}
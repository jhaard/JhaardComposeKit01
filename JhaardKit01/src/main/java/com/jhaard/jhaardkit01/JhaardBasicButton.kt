package com.jhaard.jhaardkit01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun JhaardBasicButton() {
    Row {
        Text(
            text = "Testing", textAlign = TextAlign.Center, modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewJhaardBasicButton() {
    JhaardBasicButton()
}
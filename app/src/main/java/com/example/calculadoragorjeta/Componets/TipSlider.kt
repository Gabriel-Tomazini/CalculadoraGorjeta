package com.example.calculadoragorjeta.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TipSlider(tipPercentage: Float, onValueChange: (Float) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(text = "Custom ${tipPercentage.toInt()}%", fontSize = 18.sp)

        Slider(
            value = tipPercentage,
            onValueChange = { onValueChange(it) },
            valueRange = 0f..30f,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("0%", fontSize = 14.sp)
            Text("30%", fontSize = 14.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTipSlider() {
    TipSlider(tipPercentage = 18f, onValueChange = {})
}

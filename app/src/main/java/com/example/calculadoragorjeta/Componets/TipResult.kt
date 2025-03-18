package com.example.calculadoragorjeta.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TipResult(amount: Double, tip15: Double, customTipPercentage: Float, tipCustom: Double) {
    val totalWithCustomTip = amount + tipCustom
    val totalWith15Tip = amount + tip15

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEFEFEF))
            .padding(12.dp)
    ) {
        Row {
            Column(modifier = Modifier.padding(start = 20.dp).padding(end = 20.dp)) {
                Text("Tip", fontSize = 18.sp)
                Text("Total", fontSize = 18.sp)
            }
            Row {
                Column(Modifier.weight(2f)) {
                    Text("15%", fontSize = 18.sp)
                    Text("$${String.format("%.2f", tip15)}", fontSize = 18.sp)
                }

                Column(Modifier.weight(2f)) {
                    Text("${customTipPercentage.toInt()}%", fontSize = 18.sp)
                    Text("$${String.format("%.2f", tipCustom)}", fontSize = 18.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Gray.copy(alpha = 0.2f))
                .padding(12.dp)
        ) {
            Row (modifier = Modifier.padding(start = 8.dp).padding(end = 20.dp)) {
                Text("Total: ", fontSize = 20.sp, color = Color.Black)
                Text("$${String.format("%.2f", totalWith15Tip)}", fontSize = 18.sp, color = Color.Black)
            }
            Row (modifier = Modifier.padding(start = 8.dp)) {
                Text("Total: ", fontSize = 20.sp, color = Color.Black)
                Text("$${String.format("%.2f", totalWithCustomTip)}", fontSize = 18.sp, color = Color.Black)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTipResult() {
    TipResult(amount = 100.0, tip15 = 15.0, customTipPercentage = 18f, tipCustom = 18.0)
}

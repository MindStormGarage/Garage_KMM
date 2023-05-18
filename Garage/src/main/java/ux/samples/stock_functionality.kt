package ux.samples

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun stock_elements() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val Projects =
            listOf("WebFitness","Microsoft","Amazon","Mozila","Otus","Apple","WebFitness","Microsoft","Amazon","Mozila","Otus","Apple","WebFitness","Microsoft","Amazon","Mozila","Otus","Apple")
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .wrapContentHeight()
                .verticalScroll(rememberScrollState())
        ) {
            Projects.forEach { project ->
                Card(
                    backgroundColor = Color.White,
                    modifier = Modifier
                        .width(300.dp)
                        .height(60.dp)
                        .padding(vertical = 8.dp),
                    content = {
                        Text(
                            text = project,
                            //modifier = Modifier.align(Alignment.Center)
                        )
                    }
                )
            }
        }
    }
}

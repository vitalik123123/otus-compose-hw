package com.example.cupcake

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomLayout(
    columns: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {

    Layout(
        modifier = modifier,
        content = content,
        measurePolicy = { measurables, constraints ->
            val oneElementWidth = constraints.maxWidth / columns
            var oneElementHeight = 0
            val placeables = measurables.map {
                it.measure(constraints)
            }
            oneElementHeight = placeables.maxOf { it.height }
            var currentColumn = 1
            var x = 0
            var y = 0
            layout(
                width = constraints.maxWidth, height = constraints.maxHeight
            ) {
                placeables.forEach {
                    it.placeRelative(x, y)
                    if (currentColumn < columns) {
                        x += oneElementWidth
                        currentColumn++
                    } else {
                        x = 0
                        currentColumn = 1
                        y += oneElementHeight
                    }
                }
            }
        }
    )

}

@Preview
@Composable
fun PreviewCustomLayout(

) {
    CustomLayout(COLUMNS) {

    }
}
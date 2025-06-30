package com.ttypic.proglibcounterapp.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.ttypic.proglibcounterapp.CounterComponent


@Composable
fun CounterUI(counterComponent: CounterComponent) {
    val state by counterComponent.state.subscribeAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1F))

        Text(text = "${state.count}")

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = counterComponent::onIncrease) {
            Text(text = "+")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = counterComponent::onDecrease) {
            Text(text = "-")
        }

        Spacer(modifier = Modifier.weight(1F))
    }
}
package com.ttypic.proglibcounterapp

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.reduce

data class CounterState(val count: Int)

interface CounterComponent {
    val state: Value<CounterState>
    fun onIncrease()
    fun onDecrease()
}

class DefaultCounterComponent: CounterComponent {
    override val state = MutableValue(CounterState(0))
    override fun onIncrease() {
        state.reduce { it.copy(count = it.count + 2) }
    }
    override fun onDecrease() {
        state.reduce { it.copy(count = it.count - 2) }
    }
}

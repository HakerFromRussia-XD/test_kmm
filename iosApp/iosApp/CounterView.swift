import SwiftUI
import shared

struct CounterView: View {

   private let component: CounterComponent

   @ObservedObject
   private var state: ObservableValue<CounterState>

   init(_ component: CounterComponent) {
       self.component = component
       state = ObservableValue<CounterState>(component.state)
   }

   var body: some View {
       HStack {
           Text("\(state.value.count)")
           Button(action: { component.onIncrease() }) {
               Text("+")
           }
           Button(action: { component.onDecrease() }) {
               Text("-")
           }
       }
   }
}

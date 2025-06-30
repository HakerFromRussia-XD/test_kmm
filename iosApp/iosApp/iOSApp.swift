import SwiftUI
import shared

@main
struct iOSApp: App {
	var counterComponent = DefaultCounterComponent()

	var body: some Scene {
		WindowGroup {
			CounterView(counterComponent)
		}
	}
}
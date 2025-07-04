import SwiftUI
import shared

public class ObservableValue<T : AnyObject> : ObservableObject {
    private let observableValue: Value<T>

    @Published
    var value: T

    private var observer: ((T) -> Void)?

    init(_ value: Value<T>) {
        observableValue = value
        self.value = observableValue.value
        observer = { [weak self] value in self?.value = value }
        observableValue.subscribe(observer: observer!)
    }

    deinit {
        observableValue.unsubscribe(observer: observer!)
    }
    
    func callFromKmm() {
        // моя очень сложная логика, которую можно сделать только на ios
        // например работа с блютузом
        print("callFromKmm")
    }
}

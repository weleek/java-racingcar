package racing.domain;

import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class CarFactory {
    private CarFactory() {}

    public static Cars generateCars(List<String> names) {
        return names.stream()
                .map(Car::new)
                .collect(collectingAndThen(toList(), Cars::new));
    }
}

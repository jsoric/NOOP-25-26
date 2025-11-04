package pckg_Event_solution;

import java.time.Instant;

public record WeatherSensorReadings(float temp, float pressure, float humidity, Instant atTime) {
}

package RailwayManagement.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.RailwayManagementProject.ServiceImplementation.SeatsServiceImpl;

public class SeatsServiceImplTest {

    SeatsServiceImpl service = new SeatsServiceImpl();

    @ParameterizedTest
    @ValueSource(strings = {"Yes", "yes", "No", "no", "Maybe", " "})
    void testCheckAvailability(String availability) {
        // Check availability for given input
        int actual = service.checkAvailability(availability);

        // Assert the expected outcome
        if ("No".equalsIgnoreCase(availability)) {
            Assertions.assertEquals(0, actual, "Availability should be 0 when input is 'No'");
        } else {
            Assertions.assertEquals(1, actual, "Availability should be 1 for other input values.");
        }
    }
}

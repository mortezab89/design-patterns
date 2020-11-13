package statePattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PackageTest {

    @Test
    public void test(){
        Package aPackage = new Package(null, "test package");
        assertThat(aPackage.getState() instanceof AcknowledgedState).isTrue();

        aPackage.updateState();
        assertThat(aPackage.getState() instanceof ShippedState).isTrue();

        aPackage.updateState();
        assertThat(aPackage.getState() instanceof InTransition).isTrue();

    }

}
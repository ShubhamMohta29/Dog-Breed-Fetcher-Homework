package dogapi;

import java.util.List;

/**
 * A minimal implementation of the BreedFetcher interface for testing purposes.
 * To avoid excessive calls to the real API, we can primarily test with a local
 * implementation that demonstrates the basic functionality of the interface.
 */
public class BreedFetcherForLocalTesting implements BreedFetcher {
    private int callCount = 0;

    @Override
    public List<String> getSubBreeds(String breed) throws BreedNotFoundException {
        callCount++;
        if ("hound".equalsIgnoreCase(breed)) {
            return List.of("afghan", "basset");
            // i am just checking if my git is working correctly. nothing meaningful here.
            // ok pushing works. checking if pulling works.
        }
        throw new BreedNotFoundException(breed);
    }

    public int getCallCount() {
        return callCount;
    }
}

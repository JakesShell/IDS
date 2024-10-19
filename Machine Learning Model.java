import java.util.Arrays;

public class IDSModel {
    // Simulated training function
    public void train() {
        // Load your dataset and train the model here
        System.out.println("Training the model...");
    }

    public String predict(double[] features) {
        // Simulated prediction logic (replace with actual ML model)
        if (features[0] > 1000) {
            return "Malicious";
        }
        return "Normal";
    }
}

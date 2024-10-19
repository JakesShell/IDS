import org.pcap4j.core.*;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.NamedNumber;
import org.pcap4j.packet.namednumber.Protocol;
import org.pcap4j.util.*;

import java.util.List;

public class IntrusionDetectionSystem {
    private final String interfaceName;
    private final IDSModel model;

    public IntrusionDetectionSystem(String interfaceName, IDSModel model) {
        this.interfaceName = interfaceName;
        this.model = model;
    }

    public void startCapture() throws PcapNativeException, NotOpenException {
        PcapNetworkInterface networkInterface = PcapNetworkInterface.getByName(interfaceName);
        if (networkInterface == null) {
            System.err.println("Network interface not found.");
            return;
        }

        try (PcapHandle handle = networkInterface.openLive(65536, Pcap.MODE_PROMISCUOUS, 10, null)) {
            System.out.println("Starting capture on " + interfaceName + "...");
            while (true) {
                Packet packet = handle.getNextPacketEx();
                analyzePacket(packet);
            }
        }
    }

    private void analyzePacket(Packet packet) {
        // Extract features here, for example:
        int length = packet.length();
        // Add more feature extraction logic

        // Simulated feature for prediction
        double[] features = new double[]{length}; // Add more features as needed
        String prediction = model.predict(features);
        System.out.println("Packet Length: " + length + ", Prediction: " + prediction);
    }

    public static void main(String[] args) {
        String interfaceName = args.length > 0 ? args[0] : "eth0"; // Default to eth0
        IDSModel model = new IDSModel();
        model.train(); // Load and train your model
        
        IntrusionDetectionSystem ids = new IntrusionDetectionSystem(interfaceName, model);
        try {
            ids.startCapture();
        } catch (PcapNativeException | NotOpenException e) {
            e.printStackTrace();
        }
    }
}

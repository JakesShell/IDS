# Real-Time Intrusion Detection System (IDS)

## Overview

The **Real-Time Intrusion Detection System (IDS)** is a sophisticated network security application developed in Java, designed to monitor and analyze network traffic for suspicious activities. Leveraging packet capture technology, this system provides real-time detection of potential intrusions by classifying network packets as either normal or malicious using machine learning algorithms. 

This tool aims to enhance network security by offering a proactive approach to threat detection, enabling organizations to respond swiftly to potential threats and minimize risks.

## Key Features

- **Real-Time Traffic Monitoring**: Continuously captures and analyzes network packets from specified interfaces, providing immediate insights into network activity.
  
- **Machine Learning Classification**: Utilizes a machine learning model to classify network traffic based on extracted features, allowing for dynamic detection of anomalous behavior.

- **Customizable Feature Extraction**: The system is designed to be extendable, allowing users to modify and enhance feature extraction methods to suit specific requirements and improve detection accuracy.

- **User-Friendly Interface**: Although primarily a command-line tool, the architecture allows for easy integration with a graphical user interface (GUI) for enhanced user interaction (future enhancements).

## Technologies Used

- **Java**: The primary programming language used for implementing the IDS, ensuring robust performance and portability across platforms.
  
- **Pcap4J**: A powerful Java library for packet capture and analysis, enabling real-time traffic monitoring and packet processing.

- **Machine Learning Framework**: The application can be extended to integrate with machine learning libraries such as Weka for advanced classification techniques and model training.

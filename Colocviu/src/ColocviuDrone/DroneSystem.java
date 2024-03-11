package ColocviuDrone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class DroneSystem extends JFrame {
    private ArrayList<Drone> droneList;
    private JTextArea displayTextArea;
    private JTextField modelTextField;
    private JTextField rangeTextField;
    private JTextField typeTextField;

    public DroneSystem() {
        setTitle("Drone Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 400));

        droneList = new ArrayList<>();

        displayTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(displayTextArea);

        JLabel modelLabel = new JLabel("Model:");
        modelTextField = new JTextField();
        JLabel rangeLabel = new JLabel("Flight Range:");
        rangeTextField = new JTextField();
        JLabel typeLabel = new JLabel("Type:");
        typeTextField = new JTextField();

        JButton addButton = new JButton("Add Drone");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDrone();
            }
        });

        JButton searchButton = new JButton("Search Drones");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchDrones();
            }
        });

        JButton displayButton = new JButton("Display Drones");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayDrones();
            }
        });

        JButton saveButton = new JButton("Save Drones");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDrones();
            }
        });

        JButton saveToFileButton = new JButton("Save Records to File");
        saveToFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFile();
            }
        });

        JButton loadFromFileButton = new JButton("Load Records from File");
        loadFromFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadFromFile();
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(modelLabel);
        inputPanel.add(modelTextField);
        inputPanel.add(rangeLabel);
        inputPanel.add(rangeTextField);
        inputPanel.add(typeLabel);
        inputPanel.add(typeTextField);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 2));
        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(saveToFileButton);
        buttonPanel.add(loadFromFileButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void addDrone() {
        String model = modelTextField.getText();
        String flightRange = rangeTextField.getText();
        String type = typeTextField.getText();
        Drone drone;
        switch (type) {
            case "Quadcopter":
                drone = new Quadcopter(model, Double.parseDouble(flightRange));
                break;
            case "Fixed Wing":
                drone = new FixedWing(model, Double.parseDouble(flightRange));
                break;
            case "Hexacopter":
                drone = new Hexacopter(model, Double.parseDouble(flightRange));
                break;
            default:
                return;
        }
        droneList.add(drone);
        modelTextField.setText("");
        rangeTextField.setText("");
        typeTextField.setText("");
        displayTextArea.append("Drone added: " + drone.toString() + "\n");
    }

    private void searchDrones() {
        String searchTerm = JOptionPane.showInputDialog(this, "Enter the drone model to search:");
        if (searchTerm != null && !searchTerm.isEmpty()) {
            displayTextArea.setText("");
            for (Drone drone : droneList) {
                if (drone.getModel().equalsIgnoreCase(searchTerm)) {
                    displayTextArea.append(drone.toString() + "\n");
                }
            }
        }
    }

    private void displayDrones() {
        displayTextArea.setText("");
        for (Drone drone : droneList) {
            displayTextArea.append(drone.toString() + "\n");
        }
    }

    private void saveDrones() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (FileOutputStream fos = new FileOutputStream(file);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(droneList);
                System.out.println("Drones saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(file)) {
                for (Drone drone : droneList) {
                    writer.println(drone.toString());
                }
                System.out.println("Drone records saved to file successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    displayTextArea.append(line + "\n");
                }
                System.out.println("Drone records loaded from file successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DroneSystem();
            }
        });
    }
}

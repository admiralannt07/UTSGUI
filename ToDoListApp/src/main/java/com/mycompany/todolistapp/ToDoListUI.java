/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.todolistapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class ToDoListUI extends javax.swing.JFrame {

    private ArrayList<JTextField> tasks = new ArrayList<>();
    private ArrayList<JButton> doneButtons = new ArrayList<>();
    private ArrayList<JCheckBox> taskCheckboxes = new ArrayList<>();
    private ArrayList<JComboBox<String>> hoursList = new ArrayList<>();
    private ArrayList<String> daysList = new ArrayList<>();

    /**
     * Creates new form ToDoListUI
     */
    public ToDoListUI() {
        initComponents();

        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);

        // Add a WindowListener to handle the window close event
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                confirmExit(); // Call the confirmExit method when closing the window
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addTaskButton = new javax.swing.JButton();
        clearCompletedButton = new javax.swing.JButton();
        clearSelectedButton = new javax.swing.JButton();
        showTasksButton = new javax.swing.JButton();
        scrollPaneTaskPanel = new javax.swing.JScrollPane();
        taskPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        addTaskButton.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        addTaskButton.setText("Add Task");
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });

        clearCompletedButton.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        clearCompletedButton.setText("Clear Completed Task");
        clearCompletedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCompletedButtonActionPerformed(evt);
            }
        });

        clearSelectedButton.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        clearSelectedButton.setText("Clear Selected Task");
        clearSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSelectedButtonActionPerformed(evt);
            }
        });

        showTasksButton.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        showTasksButton.setText("Show Tasks");
        showTasksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTasksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(addTaskButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearCompletedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearSelectedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showTasksButton)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearCompletedButton)
                    .addComponent(addTaskButton)
                    .addComponent(clearSelectedButton)
                    .addComponent(showTasksButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        taskPanel.setBackground(new java.awt.Color(255, 255, 255));
        taskPanel.setLayout(new javax.swing.BoxLayout(taskPanel, javax.swing.BoxLayout.Y_AXIS));
        scrollPaneTaskPanel.setViewportView(taskPanel);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To Do List App");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPaneTaskPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addComponent(scrollPaneTaskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        // TODO add your handling code here:
        if (tasks.size() < 7) {
            Color bg = new Color(255,255,255);
            JPanel taskRow = new JPanel(new GridBagLayout());
            taskRow.setBackground(bg);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.insets = new Insets(5, 5, 5, 5);

            Font poppinsFont = new Font("Poppins", Font.PLAIN, 16);
            JLabel taskNumberLabel = new JLabel("Task " + (tasks.size() + 1) + ": ");
            taskNumberLabel.setFont(poppinsFont);

            JCheckBox taskCheckbox = new JCheckBox();
            taskCheckboxes.add(taskCheckbox);

            JTextField taskField = new JTextField("Enter your task here...", 20);
            taskField.setFont(poppinsFont);
            taskField.setForeground(Color.GRAY);
            taskField.setBackground(Color.PINK);
            tasks.add(taskField);

            taskField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (taskField.getText().equals("Enter your task here...")) {
                        taskField.setText("");
                        taskField.setForeground(Color.BLACK);
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    if (taskField.getText().isEmpty()) {
                        taskField.setText("Enter your task here...");
                        taskField.setForeground(Color.GRAY);
                    }
                }
            });

            JButton doneButton = new JButton("Done");
            doneButton.setPreferredSize(new Dimension(80, 30));
            doneButton.addActionListener(e -> markTaskAsDone(taskField));
            doneButtons.add(doneButton);

            // Add Hour ComboBox
            JComboBox<String> hourComboBox = new JComboBox<>();
            for (int i = 0; i < 24; i++) {
                hourComboBox.addItem(String.format("%02d:00", i));
            }
            hoursList.add(hourComboBox);

            // Add Day Radio Buttons
            JPanel dayPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            ButtonGroup dayGroup = new ButtonGroup();
            String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            for (String day : days) {
                JRadioButton dayRadio = new JRadioButton(day);
                dayGroup.add(dayRadio);
                dayPanel.add(dayRadio);
                dayRadio.addActionListener(e -> {
                    if (!daysList.contains(day)) {
                        daysList.add(day);
                    }
                });
            }

            // Layout adjustments for each row
            gbc.gridx = 0;
            taskRow.add(taskNumberLabel, gbc);

            gbc.gridx = 1;
            taskRow.add(taskCheckbox, gbc);

            gbc.gridx = 2;
            taskRow.add(taskField, gbc);

            gbc.gridx = 3;
            taskRow.add(doneButton, gbc);

            JPanel additionalInfoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            additionalInfoPanel.add(hourComboBox);
            additionalInfoPanel.add(dayPanel);

            gbc.gridx = 0;
            gbc.gridwidth = 4;
            gbc.gridy = GridBagConstraints.RELATIVE;
            taskRow.add(additionalInfoPanel, gbc);

            taskPanel.add(taskRow);
            taskPanel.revalidate();
            taskPanel.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Maximum task limit reached.");
        }
    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void markTaskAsDone(JTextField taskField) {
        taskField.setBackground(Color.GREEN); // Set color to green for completed task
        taskField.setEditable(false); // Optionally make the field non-editable once done
    }

    private void clearCompletedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCompletedButtonActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getBackground() == Color.GREEN) {
                // Remove the task row from the panel
                taskPanel.remove(tasks.get(i).getParent());

                // Remove from lists
                tasks.remove(i);
                doneButtons.remove(i);
                i--; // Adjust index after removal
            }
        }

        // Refresh the task panel to reflect cleared tasks
        taskPanel.revalidate();
        taskPanel.repaint();
    }//GEN-LAST:event_clearCompletedButtonActionPerformed

    private void clearSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSelectedButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Tasks size: " + tasks.size());
        System.out.println("TaskCheckboxes size: " + taskCheckboxes.size());
        System.out.println("DoneButtons size: " + doneButtons.size());
        System.out.println("HoursList size: " + hoursList.size());
        System.out.println("DaysList size: " + daysList.size());

        for (int i = taskCheckboxes.size() - 1; i >= 0; i--) {
            JCheckBox checkBox = taskCheckboxes.get(i);
            if (checkBox.isSelected()) {
                // Safely remove each component
                taskPanel.remove(taskPanel.getComponent(i));
                tasks.remove(i);
                taskCheckboxes.remove(i);
                doneButtons.remove(i);
                hoursList.remove(i);
                if (daysList.size() > i) {
                    daysList.remove(i);
                }
            }
        }

        taskPanel.revalidate();
        taskPanel.repaint();
    }//GEN-LAST:event_clearSelectedButtonActionPerformed

    private void showTasksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTasksButtonActionPerformed
        // TODO add your handling code here:
        StringBuilder taskList = new StringBuilder("Your Tasks:\n");
        for (int i = 0; i < tasks.size(); i++) {
            JTextField taskField = tasks.get(i);
            String taskText = taskField.getText();
            String status = taskField.getBackground().equals(Color.GREEN) ? "Completed" : "Not Completed";
            String time = hoursList.get(i).getSelectedItem().toString();
            String day = daysList.size() > i ? daysList.get(i) : "No day selected";
            taskList.append("Task ").append(i + 1).append(": ").append(taskText).append(" - ").append(status)
                    .append(" - ").append(time).append(" on ").append(day).append("\n");
        }

        JTextArea textArea = new JTextArea(taskList.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        JOptionPane.showMessageDialog(this, scrollPane, "Task List", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showTasksButtonActionPerformed

    private void confirmExit() {
        int option = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Are you sure to quit?", // Message
                "Exit Confirmation", // Title of the dialog
                javax.swing.JOptionPane.YES_NO_OPTION, // Options: Yes and No
                javax.swing.JOptionPane.QUESTION_MESSAGE // Type: Question icon
        );

        // Check the user's choice
        if (option == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0); // Exit the program if "Yes" is selected
        } // If "No" is selected, the dialog will close and the program will continue running
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToDoListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDoListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTaskButton;
    private javax.swing.JButton clearCompletedButton;
    private javax.swing.JButton clearSelectedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollPaneTaskPanel;
    private javax.swing.JButton showTasksButton;
    private javax.swing.JPanel taskPanel;
    // End of variables declaration//GEN-END:variables
}

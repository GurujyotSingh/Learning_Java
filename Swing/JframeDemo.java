import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Donation {
    String id, donorName, email, phone, gender, city, state, amount, category, 
           paymentMethod, pan, address, message, date;
    
    Donation(String id, String donorName, String email, String phone, String gender, 
             String city, String state, String amount, String category, String paymentMethod, 
             String pan, String address, String message) {
        this.id = id;
        this.donorName = donorName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.amount = amount;
        this.category = category;
        this.paymentMethod = paymentMethod;
        this.pan = pan;
        this.address = address;
        this.message = message;
        this.date = java.time.LocalDate.now().toString();
    }
}

class DonationManager {
    static ArrayList<Donation> donations = new ArrayList<>();
}

// ================= ADMIN DASHBOARD =================
class AdminDashboard extends JFrame {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> donationList;

    AdminDashboard() {
        setIconImage(new ImageIcon("C:\\xampp\\htdocs\\practicefolder\\ANANDSEWA\\LOGO.png").getImage());
        setTitle("Admin Dashboard - Anand Sewa NGO");
        setSize(1100, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("DONATION RECORDS", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBackground(new Color(30, 23, 96));
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        add(title, BorderLayout.NORTH);

        donationList = new JList<>(listModel);
        add(new JScrollPane(donationList), BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        JButton addBtn = new JButton("Add Donation");
        JButton updateBtn = new JButton("Update");
        JButton deleteBtn = new JButton("Delete");
        JButton logoutBtn = new JButton("Logout");

        btnPanel.add(addBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(deleteBtn);
        btnPanel.add(logoutBtn);
        add(btnPanel, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> addDonationForm());
        updateBtn.addActionListener(e -> updateDonationForm());
        deleteBtn.addActionListener(e -> deleteDonation());
        logoutBtn.addActionListener(e -> { dispose(); new MyFrame(); });

        refreshList();
        setVisible(true);
    }

    private void refreshList() {
        listModel.clear();
        for (Donation d : DonationManager.donations) {
            listModel.addElement(d.id + " | " + d.donorName + " | ₹" + d.amount + " | " + d.category);
        }
    }

    private void addDonationForm() {
        showDonationForm(null, false);
    }

    private void updateDonationForm() {
        int index = donationList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        showDonationForm(DonationManager.donations.get(index), true);
    }

    private void showDonationForm(Donation existing, boolean isUpdate) {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField nameField = new JTextField(existing != null ? existing.donorName : "");
        JTextField emailField = new JTextField(existing != null ? existing.email : "");
        JTextField phoneField = new JTextField(existing != null ? existing.phone : "");
        JTextField cityField = new JTextField(existing != null ? existing.city : "");
        JTextField amountField = new JTextField(existing != null ? existing.amount : "");
        JTextField panField = new JTextField(existing != null ? existing.pan : "");
        JTextArea addressArea = new JTextArea(existing != null ? existing.address : "", 3, 25);
        JTextArea messageArea = new JTextArea(existing != null ? existing.message : "", 3, 25);

        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        JComboBox<String> stateBox = new JComboBox<>(new String[]{"Punjab","Gujarat","Delhi","Haryana","Maharashtra","Rajasthan"});
        JComboBox<String> categoryBox = new JComboBox<>(new String[]{"Education Support","Healthcare","Food Distribution","Disability Support","Women Empowerment","Child Welfare"});
        JComboBox<String> paymentBox = new JComboBox<>(new String[]{"UPI","Credit Card","Debit Card","Net Banking","Cash"});

        if (existing != null) {
            genderBox.setSelectedItem(existing.gender);
            stateBox.setSelectedItem(existing.state);
            categoryBox.setSelectedItem(existing.category);
            paymentBox.setSelectedItem(existing.paymentMethod);
        }

        panel.add(new JLabel("Donor Name")); panel.add(nameField);
        panel.add(new JLabel("Email")); panel.add(emailField);
        panel.add(new JLabel("Phone")); panel.add(phoneField);
        panel.add(new JLabel("Gender")); panel.add(genderBox);
        panel.add(new JLabel("City")); panel.add(cityField);
        panel.add(new JLabel("State")); panel.add(stateBox);
        panel.add(new JLabel("Amount")); panel.add(amountField);
        panel.add(new JLabel("Category")); panel.add(categoryBox);
        panel.add(new JLabel("Payment Method")); panel.add(paymentBox);
        panel.add(new JLabel("PAN")); panel.add(panField);
        panel.add(new JLabel("Address")); panel.add(new JScrollPane(addressArea));
        panel.add(new JLabel("Message")); panel.add(new JScrollPane(messageArea));

        String title = isUpdate ? "Update Donation" : "Add New Donation";
        int result = JOptionPane.showConfirmDialog(this, panel, title, JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String id = isUpdate ? existing.id : "D" + (DonationManager.donations.size() + 1001);
            Donation d = new Donation(id, nameField.getText(), emailField.getText(), 
                phoneField.getText(), (String)genderBox.getSelectedItem(), cityField.getText(),
                (String)stateBox.getSelectedItem(), amountField.getText(), 
                (String)categoryBox.getSelectedItem(), (String)paymentBox.getSelectedItem(),
                panField.getText(), addressArea.getText(), messageArea.getText());

            if (isUpdate) {
                DonationManager.donations.set(DonationManager.donations.indexOf(existing), d);
            } else {
                DonationManager.donations.add(d);
            }
            refreshList();
        }
    }

    private void deleteDonation() {
        int index = donationList.getSelectedIndex();
        if (index != -1 && JOptionPane.showConfirmDialog(this, "Delete this record?") == JOptionPane.YES_OPTION) {
            DonationManager.donations.remove(index);
            refreshList();
        }
    }
}

// ================= HOME SCREEN (Your Original Layout) =================
class HomeScreen extends JFrame {
    String u_email, userID, u_name;
    JTextField donorName, phone, city, amount, pan;
    JComboBox<String> stateBox, categoryBox, paymentBox;
    ButtonGroup genderGroup;
    JTextArea addressArea, messageArea;
    JCheckBox anonymous;
    String originalName;

    HomeScreen(String u_name, String u_email, String userID) {
        this.u_email = u_email;
        this.userID = userID;
        this.u_name = u_name;
        this.originalName = u_name;

        setIconImage(new ImageIcon("C:\\xampp\\htdocs\\practicefolder\\ANANDSEWA\\LOGO.png").getImage());

        Color primary = new Color(30, 23, 96);
        Color secondary = new Color(255, 172, 12);

        setTitle("Anand Sewa NGO - Donation Form");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // HEADING
        JLabel heading = new JLabel("ANAND SEWA NGO DONATION PORTAL");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setOpaque(true);
        heading.setBackground(primary);
        heading.setForeground(Color.WHITE);
        heading.setPreferredSize(new Dimension(1000, 70));

        // FORM PANEL
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 15, 15));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        formPanel.setBackground(Color.WHITE);

        formPanel.add(new JLabel("User ID"));
        JTextField txtID = new JTextField(userID); txtID.setEditable(false); formPanel.add(txtID);

        formPanel.add(new JLabel("Donor Name"));
        donorName = new JTextField(u_name); formPanel.add(donorName);

        formPanel.add(new JLabel("Email"));
        JTextField email = new JTextField(u_email); formPanel.add(email);

        formPanel.add(new JLabel("Phone Number"));
        phone = new JTextField(); formPanel.add(phone);

        formPanel.add(new JLabel("Gender"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.setBackground(Color.WHITE);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(male); genderGroup.add(female); genderGroup.add(other);
        genderPanel.add(male); genderPanel.add(female); genderPanel.add(other);
        formPanel.add(genderPanel);

        formPanel.add(new JLabel("City"));
        city = new JTextField(); formPanel.add(city);

        formPanel.add(new JLabel("State"));
        stateBox = new JComboBox<>(new String[]{"Punjab","Gujarat","Delhi","Haryana","Maharashtra","Rajasthan"});
        formPanel.add(stateBox);

        formPanel.add(new JLabel("Donation Amount"));
        amount = new JTextField(); formPanel.add(amount);

        formPanel.add(new JLabel("Donation Category"));
        categoryBox = new JComboBox<>(new String[]{"Education Support","Healthcare","Food Distribution","Disability Support","Women Empowerment","Child Welfare"});
        formPanel.add(categoryBox);

        formPanel.add(new JLabel("Payment Method"));
        paymentBox = new JComboBox<>(new String[]{"UPI","Credit Card","Debit Card","Net Banking","Cash"});
        formPanel.add(paymentBox);

        formPanel.add(new JLabel("PAN Number"));
        pan = new JTextField(); formPanel.add(pan);

        // Address
        JPanel addressPanel = new JPanel(new BorderLayout());
        addressPanel.setBackground(Color.WHITE);
        addressPanel.setBorder(BorderFactory.createTitledBorder("Address"));
        addressArea = new JTextArea(3, 20); addressArea.setLineWrap(true); addressArea.setWrapStyleWord(true);
        addressPanel.add(addressArea);

        // Message
        JPanel messagePanel = new JPanel(new BorderLayout());
        messagePanel.setBackground(Color.WHITE);
        messagePanel.setBorder(BorderFactory.createTitledBorder("Purpose / Message"));
        messageArea = new JTextArea(3, 20); messageArea.setLineWrap(true); messageArea.setWrapStyleWord(true);
        messagePanel.add(messageArea);

        // Options
        JPanel optionPanel = new JPanel();
        optionPanel.setBackground(Color.WHITE);
        anonymous = new JCheckBox("Donate Anonymously");
        JCheckBox newsletter = new JCheckBox("Receive NGO Updates");
        anonymous.setBackground(Color.WHITE);
        newsletter.setBackground(Color.WHITE);
        optionPanel.add(anonymous);
        optionPanel.add(newsletter);

        anonymous.addActionListener(e -> {
            if (anonymous.isSelected()) {
                donorName.setText("Anonymous");
                donorName.setEditable(false);
            } else {
                donorName.setText(originalName);
                donorName.setEditable(true);
            }
        });

        // Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        JButton donateBtn = new JButton("Donate Now");
        JButton resetBtn = new JButton("Reset Form");
        JButton logoutBtn = new JButton("Logout");

        donateBtn.setBackground(secondary); donateBtn.setForeground(Color.WHITE);
        resetBtn.setBackground(primary); resetBtn.setForeground(Color.WHITE);
        logoutBtn.setBackground(new Color(180,0,0)); logoutBtn.setForeground(Color.WHITE);

        buttonPanel.add(donateBtn);
        buttonPanel.add(resetBtn);
        buttonPanel.add(logoutBtn);

        donateBtn.addActionListener(e -> {
            if (donorName.getText().trim().isEmpty() || amount.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill required fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String id = "D" + (DonationManager.donations.size() + 1001);
            Donation d = new Donation(id, donorName.getText(), u_email, phone.getText(), 
                "", city.getText(), (String)stateBox.getSelectedItem(), amount.getText(), 
                (String)categoryBox.getSelectedItem(), (String)paymentBox.getSelectedItem(),
                pan.getText(), addressArea.getText(), messageArea.getText());
            DonationManager.donations.add(d);
            JOptionPane.showMessageDialog(this, "Thank You For Your Donation!", "Success", JOptionPane.INFORMATION_MESSAGE);
        });

        resetBtn.addActionListener(e -> {
            phone.setText("");
            city.setText("");
            amount.setText("");
            pan.setText("");
            addressArea.setText("");
            messageArea.setText("");
            genderGroup.clearSelection();
            anonymous.setSelected(false);
            stateBox.setSelectedIndex(0);
            categoryBox.setSelectedIndex(0);
            paymentBox.setSelectedIndex(0);
            donorName.setText(originalName);
            donorName.setEditable(true);
        });

        logoutBtn.addActionListener(e -> { dispose(); new MyFrame(); });

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(formPanel);
        centerPanel.add(addressPanel);
        centerPanel.add(messagePanel);
        centerPanel.add(optionPanel);

        add(heading, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}

// ================= LOGIN SCREEN (Original Layout) =================
class MyFrame extends JFrame implements ActionListener {
    JPasswordField pass = new JPasswordField(15);
    JTextField userEmail = new JTextField(15);
    JButton submit = new JButton("Login");

    String u_names[] = {"Super Admin","Gurujyot Singh","Test user"};
    String emails[] = {"admin@gmail.com","guru@gmail.com","test@gmail.com"};
    String passwords[] = {"admin123","guru123","test123"};
    String user_id[] = {"NGOAD01","NGONU01","NGONU02"};

    JPanel leftPanel = new JPanel(new BorderLayout());
    JPanel rightPanel = new JPanel();

    MyFrame() {
        try {
            setIconImage(new ImageIcon("C:\\xampp\\htdocs\\practicefolder\\ANANDSEWA\\LOGO.png").getImage());

            JLabel label = new JLabel("hi");
            label.setForeground(Color.white);
            BoxLayout box = new BoxLayout(rightPanel,BoxLayout.Y_AXIS);
            rightPanel.setLayout(box);

            ImageIcon icon = new ImageIcon("C:\\xampp\\htdocs\\practicefolder\\ANANDSEWA\\hero.jpg");
            label.setIcon(icon);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            leftPanel.add(label,BorderLayout.EAST);

            rightPanel.add(Box.createVerticalGlue());
            JPanel userRow1 = new JPanel(new GridLayout(1,2));
            JPanel userRow2 = new JPanel(new GridLayout(1,2));
            JLabel message = new JLabel("LOGIN FORM");
            message.setFont(new Font("Arial", Font.BOLD, 30));
            message.setHorizontalAlignment(SwingConstants.CENTER);
            message.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel email = new JLabel("Enter Your Email : ");
            email.setFont(new Font("Poppins",Font.BOLD,17));
            userRow1.add(email);
            userRow1.add(userEmail);

            JLabel password = new JLabel("Enter your password : ");
            password.setFont(new Font("Poppins",Font.BOLD,17));
            userRow2.add(password);
            userRow2.add(pass);

            userEmail.setBorder(null);
            pass.setBorder(null);
            submit.setBorderPainted(false);
            submit.setContentAreaFilled(true);
            submit.setBackground(new Color(0, 120, 215));
            submit.setForeground(Color.WHITE);
            submit.setFont(new Font("Arial", Font.BOLD, 16));
            submit.setPreferredSize(new Dimension(150, 40));

            userRow1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
            userRow2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

            rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 40));
            rightPanel.add(message);
            rightPanel.add(Box.createVerticalStrut(60));
            userRow1.setOpaque(false);
            userRow2.setOpaque(false);
            rightPanel.add(userRow1);
            rightPanel.add(Box.createVerticalStrut(20));
            rightPanel.add(userRow2);
            rightPanel.add(Box.createVerticalStrut(20));
            rightPanel.add(submit);
            rightPanel.add(Box.createVerticalGlue());

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Anand Sewa NGO");
            this.setLayout(new GridLayout(1,2));
            this.add(leftPanel);
            this.add(rightPanel);
            leftPanel.setBackground(new Color(30,23,96));
            rightPanel.setBackground(new Color(255, 172, 12));
            this.setSize(1000,800);
            this.setVisible(true);

            submit.addActionListener(this);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String u_email = userEmail.getText();
            String password = String.valueOf(pass.getPassword());
            String userID = null;
            String userName = null;
            boolean isUser = false;

            for (int i = 0; i < emails.length; i++) {
                if (u_email.equals(emails[i]) && password.equals(passwords[i])) {
                    isUser = true;
                    userID = user_id[i];
                    userName = u_names[i];
                    break;
                }
            }

            if (isUser) {
                this.dispose();
                if (userName.equals("Super Admin")) {
                    new AdminDashboard();
                } else {
                    new HomeScreen(userName, u_email, userID);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email or Password!\nPlease try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

class JframeDemo {
    public static void main(String args[]) {
        new MyFrame();
    }
}
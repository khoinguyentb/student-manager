/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.model.Student;
import com.mycompany.model.StudentDAO;
import com.mycompany.model.User;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vankh
 */
public class StudentListView extends javax.swing.JFrame {

    private Student student;
    private User user;
    private String [] columnNames = new String [] {
        "ID", "Họ Tên", "Ngày Sinh", "Địa Chỉ", "Khoa", "Lớp","GPA"};
    private String [] columnNamesUser = new String [] {
        "ID","User Name", "Passworld"};
    private Object data = new Object[][]{};
    private StudentDAO studenDAO;
    public StudentListView() {
        studenDAO = new StudentDAO();
        initComponents();
        ListSinhVienTable.setComponentPopupMenu(studentPopupMenu);
        txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                SeachStudent();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                SeachStudent();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
   private void SeachStudent(){
       if(!"".equals(ThongTinTim())){
           String ThongTinTim = ThongTinTim();
            List<Student> SeachStudentList = new ArrayList<>();
            for(Student s : studenDAO.getStudentList()){
                if(ThongTinTim.equals(String.valueOf(s.getId())) || ThongTinTim.equals(s.getName()) || ThongTinTim.equals(s.getAddress()) || ThongTinTim.equals(s.getDepartment()) || ThongTinTim.equals(s.getclass())){
                    SeachStudentList.add(s);
                }
            }
            showListStudents(SeachStudentList);
       }
       else{
           showListStudents(studenDAO.getStudentList());
       }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogStudentManager = new javax.swing.JDialog();
        DialogPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtKhoa = new javax.swing.JTextField();
        txtLop = new javax.swing.JTextField();
        txtGPA = new javax.swing.JTextField();
        btnAddSV = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        txtPhoneNumber = new javax.swing.JTextField();
        txtGmail = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        SortbuttonGroup = new javax.swing.ButtonGroup();
        studentPopupMenu = new javax.swing.JPopupMenu();
        MenuItemUpdate = new javax.swing.JMenuItem();
        MenuItemDelete = new javax.swing.JMenuItem();
        CardPanel = new javax.swing.JPanel();
        StudentPanel = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListSinhVienTable = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        UserPanel = new javax.swing.JPanel();
        lbTitleUser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        txtUIDUser = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassUser = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        StudentMenu = new javax.swing.JMenu();
        MenuItemShowListStudent = new javax.swing.JMenuItem();
        AddStudentMenuItem = new javax.swing.JMenuItem();
        SortMenu = new javax.swing.JMenu();
        rbtnMenuitemNone = new javax.swing.JRadioButtonMenuItem();
        rbtnMenuItemSortGPA = new javax.swing.JRadioButtonMenuItem();
        rbtnMenuItemSortName = new javax.swing.JRadioButtonMenuItem();
        UserMenu = new javax.swing.JMenu();
        MenuItemAddUser = new javax.swing.JMenuItem();
        MenuItemShowListUser = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuItemLogout = new javax.swing.JMenuItem();

        DialogStudentManager.setTitle("Thêm Sinh Viên");
        DialogStudentManager.setBackground(new java.awt.Color(204, 204, 255));
        DialogStudentManager.setBounds(new java.awt.Rectangle(100, 100, 580, 520));
        DialogStudentManager.setModal(true);

        DialogPanel.setBackground(new java.awt.Color(153, 153, 255));
        DialogPanel.setToolTipText("01");
        DialogPanel.setMinimumSize(new java.awt.Dimension(500, 500));
        DialogPanel.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản Lí Sinh Viên");

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtHoTen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Full Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNgaySinh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Date of Birth", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiaChi.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtKhoa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtKhoa.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtLop.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtLop.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtGPA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGPA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GPA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        btnAddSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddSV.setText("Add");
        btnAddSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSVActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHuy.setText("Cancel");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtGmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Gmail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogPanelLayout = new javax.swing.GroupLayout(DialogPanel);
        DialogPanel.setLayout(DialogPanelLayout);
        DialogPanelLayout.setHorizontalGroup(
            DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHoTen)
                    .addGroup(DialogPanelLayout.createSequentialGroup()
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi))
                    .addComponent(txtGPA)
                    .addGroup(DialogPanelLayout.createSequentialGroup()
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGmail, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addGroup(DialogPanelLayout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DialogPanelLayout.createSequentialGroup()
                        .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLop))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHuy)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddSV)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap())
        );
        DialogPanelLayout.setVerticalGroup(
            DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(DialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnAddSV)
                    .addComponent(btnUpdate))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        btnUpdate.setEnabled(false);

        javax.swing.GroupLayout DialogStudentManagerLayout = new javax.swing.GroupLayout(DialogStudentManager.getContentPane());
        DialogStudentManager.getContentPane().setLayout(DialogStudentManagerLayout);
        DialogStudentManagerLayout.setHorizontalGroup(
            DialogStudentManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogStudentManagerLayout.setVerticalGroup(
            DialogStudentManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuItemUpdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MenuItemUpdate.setText("Update");
        MenuItemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUpdateActionPerformed(evt);
            }
        });
        studentPopupMenu.add(MenuItemUpdate);

        MenuItemDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MenuItemDelete.setText("Delete");
        MenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemDeleteActionPerformed(evt);
            }
        });
        studentPopupMenu.add(MenuItemDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrameSinhVien");

        CardPanel.setLayout(new java.awt.CardLayout());

        txtTimKiem.setBackground(new java.awt.Color(204, 255, 204));
        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        ListSinhVienTable.setBackground(new java.awt.Color(204, 255, 204));
        ListSinhVienTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 51), new java.awt.Color(153, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(204, 204, 255)));
        ListSinhVienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ListSinhVienTable.setModel(new DefaultTableModel((Object[][]) data, columnNames));
        jScrollPane1.setViewportView(ListSinhVienTable);

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Student List");
        lbTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiem))
                .addContainerGap())
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        CardPanel.add(StudentPanel, "card2");

        lbTitleUser.setBackground(new java.awt.Color(153, 255, 255));
        lbTitleUser.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbTitleUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitleUser.setText("User List");

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        UserTable.setModel(new DefaultTableModel( (Object[][]) data, columnNamesUser));
        jScrollPane2.setViewportView(UserTable);

        txtUIDUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUIDUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUIDUser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        txtUserName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "User Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        txtPassUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassUser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Passworld", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        btnAddUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddUser.setText("Add");
        btnAddUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUserName)
                .addGap(18, 18, 18)
                .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddUser)
                .addContainerGap())
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addComponent(lbTitleUser, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addComponent(lbTitleUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassUser)
                        .addComponent(btnAddUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtUIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        CardPanel.add(UserPanel, "card3");
        UserPanel.setVisible(false);

        getContentPane().add(CardPanel, java.awt.BorderLayout.CENTER);

        StudentMenu.setText("Student");
        StudentMenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        MenuItemShowListStudent.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        MenuItemShowListStudent.setText("Show list student");
        MenuItemShowListStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemShowListStudentActionPerformed(evt);
            }
        });
        StudentMenu.add(MenuItemShowListStudent);

        AddStudentMenuItem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AddStudentMenuItem.setText("Add student");
        AddStudentMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentMenuItemActionPerformed(evt);
            }
        });
        StudentMenu.add(AddStudentMenuItem);

        SortMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SortMenu.setText("Sort student");
        SortMenu.setToolTipText("");
        SortMenu.setActionCommand("Sort");
        SortMenu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SortMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        SortbuttonGroup.add(rbtnMenuitemNone);
        rbtnMenuitemNone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbtnMenuitemNone.setSelected(true);
        rbtnMenuitemNone.setText("None");
        SortMenu.add(rbtnMenuitemNone);

        SortbuttonGroup.add(rbtnMenuItemSortGPA);
        rbtnMenuItemSortGPA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbtnMenuItemSortGPA.setText("Sort by GPA");
        rbtnMenuItemSortGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMenuItemSortGPAActionPerformed(evt);
            }
        });
        SortMenu.add(rbtnMenuItemSortGPA);

        SortbuttonGroup.add(rbtnMenuItemSortName);
        rbtnMenuItemSortName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbtnMenuItemSortName.setText("Sort by name");
        rbtnMenuItemSortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMenuItemSortNameActionPerformed(evt);
            }
        });
        SortMenu.add(rbtnMenuItemSortName);

        StudentMenu.add(SortMenu);

        jMenuBar1.add(StudentMenu);

        UserMenu.setText("User");
        UserMenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        MenuItemAddUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        MenuItemAddUser.setText("Add User");
        MenuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAddUserActionPerformed(evt);
            }
        });
        UserMenu.add(MenuItemAddUser);

        MenuItemShowListUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        MenuItemShowListUser.setText("Show List User");
        MenuItemShowListUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemShowListUserActionPerformed(evt);
            }
        });
        UserMenu.add(MenuItemShowListUser);

        jMenuBar1.add(UserMenu);

        jMenu1.setText("Setting");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        MenuItemLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MenuItemLogout.setText("Log out");
        MenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ShowDialog(){
        btnAddSV.setEnabled(true);
        btnUpdate.setEnabled(false);
        DialogStudentManager.setVisible(true);
    }
    
    public void HideDialog(){
        DialogStudentManager.setVisible(false);
    }
    
    private void btnAddSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSVActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void AddStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStudentMenuItemActionPerformed

    private void rbtnMenuItemSortGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMenuItemSortGPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMenuItemSortGPAActionPerformed

    private void rbtnMenuItemSortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMenuItemSortNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMenuItemSortNameActionPerformed

    private void MenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void MenuItemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemUpdateActionPerformed

    private void MenuItemShowListUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemShowListUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemShowListUserActionPerformed

    private void MenuItemShowListStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemShowListStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemShowListStudentActionPerformed

    private void MenuItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemAddUserActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void MenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemLogoutActionPerformed

    public void addMenuItemLogOutListener(ActionListener listener){
        MenuItemLogout.addActionListener(listener);
    }
    
    public void addbtnAddUserListener(ActionListener listener){
        btnAddUser.addActionListener(listener);
    }
    
    public void addMenuItemAddUserListener(ActionListener listener){
        MenuItemAddUser.addActionListener(listener);
    }
    
    public void addMenuItemShowListStudent(ActionListener listener){
        MenuItemShowListStudent.addActionListener(listener);
    }
    
    public void addMenuItemShowListUser(ActionListener listener){
        MenuItemShowListUser.addActionListener(listener);
    }
    
    public void addMenuItemUpdate(ActionListener listener){
        MenuItemUpdate.addActionListener(listener);
    }
    
    public void addbtnUpdate(ActionListener listener){
        btnUpdate.addActionListener(listener);
    }
    
    public boolean checkRbtnSortByName(){
        if(rbtnMenuItemSortName.isSelected()){
            return true;
        }else
            return false;
    }
    
    public boolean checkRbtnSortByGPA(){
        if(rbtnMenuItemSortGPA.isSelected()){
            return true;
        }else
            return false;
    }
    
    public void addMenuItemDelete(ActionListener listener){
        MenuItemDelete.addActionListener(listener);
    }
    
    public void addSortByName(ActionListener listener){
        rbtnMenuItemSortName.addActionListener(listener);
    }
    
    public void addSortByGPA(ActionListener listener){
        rbtnMenuItemSortGPA.addActionListener(listener);
    }
    
    public void addStudentMenuItemListener(ActionListener listener){
        AddStudentMenuItem.addActionListener(listener);
    }
    
    public String ThongTinTim(){
        return txtTimKiem.getText().trim();
    }
    
    public void addBtnHuyListener(ActionListener listener){
        btnHuy.addActionListener(listener);
    }
    
    public void addAddSinhVienDialogListener(ActionListener listener){
        btnAddSV.addActionListener(listener);
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public void ShowMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void ShowPanelUser(){
        UserPanel.setVisible(true);
        StudentPanel.setVisible(false);
    }
    
    public void ShowPanelStudent(){
        StudentPanel.setVisible(true);
        UserPanel.setVisible(false);
    }
    
    public void showListStudents(List<Student> list) {
        int size = list.size();
        Object [][] students = new Object[size][7];
        for (int i = 0; i < size; i++) {
            students[i][0] = list.get(i).getId();
            students[i][1] = list.get(i).getName();
            students[i][2] = list.get(i).getDateOfBirth();
            students[i][3] = list.get(i).getAddress();
            students[i][4] = list.get(i).getDepartment();
            students[i][5] = list.get(i).getclass();
            students[i][6] = list.get(i).getGPA();
        }
    ListSinhVienTable.setModel(new DefaultTableModel(students, columnNames));
    }
    
    public void showListUser(List<User> list) {
        int size = list.size();
        Object [][] users = new Object[size][3];
        for (int i = 0; i < size; i++) {
            users[i][0] = list.get(i).getIdUser();
            users[i][1] = list.get(i).getUserName();
            users[i][2] = list.get(i).getPassWorld();  
        }
        UserTable.setModel(new DefaultTableModel(users, columnNamesUser));
    }
    
    public boolean checkPhoneNumber(String str){
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        // Kiem tra dinh dang
        boolean kt = str.matches(reg);
        if (kt == false) {
            return  false ;
        } else {
            return  true ;
        }
    }
    
    public boolean checkEmail(String str){
        // Bieu thuc chinh quy mo ta dinh dang email
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        return Pattern.compile(regexPattern)
                .matcher(str)
                .matches();
        
    }
    
    private boolean ValidatePhoneNumber(){
        String phoneNumber = txtPhoneNumber.getText().toString().trim();
        if(phoneNumber == null || "".equals(phoneNumber.trim())){
            txtPhoneNumber.requestFocus();
            ShowMessage("Phone Number không được trống.");
            return false;
        }else if(!checkPhoneNumber(phoneNumber)){
            txtPhoneNumber.requestFocus();
            ShowMessage("Phone Number không đúng định dạng.");
            return false;
        }
        return true;
    }
    
    private boolean ValidateEmail(){
        String Email = txtGmail.getText().toString().trim();
        if(Email == null || "".equals(Email.trim())){
            txtGmail.requestFocus();
            ShowMessage("Email không được trống.");
            return false;
        }
        else if(!checkEmail(Email)){
            txtGmail.requestFocus();
            ShowMessage("Email không đúng định dạng.");
            return false;
        }
        return true;
    }
    
    private boolean validateName() {
        String name = txtHoTen.getText();
        if (name == null || "".equals(name.trim())) {
            txtHoTen.requestFocus();
            ShowMessage("Name không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validateBirthday() {
        String ngaySinh = txtNgaySinh.getText();
        if (ngaySinh == null || "".equals(ngaySinh.trim())) {
            txtNgaySinh.requestFocus();
            ShowMessage("Name không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateAddress() {
        String diaChi = txtDiaChi.getText();
        if (diaChi == null || "".equals(diaChi.trim())) {
            txtDiaChi.requestFocus();
            ShowMessage("Name không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validateDepartment() {
        String khoa = txtKhoa.getText();
        if (khoa == null || "".equals(khoa.trim())) {
            txtKhoa.requestFocus();
            ShowMessage("Name không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validateclass() {
        String lop = txtLop.getText();
        if (lop == null || "".equals(lop.trim())) {
            txtLop.requestFocus();
            ShowMessage("Name không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validateGPA(){
        try{
            double GPA = Double.parseDouble(txtGPA.getText().trim());
            if(GPA < 0 || GPA > 10){
                txtGPA.requestFocus();
                ShowMessage("GPA Không Hợp Lệ!");
                return false;
            }
        }catch(Exception e){
            txtGPA.requestFocus();
            ShowMessage("GPA Không Hợp Lệ!");
            return false;
        }
        return true;
    }
    
    private boolean validateUserName() {
        String useName = txtUserName.getText();
        if (useName == null || "".equals(useName.trim())) {
            txtUserName.requestFocus();
            ShowMessage("User Name không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validatePassWorld() {
        String passWorld = txtPassUser.getText();
        if (passWorld == null || "".equals(passWorld.trim())) {
            txtUserName.requestFocus();
            ShowMessage("Passworld không được trống.");
            return false;
        }
        return true;
    }
    
    public void getID(){
        student = new Student();
        txtID.setText(String.valueOf(student.getId()));
    }
    
    public void getIDUser(){
        user = new User();
        txtUIDUser.setText(String.valueOf(user.getIdUser()));
    }
    
    public User setUserInfor(){
        if(!validateUserName() || !validatePassWorld()){
            return null;
        }
        
        try {
            user.setUserName(txtUserName.getText().trim());
            user.setPassWorld(txtPassUser.getText().trim());
            return user;
        } catch (Exception e) {
            ShowMessage(e.getMessage());
        }
        
        return null;
    }

    public Student SetStudentInfo(){
        if(!validateName() || !validateBirthday()|| ! validateAddress()|| !validateclass()|| !validateDepartment()|| !validateGPA() || !ValidatePhoneNumber() || !ValidateEmail()){
            return null;
        }
        try {
            student.setName(txtHoTen.getText().trim());
            student.setDateOfBirth(txtNgaySinh.getText().trim());
            student.setAddress(txtDiaChi.getText().trim());
            student.setDepartment(txtKhoa.getText().trim());
            student.setClass(txtLop.getText().trim());
            student.setGPA(Double.parseDouble(txtGPA.getText().trim()));
            student.setPhoneNumber(txtPhoneNumber.getText().trim());
            student.setEmail(txtGmail.getText().trim());
            return student;
        } catch (Exception e) {
            ShowMessage(e.getMessage());
        }
        return null;
    }
    
    public void ClearText(){
        txtID.setText("");
        txtHoTen.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
        txtKhoa.setText("");
        txtLop.setText("");
        txtGPA.setText("");
        txtGmail.setText("");
        txtPhoneNumber.setText("");
    }
    
    public String getUID(){
        int row = ListSinhVienTable.getSelectedRow();
        return ListSinhVienTable.getModel().getValueAt(row, 0).toString();
    }
    
    public String getUIDUser(){
        int row = UserTable.getSelectedRow();
        return UserTable.getModel().getValueAt(row, 0).toString();
    }
    
    public void ShowDialogUpdate(Student s){
        txtID.setText(String.valueOf(s.getId()));
        txtHoTen.setText(s.getName());
        txtNgaySinh.setText(s.getDateOfBirth());
        txtDiaChi.setText(s.getAddress());
        txtKhoa.setText(s.getDepartment());
        txtLop.setText(s.getclass());
        txtGPA.setText(String.valueOf(s.getGPA()));
        txtGmail.setText(s.getEmail());
        txtPhoneNumber.setText(s.getPhoneNumber());
        btnAddSV.setEnabled(false);
        btnUpdate.setEnabled(true);
        DialogStudentManager.setVisible(true);
    }
    
    public void UpdateStudent(Student s){
        if(!validateName() || !validateBirthday()|| ! validateAddress()|| !validateclass()|| !validateDepartment()|| !validateGPA() || !ValidatePhoneNumber() || !ValidateEmail()){
            return ;
        }
        try {
            s.setName(txtHoTen.getText().trim());
            s.setDateOfBirth(txtNgaySinh.getText().trim());
            s.setAddress(txtDiaChi.getText().trim());
            s.setDepartment(txtKhoa.getText().trim());
            s.setClass(txtLop.getText().trim());
            s.setGPA(Double.parseDouble(txtGPA.getText().trim()));
            s.setPhoneNumber(txtPhoneNumber.getText().trim());
            s.setEmail(txtGmail.getText().trim());
        } catch (Exception e) {
            ShowMessage(e.getMessage());
        }
        
    }
    
    public void permissionStaff(){
        UserMenu.setEnabled(false);
        MenuItemDelete.setEnabled(false);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddStudentMenuItem;
    private javax.swing.JPanel CardPanel;
    private javax.swing.JPanel DialogPanel;
    private javax.swing.JDialog DialogStudentManager;
    private javax.swing.JTable ListSinhVienTable;
    private javax.swing.JMenuItem MenuItemAddUser;
    private javax.swing.JMenuItem MenuItemDelete;
    private javax.swing.JMenuItem MenuItemLogout;
    private javax.swing.JMenuItem MenuItemShowListStudent;
    private javax.swing.JMenuItem MenuItemShowListUser;
    private javax.swing.JMenuItem MenuItemUpdate;
    private javax.swing.JMenu SortMenu;
    private javax.swing.ButtonGroup SortbuttonGroup;
    private javax.swing.JMenu StudentMenu;
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JMenu UserMenu;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton btnAddSV;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitleUser;
    private javax.swing.JRadioButtonMenuItem rbtnMenuItemSortGPA;
    private javax.swing.JRadioButtonMenuItem rbtnMenuItemSortName;
    private javax.swing.JRadioButtonMenuItem rbtnMenuitemNone;
    private javax.swing.JPopupMenu studentPopupMenu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JLabel txtUIDUser;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

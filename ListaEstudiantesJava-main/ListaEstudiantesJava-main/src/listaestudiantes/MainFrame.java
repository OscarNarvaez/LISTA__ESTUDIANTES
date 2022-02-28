/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package listaestudiantes;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Julian Narvaez -- Carlos Alexander Burgos
 */
public class MainFrame extends javax.swing.JFrame {
    
    ListaEstudiantes listaEstudiantes;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        this.listaEstudiantes = new ListaEstudiantes();
        initComponents();
        this.updateTableListaEstudiantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGenero = new javax.swing.ButtonGroup();
        tfCodigo = new javax.swing.JTextField();
        tfEdad = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblRh = new javax.swing.JLabel();
        tfFaltas = new javax.swing.JTextField();
        lblFaltas = new javax.swing.JLabel();
        cbRh = new javax.swing.JComboBox<>();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnOtros = new javax.swing.JRadioButton();
        tfNombre = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEstudiantes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCodigo.setText("Codigo:");

        lblNombre.setText("Nombre:");

        lblEdad.setText("Edad:");

        lblGenero.setText("Genero:");

        lblRh.setText("RH:");

        lblFaltas.setText("Faltas:");

        cbRh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));

        btnGroupGenero.add(rbtnMasculino);
        rbtnMasculino.setSelected(true);
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.setActionCommand(Genero.Masculino.toString());

        btnGroupGenero.add(rbtnFemenino);
        rbtnFemenino.setText("Femenino");
        rbtnFemenino.setActionCommand(Genero.Femenino.toString());

        btnGroupGenero.add(rbtnOtros);
        rbtnOtros.setText("Otros");
        rbtnOtros.setActionCommand(Genero.Otros.toString());

        btnPrimero.setBackground(new java.awt.Color(204, 255, 255));
        btnPrimero.setText("Primero");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(204, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(204, 255, 255));
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(204, 255, 255));
        btnUltimo.setText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(204, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tblListaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Edad", "Genero", "RH", "Faltas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblListaEstudiantes.setEnabled(false);
        jScrollPane1.setViewportView(tblListaEstudiantes);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listaestudiantes/logofinal.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel1.setText("LISTA DE ESTUDIANTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNombre)
                            .addComponent(lblEdad)
                            .addComponent(lblGenero)
                            .addComponent(lblRh)
                            .addComponent(lblFaltas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOtros)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnMasculino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfFaltas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbRh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnFemenino, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo)
                            .addComponent(btnPrimero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiguiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdad)
                            .addComponent(btnAnterior))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(rbtnMasculino)
                            .addComponent(btnUltimo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnOtros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFaltas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEditar))))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setFormPanel(String codigo, String nombre, String edad, Genero genero, RH rh, String Faltas) {
        this.tfCodigo.setText(codigo);
        this.tfNombre.setText(nombre);
        this.tfEdad.setText(edad);

        switch (genero) {
            case Masculino:
                this.rbtnMasculino.setSelected(true);
                break;
            case Femenino:
                this.rbtnFemenino.setSelected(true);
                break;
            default:
                this.rbtnOtros.setSelected(true);
                break;
        }

        switch (rh) {
            case A:
                this.cbRh.setSelectedItem("A+");
                break;
            case O:
                this.cbRh.setSelectedItem("O+");
                break;
            case B:
                this.cbRh.setSelectedItem("B+");
                break;
            case AB:
                this.cbRh.setSelectedItem("AB+");
                break;
            case a:
                this.cbRh.setSelectedItem("A-");
                break;
            case o:
                this.cbRh.setSelectedItem("O-");
                break;
            case b:
                this.cbRh.setSelectedItem("B-");
                break;
            default:
                this.cbRh.setSelectedItem("AB-");
                break;
        }

        this.tfFaltas.setText(Faltas);
    }

    private void setFormPanel() {
        this.setFormPanel("", "", "", Genero.Masculino, RH.A, "");
    }

    private void setEstudiante(Estudiante estudiante) {
        if (Objects.isNull(estudiante)) {
            this.setFormPanel();
        }
        else
            this.setFormPanel(
                    estudiante.getCodigo(),
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    Genero.valueOf(estudiante.getGenero()),
                    RH.valueOf(estudiante.getRh()),
                    estudiante.getFaltas());
    }

    private Estudiante getEstudiante() {
        try {
            int codigo = Integer.parseInt(this.tfCodigo.getText());
            String nombre = this.tfNombre.getText();
            int edad = Integer.parseInt(this.tfEdad.getText());
            String genero = this.btnGroupGenero.getSelection().getActionCommand();
            String rh = String.valueOf(this.cbRh.getSelectedItem());

            RH Trh;
            switch (rh) {
                case "A+":
                    Trh = RH.A;
                    break;
                case "O+":
                    Trh = RH.O;
                    break;
                case "B+":
                    Trh = RH.B;
                    break;
                case "AB+":
                    Trh = RH.AB;
                    break;
                case "A-":
                    Trh = RH.a;
                    break;
                case "O-":
                    Trh = RH.o;
                    break;
                case "B-":
                    Trh = RH.b;
                    break;
                default:
                    Trh = RH.ab;
                    break;
            }

            int faltas = Integer.parseInt(this.tfFaltas.getText());
            return new Estudiante(codigo, nombre, edad, Genero.valueOf(genero), Trh, faltas);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Algunos campos de texto deben ser un numero valido");
            this.setFormPanel();
            return null;
        }
    }
    
    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        Estudiante estudiante = this.listaEstudiantes.getPrimerEstudiante();
        if(!Objects.isNull(estudiante)) this.setEstudiante(estudiante);
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        Estudiante estudiante = this.listaEstudiantes.getSiguienteEstudiante();
        if(!Objects.isNull(estudiante)) this.setEstudiante(estudiante);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        Estudiante estudiante = this.listaEstudiantes.getAnteriorEstudiante();
        if(!Objects.isNull(estudiante)) this.setEstudiante(estudiante);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        Estudiante estudiante = this.listaEstudiantes.getUltimoEstudiante();
        if(!Objects.isNull(estudiante)) this.setEstudiante(estudiante);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Estudiante estudiante = this.getEstudiante();
        if (estudiante == null)
            return;
        this.setEstudiante(this.listaEstudiantes.removeEsudiante(estudiante));
        this.updateTableListaEstudiantes();
        JOptionPane.showMessageDialog(this, "El estudiante se elimino correctamente");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Estudiante estudiante = this.getEstudiante();
        if (estudiante == null)
            return;
        this.setEstudiante(this.listaEstudiantes.addEstudiante(estudiante));
        this.updateTableListaEstudiantes();
        JOptionPane.showMessageDialog(this, "El estudiante se agrego correctamente");
        
        this.setFormPanel();
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Estudiante estudiante = this.getEstudiante();
        if (estudiante == null)
            return;
        this.setEstudiante(this.listaEstudiantes.updateEstudiante(estudiante));
        this.updateTableListaEstudiantes();
        JOptionPane.showMessageDialog(this, "El estudiante se edito correctamente");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void updateTableListaEstudiantes() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.tblListaEstudiantes.getModel();
        ArrayList<Estudiante> estudiantes = this.listaEstudiantes.getEstudiantes();
        defaultTableModel.setRowCount(0);
        for (Estudiante estudiante : estudiantes) {
            Object[] row = new Object[]{estudiante.getCodigo(), estudiante.getNombre(), estudiante.getEdad(), estudiante.getGenero(), estudiante.getRhFormat(), estudiante.getFaltas()};
            defaultTableModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupGenero;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cbRh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFaltas;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRh;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JRadioButton rbtnOtros;
    private javax.swing.JTable tblListaEstudiantes;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfFaltas;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}

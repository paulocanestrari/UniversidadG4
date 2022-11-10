/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Universidad.data.Alumnodata;
import Universidad.data.Inscripciondata;
import Universidad.data.Materiadata;
import UniversidadG4.entidades.Alumno;
import UniversidadG4.entidades.Inscripcion;
import UniversidadG4.entidades.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioInscripcion extends javax.swing.JInternalFrame {
Materiadata mateD;
Alumnodata alum;
    Inscripciondata insd;
  
    public FormularioInscripcion() {
        initComponents();
        alum=new Alumnodata();
        mateD= new Materiadata();
        insd= new Inscripciondata();
       
        llenarcomboBox();
        borrarfilasTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btInscriptas = new javax.swing.JRadioButton();
        btNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btInscribir = new javax.swing.JButton();
        btAnularInscripcion = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario de inscripcion");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Alumno");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("LISTADO DE MATERIAS");

        btInscriptas.setBackground(new java.awt.Color(102, 102, 102));
        btInscriptas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInscriptas.setText("Inscriptas");
        btInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscriptasActionPerformed(evt);
            }
        });

        btNoInscriptas.setBackground(new java.awt.Color(102, 102, 102));
        btNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNoInscriptas.setText("No inscriptas");
        btNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoInscriptasActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "AÑO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btInscribir.setText("Inscribir");
<<<<<<< HEAD
=======
        btInscribir.setEnabled(false);
>>>>>>> a87f948879f97b9561bdc048dbe56d133fe4903c
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });

        btAnularInscripcion.setText("Anular inscripción");
        btAnularInscripcion.setEnabled(false);
        btAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularInscripcionActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNoInscriptas)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btInscribir)
                        .addGap(76, 76, 76)
                        .addComponent(btAnularInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(44, 44, 44)
                                        .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInscriptas)
                    .addComponent(btNoInscriptas))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInscribir)
                    .addComponent(btAnularInscripcion)
                    .addComponent(btSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInscribirActionPerformed

=======
    private void btInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscriptasActionPerformed
    btNoInscriptas.setSelected(false);
      btInscribir.setSelected(false);
      btAnularInscripcion.setSelected(true);
      cargarMateriasinscriptas();
    }//GEN-LAST:event_btInscriptasActionPerformed

    private void btNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoInscriptasActionPerformed
       btInscriptas.setSelected(false);
        btInscribir.setSelected(true);
      btAnularInscripcion.setSelected(false);
      cargarMateriasnoinscriptas();
    }//GEN-LAST:event_btNoInscriptasActionPerformed

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
       Alumno alu= (Alumno)cbAlumnos.getSelectedItem();
       int fila= tabla.getSelectedRow();
       if (alu!=null && fila!=-1){
       int id= (Integer)tabla.getValueAt(fila, 0);
       String nombre=(String) tabla.getValueAt(fila, 1);
       int ano= (Integer)tabla.getValueAt(fila, 2);
       Materia ma= new Materia(id,nombre,ano, true);
       Inscripcion in= new Inscripcion(alu,ma,0);
       insd.guardarInscripcion(in);
       borrarfilasTablas();
       }else{ JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno y una materia" );}
           
           
    }//GEN-LAST:event_btInscribirActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularInscripcionActionPerformed
          Alumno alu= (Alumno)cbAlumnos.getSelectedItem();
       int fila= tabla.getSelectedRow();
       if (alu!=null && fila!=-1){
       int idm= (Integer)tabla.getValueAt(fila, 0);
       int ida= (Integer)alu.getId_alumno();
      
       insd.borrarInscripcion(ida, idm);
       
       borrarfilasTablas();
       }else{ JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno y una materia" );}
           
    }//GEN-LAST:event_btAnularInscripcionActionPerformed

>>>>>>> a87f948879f97b9561bdc048dbe56d133fe4903c

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnularInscripcion;
    private javax.swing.JButton btInscribir;
    private javax.swing.JRadioButton btInscriptas;
    private javax.swing.JRadioButton btNoInscriptas;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void llenarcomboBox() {
     
        for (Alumno aux : alum.obtenerAlumnos()) {
            cbAlumnos.addItem(aux);
        }
    }

    private void borrarfilasTablas() {
        tabla.removeAll();
    }

    private void cargarMateriasinscriptas() {
        
      borrarfilasTablas();
      Alumno elegido= (Alumno) cbAlumnos.getSelectedItem();
        
        
      if (elegido !=null){
      ArrayList <Materia> materias= insd.obtenermateriasInscriptas(elegido);
       String datos[] = new String[3];
        DefaultTableModel tablal = (DefaultTableModel) tabla.getModel();
        tablal.setNumRows(0);
        for (Materia i : materias ) {
            datos[0] = i.getId_materia()+ "";
            datos[1] = i.getNombre();
            datos[2] = String.valueOf(i.getAnio());
            
            tablal.addRow(datos);}
        }else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno!" );
                }
    }

    private void cargarMateriasnoinscriptas() {
      borrarfilasTablas();
       DefaultTableModel tablal = (DefaultTableModel) tabla.getModel();
      Alumno elegido= (Alumno) cbAlumnos.getSelectedItem();
     
      if (elegido!=null){
          System.out.println(elegido);
      ArrayList <Materia> materias= insd.obtenermateriasNOInscriptas(elegido);
        for (Materia ma : materias) {
           tablal.addRow(new Object[]{ma.getId_materia(),ma.getNombre(),ma.getAnio()}); 
        }
        }else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno!" );
                }
    }
    }


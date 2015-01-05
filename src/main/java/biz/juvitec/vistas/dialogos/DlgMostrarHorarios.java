/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.juvitec.vistas.dialogos;

import algoritmo.AnalisisAsistencia;
import biz.juvitec.entidades.Empleado;
import biz.juvitec.entidades.Horario;
import biz.juvitec.vistas.modelos.MTHorario;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author fesquivelc
 */
public class DlgMostrarHorarios extends javax.swing.JDialog {

    /**
     * Creates new form DlgJornada
     */
    private final Empleado empleado;
    public DlgMostrarHorarios(JInternalFrame parent, Empleado empleado) {
        super(JOptionPane.getFrameForComponent(parent), true);
        this.empleado = empleado;
        initComponents();
        this.setLocationRelativeTo(parent);
        analisisAsistencia = new AnalisisAsistencia();
        bindeoSalvaje();
        accion = 0;
        this.setTitle("HORARIOS DEL EMPLEADO: "
                +empleado.getNroDocumento()+" - "
                +empleado.getNombre()+" "+empleado.getApellidoPaterno()+" "+empleado.getApellidoMaterno());
//        this.controles(accion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlListado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJornadas = new org.jdesktop.swingx.JXTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HORARIOS PARA ");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlListado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlListado.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pnlListado.add(jPanel4, gridBagConstraints);

        tblJornadas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblJornadas.setHorizontalScrollEnabled(true);
        tblJornadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblJornadasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblJornadas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlListado.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 406;
        gridBagConstraints.ipady = 401;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(pnlListado, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblJornadasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJornadasMouseReleased
        // TODO add your handling code here:
        int fila = tblJornadas.getSelectedRow();
        Horario seleccionada = horarioList.get(fila);
        if(evt.getClickCount() == 1){
//            mostrar(seleccionada);
        }else if(evt.getClickCount() == 2){
            jornadaSeleccionada = seleccionada;
            this.dispose();
        }
        
    }//GEN-LAST:event_tblJornadasMouseReleased

    public Horario getJornadaSeleccionada() {
        this.setVisible(true);
        return jornadaSeleccionada;
    }

    
    private int accion;
    private final AnalisisAsistencia analisisAsistencia;
    private List<Horario> horarioList;
    private Horario jornadaSeleccionada;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlListado;
    private org.jdesktop.swingx.JXTable tblJornadas;
    // End of variables declaration//GEN-END:variables
//
//    private void modeloHoraSpinner(JSpinner spinner) {
//        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "HH:mm");
//        DateFormatter formatter = (DateFormatter) editor.getTextField().getFormatter();
//        formatter.setAllowsInvalid(false); // this makes what you want
//        formatter.setOverwriteMode(true);
//        spinner.setEditor(editor);
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.HOUR, 7);
//        cal.set(Calendar.MINUTE, 30);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.AM_PM, Calendar.AM);
//        spinner.setValue(cal.getTime());
//    }
//
//    private void modeloFechaSpinner(JSpinner spinner) {
//        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
//        DateFormatter formatter = (DateFormatter) editor.getTextField().getFormatter();
//        formatter.setAllowsInvalid(false); // this makes what you want
//        formatter.setOverwriteMode(true);
//        spinner.setEditor(editor);
//    }

//    private void controles(int accion) {
//        boolean bandera = accion == Controlador.NUEVO || accion == Controlador.MODIFICAR;
//
//        FormularioUtil.activarComponente(this.pnlListado, !bandera);
//        FormularioUtil.activarComponente(this.pnlDatosJornada, bandera);
//
//        if (accion != Controlador.MODIFICAR) {
//            FormularioUtil.limpiarComponente(this.pnlDatosJornada);
//        }
//
//    }

    private void bindeoSalvaje() {
        horarioList = analisisAsistencia.obtenerHorarios(empleado);
        horarioList = ObservableCollections.observableList(horarioList);

//        String[] columnas = {"Nombre", "HE", "HSR", "HER", "HS"};

        String[] columnas = {"Horario", "Jornada", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        MTHorario mt = new MTHorario(horarioList, columnas);
        tblJornadas.setModel(mt);
        this.tblJornadas.packAll();
    }

//    private void mostrar(Jornada seleccionado) {
//        txtCodigo.setText(seleccionado.getCodigo());
//        txtNombre.setText(seleccionado.getNombre());
//        spDesdeHE.setValue(seleccionado.getDesdeHE());
//        spRefrigerioHS.setValue(seleccionado.getRefrigerioHS());
//        spRefrigerioHE.setValue(seleccionado.getRefrigerioHE());
//        spTardanzaHE.setValue(seleccionado.getTardanzaHE());
//        spToleranciaRefrigerioHE.setValue(seleccionado.getToleranciaRefrigerioHE());
//        spToleranciaHE.setValue(seleccionado.getToleranciaHE());
//        spTurnoHE.setValue(seleccionado.getTurnoHE());
//        spTurnoHS.setValue(seleccionado.getTurnoHS());
//    }

//    private void actualizarTabla() {
//        horarioList.clear();
//        horarioList.addAll(analisisAsistencia.buscarTodos());
//    }
}

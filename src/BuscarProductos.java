import java.util.ArrayList;
import java.util.List;

public class BuscarProductos extends javax.swing.JPanel {
     

    /**
     * Creates new form pagina3
     */
    public BuscarProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarp = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        productobuscado = new javax.swing.JLabel();

        p3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar Producto");

        buscarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        productobuscado.setForeground(new java.awt.Color(0, 0, 0));
        productobuscado.setText("\"\"");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel1))
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(buscarp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(buscar)))
                        .addGap(0, 253, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(productobuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscarp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(70, 70, 70)
                .addComponent(productobuscado)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        try {
            //Obtener el valor del campo del id
        int idBuscado = Integer.parseInt(buscarp.getText()); // Obtener el ID ingresado
        //Variable creada para retornar si existe o no existe el producto "True o false"
        boolean encontrado = false;
        for (Productos p : IngresarProductos.productos) { // Accedemos a la lista desde IngresarProductos
            if (p.getId() == idBuscado) {
                // Mostrar la información del producto encontrado
                productobuscado.setText("ID: " + p.getId() + " | Nombre: " + p.getNombre() +
                        " | Valor Compra: " + p.getValorCompra() + " | Cantidad: " + p.getCantidad() +
                        " | Valor Venta: " + p.getGanancia());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            productobuscado.setText("Producto con ID " + idBuscado + " no encontrado.");
        }
    } catch (NumberFormatException e) {
        productobuscado.setText("Por favor, ingrese un número válido para el ID.");
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarpActionPerformed

    


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField buscarp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel productobuscado;
    // End of variables declaration//GEN-END:variables
}

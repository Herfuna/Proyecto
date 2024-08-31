package gt.edu.umg.proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {

    List<Alumnos> lista = new ArrayList<Alumnos>();

    public Pantalla() {
        initComponents();
        Leer_archivo(lista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCuartoBimestre = new javax.swing.JTextField();
        txtTercerBimestre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSegundoBimestre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPrimerBimestre = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notas");
        setBackground(new java.awt.Color(204, 255, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 28, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Primero Primaria");

        btnLimpiar.setBackground(new java.awt.Color(44, 120, 115));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(44, 120, 115));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 68, 69));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido:");

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID");

        txtID.setBackground(new java.awt.Color(94, 137, 114));
        txtID.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(94, 137, 114));
        txtNombre.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        txtApellido.setBackground(new java.awt.Color(94, 137, 114));
        txtApellido.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Promedio:");

        txtPromedio.setBackground(new java.awt.Color(94, 137, 114));
        txtPromedio.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cuarto Bimestre");

        txtCuartoBimestre.setBackground(new java.awt.Color(94, 137, 114));
        txtCuartoBimestre.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtCuartoBimestre.setForeground(new java.awt.Color(255, 255, 255));

        txtTercerBimestre.setBackground(new java.awt.Color(94, 137, 114));
        txtTercerBimestre.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtTercerBimestre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tercer Bimestre");

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Segundo Bimestre");

        txtSegundoBimestre.setBackground(new java.awt.Color(94, 137, 114));
        txtSegundoBimestre.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtSegundoBimestre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Primer Bimestre");

        txtPrimerBimestre.setBackground(new java.awt.Color(94, 137, 114));
        txtPrimerBimestre.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtPrimerBimestre.setForeground(new java.awt.Color(255, 255, 255));

        txtestado.setEditable(false);
        txtestado.setBackground(new java.awt.Color(94, 137, 114));
        txtestado.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtestado.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtestado, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtID)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addGap(166, 166, 166)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrimerBimestre)
                    .addComponent(txtSegundoBimestre)
                    .addComponent(txtTercerBimestre)
                    .addComponent(txtCuartoBimestre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtPrimerBimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtSegundoBimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTercerBimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCuartoBimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnSiguiente.setBackground(new java.awt.Color(44, 120, 115));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText(">>");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(44, 120, 115));
        btnAnterior.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indice");

        txtIndice.setEditable(false);
        txtIndice.setBackground(new java.awt.Color(91, 149, 116));
        txtIndice.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(255, 255, 255));
        txtIndice.setText("0");
        txtIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndiceActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(44, 120, 115));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular Promedio");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(347, 347, 347))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(60, 60, 60)
                                .addComponent(btnSiguiente)))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior)
                    .addComponent(btnCalcular))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param indice, parametro que toma de referencia para guarda, leer y
     * mostrar dependiendo en que numero se encuentra
     */
    private void mostrarAlumno(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            Alumnos alumno = lista.get(indice);
            txtID.setText(String.valueOf(alumno.getId()));
            txtNombre.setText(alumno.getNombre());
            txtApellido.setText(alumno.getApellido());
            txtPrimerBimestre.setText(String.valueOf(alumno.getPrimerBimestre()));
            txtSegundoBimestre.setText(String.valueOf(alumno.getSegundoBimestre()));
            txtTercerBimestre.setText(String.valueOf(alumno.getTercerBimestre()));
            txtCuartoBimestre.setText(String.valueOf(alumno.getCuartoBimestre()));
            txtPromedio.setText(String.valueOf(alumno.getPromedio()));
            txtIndice.setText(String.valueOf(indice));
        }
    }

    /**
     * @param lista, recibe la lista donde la recorre obteniendo los datos de la
     * clase Alumnos
     *
     */
    private static void guardar_archivo(List<Alumnos> lista) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("D:\\AlumnoNotas.txt"));
            for (Alumnos nt : lista) {
                escritor.write(String.valueOf(nt.getId()) + "\t" + nt.getNombre() + "\t" + nt.getApellido() + "\t" + String.valueOf(nt.getPrimerBimestre() + "\t" + String.valueOf(nt.getSegundoBimestre() + "\t" + String.valueOf(nt.getTercerBimestre() + "\t" + String.valueOf(nt.getCuartoBimestre() + "\t" + String.valueOf(nt.getPromedio()))))));
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    /**
     * @param bloques, Guarda los datos por bloques gracias al split, que estos
     * se convierten a sus respectivos tipos de datos y se guarda en la clase
     * Alumnos
     * @param linea, recorre el archivo linea por linea hasta que ya no hay
     * datos
     * @param lista, guarda los datos ya obtenidos de la clase Alumnos
     */
    private static void Leer_archivo(List<Alumnos> lista) {

        try {
            BufferedReader lector = new BufferedReader(new FileReader("D:\\AlumnoNotas.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split("\t");
                Alumnos alumno = new Alumnos();
                int id = Integer.parseInt(bloques[0]);
                String nombre = bloques[1];
                String apellido = bloques[2];
                Double primerbi = Double.valueOf(bloques[3]);
                Double segundobi = Double.valueOf(bloques[4]);
                Double tercerbi = Double.valueOf(bloques[5]);
                Double cuartobi = Double.valueOf(bloques[6]);
                Double promedio = Double.valueOf(bloques[7]);

                alumno.setId(id);
                alumno.setNombre(nombre);
                alumno.setApellido(apellido);
                alumno.setPrimerBimestre(primerbi);
                alumno.setSegundoBimestre(segundobi);
                alumno.setTercerBimestre(tercerbi);
                alumno.setCuartoBimestre(cuartobi);
                alumno.setPromedio(promedio);

                lista.add(alumno);

            }
            lector.close();
        } catch (IOException e) {

        }
    }


    private void txtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndiceActionPerformed
    /**
     *@param indice, parametro que marca cuando mostrar, borrar o mostrar los datos
     * 
     */
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        String indice = txtIndice.getText();
        int indi = Integer.parseInt(indice);

        indi++;
        mostrarAlumno(indi + 1);

        indice = String.valueOf(indi);
        txtIndice.setText(indice);
        if (indi < lista.size()) {
            txtID.setText(String.valueOf(lista.get(indi).getId()));
            txtNombre.setText(lista.get(indi).getNombre());
            txtApellido.setText(lista.get(indi).getApellido());
            txtPrimerBimestre.setText(String.valueOf(lista.get(indi).getPrimerBimestre()));
            txtSegundoBimestre.setText(String.valueOf(lista.get(indi).getSegundoBimestre()));
            txtTercerBimestre.setText(String.valueOf(lista.get(indi).getTercerBimestre()));
            txtCuartoBimestre.setText(String.valueOf(lista.get(indi).getCuartoBimestre()));
            txtPromedio.setText(String.valueOf(lista.get(indi).getPromedio()));
        } else {
            txtID.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtPrimerBimestre.setText("");
            txtSegundoBimestre.setText("");
            txtTercerBimestre.setText("");
            txtCuartoBimestre.setText("");
            txtPromedio.setText("");
            txtestado.setText("");
        }


    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed

        String indice = txtIndice.getText();
        int indi = Integer.parseInt(indice);
        if (indi > 0) {
            indi--;
            mostrarAlumno(indi - 1);
            indice = String.valueOf(indi);
            txtIndice.setText(indice);
            txtID.setText(String.valueOf(lista.get(indi).getId()));
            txtNombre.setText(lista.get(indi).getNombre());
            txtApellido.setText(lista.get(indi).getApellido());
            txtPrimerBimestre.setText(String.valueOf(lista.get(indi).getPrimerBimestre()));
            txtSegundoBimestre.setText(String.valueOf(lista.get(indi).getSegundoBimestre()));
            txtTercerBimestre.setText(String.valueOf(lista.get(indi).getTercerBimestre()));
            txtCuartoBimestre.setText(String.valueOf(lista.get(indi).getCuartoBimestre()));
            txtPromedio.setText(String.valueOf(lista.get(indi).getPromedio()));

        }


    }//GEN-LAST:event_btnAnteriorActionPerformed
    /**
     * @param alum, de la clase Alumnos se asigan los valores recogidos de los 
     * txtfield que a su vez se guarda en la lista
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Alumnos alum = new Alumnos();
        alum.setId(Integer.parseInt(txtID.getText()));
        alum.setNombre(txtNombre.getText());
        alum.setApellido(txtApellido.getText());
        alum.setPrimerBimestre(Double.parseDouble(txtPrimerBimestre.getText()));
        alum.setSegundoBimestre(Double.parseDouble(txtSegundoBimestre.getText()));
        alum.setTercerBimestre(Double.parseDouble(txtTercerBimestre.getText()));
        alum.setCuartoBimestre(Double.parseDouble(txtCuartoBimestre.getText()));
        alum.setPromedio(Double.parseDouble(txtPromedio.getText()));

        double promedio = (alum.getPrimerBimestre() + alum.getSegundoBimestre() + alum.getTercerBimestre() + alum.getCuartoBimestre()) / 4;
        alum.setPromedio(promedio);
        lista.add(alum);
        guardar_archivo(lista);
        JOptionPane.showMessageDialog(null, "Alumno Guardado");


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtPrimerBimestre.setText("");
        txtSegundoBimestre.setText("");
        txtTercerBimestre.setText("");
        txtCuartoBimestre.setText("");
        txtPromedio.setText("");
        txtestado.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        Double nota1 = Double.valueOf((txtPrimerBimestre.getText()));
        Double nota2 = Double.valueOf((txtSegundoBimestre.getText()));
        Double nota3 = Double.valueOf((txtTercerBimestre.getText()));
        Double nota4 = Double.valueOf((txtCuartoBimestre.getText()));

        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        txtPromedio.setText(String.valueOf(promedio));
        if (promedio >= 0 && promedio <= 60) {
            txtestado.setText(String.valueOf("Desaprobado"));
        } else {
            txtestado.setText(String.valueOf("Aprobado"));

        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCuartoBimestre;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerBimestre;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtSegundoBimestre;
    private javax.swing.JTextField txtTercerBimestre;
    private javax.swing.JTextField txtestado;
    // End of variables declaration//GEN-END:variables
}

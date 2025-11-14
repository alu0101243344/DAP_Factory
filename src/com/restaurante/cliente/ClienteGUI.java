package com.restaurante.cliente;

import com.restaurante.fabricas.FactoriaMenuEspanol;
import com.restaurante.fabricas.FactoriaMenuJapones;
import com.restaurante.fabricas.FactoriaMenuMexicano;
import com.restaurante.fabricas.IFactoriaMenu;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ClienteGUI extends JFrame {

    private final JLabel etiquetaPollo;
    private final JLabel etiquetaPescado;
    private final JLabel etiquetaBebida;
    private final JLabel etiquetaPostre;
    private final JLabel descPollo;
    private final JLabel descPescado;
    private final JLabel descBebida;
    private final JLabel descPostre;

    public ClienteGUI() {
        setTitle("Restaurante Internacional con Abstract Factory");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));


        JPanel panelSeleccion = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelSeleccion.add(new JLabel("Elige el menú que deseas ver:"));

        String[] opcionesMenu = {"Japonés", "Mexicano", "Español"};
        JComboBox<String> comboBoxMenus = new JComboBox<>(opcionesMenu);
        panelSeleccion.add(comboBoxMenus);
        add(panelSeleccion, BorderLayout.NORTH);


        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new GridLayout(4, 2, 10, 15));
        panelDetalles.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Platos del Menú Seleccionado", TitledBorder.CENTER, TitledBorder.TOP));

        etiquetaPollo = new JLabel();
        etiquetaPollo.setFont(new Font("Arial", Font.BOLD, 14));
        descPollo = new JLabel();
        panelDetalles.add(etiquetaPollo);
        panelDetalles.add(descPollo);

        etiquetaPescado = new JLabel();
        etiquetaPescado.setFont(new Font("Arial", Font.BOLD, 14));
        descPescado = new JLabel();
        panelDetalles.add(etiquetaPescado);
        panelDetalles.add(descPescado);

        etiquetaBebida = new JLabel();
        etiquetaBebida.setFont(new Font("Arial", Font.BOLD, 14));
        descBebida = new JLabel();
        panelDetalles.add(etiquetaBebida);
        panelDetalles.add(descBebida);

        etiquetaPostre = new JLabel();
        etiquetaPostre.setFont(new Font("Arial", Font.BOLD, 14));
        descPostre = new JLabel();
        panelDetalles.add(etiquetaPostre);
        panelDetalles.add(descPostre);
        add(panelDetalles, BorderLayout.CENTER);


        comboBoxMenus.addActionListener(e -> {
            String seleccion = (String) comboBoxMenus.getSelectedItem();
            IFactoriaMenu factoriaSeleccionada = null;

            if (seleccion != null) {
                switch (seleccion) {
                    case "Japonés":
                        factoriaSeleccionada = new FactoriaMenuJapones();
                        break;
                    case "Mexicano":
                        factoriaSeleccionada = new FactoriaMenuMexicano();
                        break;
                    case "Español":
                        factoriaSeleccionada = new FactoriaMenuEspanol();
                        break;
                }
            }

            if (factoriaSeleccionada != null) {
                mostrarMenu(factoriaSeleccionada);
            }
        });


        mostrarMenu(new FactoriaMenuJapones());
    }

    private void mostrarMenu(IFactoriaMenu factoria) {
        Menu menu = new Menu(factoria);
        etiquetaPollo.setText(menu.getPollo().obtenerNombre());
        descPollo.setText("<html><p>" + menu.getPollo().obtenerDescripcion() + "</p></html>");

        etiquetaPescado.setText(menu.getPescado().obtenerNombre());
        descPescado.setText("<html><p>" + menu.getPescado().obtenerDescripcion() + "</p></html>");

        etiquetaBebida.setText(menu.getBebida().obtenerNombre());
        descBebida.setText("<html><p>" + menu.getBebida().obtenerDescripcion() + "</p></html>");

        etiquetaPostre.setText(menu.getPostre().obtenerNombre());
        descPostre.setText("<html><p>" + menu.getPostre().obtenerDescripcion() + "</p></html>");
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> new ClienteGUI().setVisible(true));
    }
}

package com.restaurante.cliente;

import com.restaurante.fabricas.FactoriaMenuEspanol;
import com.restaurante.fabricas.FactoriaMenuJapones;
import com.restaurante.fabricas.FactoriaMenuMexicano;
import com.restaurante.fabricas.IFactoriaMenu;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ClienteGUI extends JFrame {

    private final JLabel etiquetaNombrePollo, etiquetaNombrePescado, etiquetaNombreBebida, etiquetaNombrePostre;
    private final JLabel etiquetaDescPollo, etiquetaDescPescado, etiquetaDescBebida, etiquetaDescPostre;
    private final JLabel etiquetaImgPollo, etiquetaImgPescado, etiquetaImgBebida, etiquetaImgPostre;

    public ClienteGUI() {
        setTitle("Restaurante Internacional con Abstract Factory");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panelSeleccion = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelSeleccion.add(new JLabel("Elige el menú que deseas ver:"));
        String[] opcionesMenu = {"Japonés", "Mexicano", "Español"};
        JComboBox<String> comboBoxMenus = new JComboBox<>(opcionesMenu);
        panelSeleccion.add(comboBoxMenus);
        add(panelSeleccion, BorderLayout.NORTH);

        JPanel panelDetalles = new JPanel(new GridLayout(4, 1, 10, 10));
        panelDetalles.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Platos del Menú Seleccionado", TitledBorder.CENTER, TitledBorder.TOP));

        etiquetaImgPollo = new JLabel();
        etiquetaNombrePollo = new JLabel();
        etiquetaDescPollo = new JLabel();
        panelDetalles.add(crearPanelPlato(etiquetaImgPollo, etiquetaNombrePollo, etiquetaDescPollo));

        etiquetaImgPescado = new JLabel();
        etiquetaNombrePescado = new JLabel();
        etiquetaDescPescado = new JLabel();
        panelDetalles.add(crearPanelPlato(etiquetaImgPescado, etiquetaNombrePescado, etiquetaDescPescado));

        etiquetaImgBebida = new JLabel();
        etiquetaNombreBebida = new JLabel();
        etiquetaDescBebida = new JLabel();
        panelDetalles.add(crearPanelPlato(etiquetaImgBebida, etiquetaNombreBebida, etiquetaDescBebida));

        etiquetaImgPostre = new JLabel();
        etiquetaNombrePostre = new JLabel();
        etiquetaDescPostre = new JLabel();
        panelDetalles.add(crearPanelPlato(etiquetaImgPostre, etiquetaNombrePostre, etiquetaDescPostre));

        add(new JScrollPane(panelDetalles), BorderLayout.CENTER);

        comboBoxMenus.addActionListener(e -> {
            String seleccion = (String) comboBoxMenus.getSelectedItem();
            IFactoriaMenu factoria = null;
            if (seleccion != null) {
                switch (seleccion) {
                    case "Japonés":
                        factoria = new FactoriaMenuJapones();
                        break;
                    case "Mexicano":
                        factoria = new FactoriaMenuMexicano();
                        break;
                    case "Español":
                        factoria = new FactoriaMenuEspanol();
                        break;
                }
            }
            if (factoria != null) {
                mostrarMenu(factoria);
            }
        });

        mostrarMenu(new FactoriaMenuJapones());
    }

    private JPanel crearPanelPlato(JLabel imgLabel, JLabel nombreLabel, JLabel descLabel) {
        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        imgLabel.setPreferredSize(new Dimension(100, 100));
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(imgLabel, BorderLayout.WEST);

        JPanel panelTexto = new JPanel(new GridLayout(2, 1));
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panelTexto.add(nombreLabel);
        panelTexto.add(descLabel);
        panel.add(panelTexto, BorderLayout.CENTER);
        return panel;
    }

    private void mostrarMenu(IFactoriaMenu factoria) {
        Menu menu = new Menu(factoria);

        etiquetaNombrePollo.setText(menu.getPollo().obtenerNombre());
        etiquetaDescPollo.setText("<html><p>" + menu.getPollo().obtenerDescripcion() + "</p></html>");
        etiquetaImgPollo.setIcon(cargarImagen(menu.getPollo().obtenerRutaImagen(), 100, 100));

        etiquetaNombrePescado.setText(menu.getPescado().obtenerNombre());
        etiquetaDescPescado.setText("<html><p>" + menu.getPescado().obtenerDescripcion() + "</p></html>");
        etiquetaImgPescado.setIcon(cargarImagen(menu.getPescado().obtenerRutaImagen(), 100, 100));

        etiquetaNombreBebida.setText(menu.getBebida().obtenerNombre());
        etiquetaDescBebida.setText("<html><p>" + menu.getBebida().obtenerDescripcion() + "</p></html>");
        etiquetaImgBebida.setIcon(cargarImagen(menu.getBebida().obtenerRutaImagen(), 100, 100));

        etiquetaNombrePostre.setText(menu.getPostre().obtenerNombre());
        etiquetaDescPostre.setText("<html><p>" + menu.getPostre().obtenerDescripcion() + "</p></html>");
        etiquetaImgPostre.setIcon(cargarImagen(menu.getPostre().obtenerRutaImagen(), 100, 100));
    }

    private ImageIcon cargarImagen(String ruta, int ancho, int alto) {
        try {
            ImageIcon iconoOriginal = new ImageIcon(getClass().getResource(ruta));
            Image imagen = iconoOriginal.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            return new ImageIcon(imagenRedimensionada);
        } catch (Exception e) {
            System.err.println("No se pudo cargar la imagen: " + ruta);
            return new ImageIcon();
        }
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
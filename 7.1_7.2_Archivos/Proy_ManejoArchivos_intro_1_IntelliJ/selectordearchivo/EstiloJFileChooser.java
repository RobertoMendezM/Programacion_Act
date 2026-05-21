/**
 * Programa que despliega una pantalla estilizada para buscar
 * y seleccionar un archivo
 *
 * Curso de Programación
 *
 * @author DeepSeek
 * Editor: Roberto Méndez Méndez
 * Creación:  19 May 2026
 */
package selectordearchivo;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.File;

public class EstiloJFileChooser {

    public static void main(String[] args) {
        // Establecer Look and Feel con estilo moderno
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            // Personalizar colores
            UIManager.put("Panel.background", new Color(240, 248, 255));
            UIManager.put("Button.background", new Color(70, 130, 200));
            UIManager.put("Button.foreground", Color.WHITE);
            UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 12));

        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            crearVentanaPrincipal();
        });
    }

    private static void crearVentanaPrincipal() {
        JFrame frame = new JFrame("Explorador de Archivos Estilizado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // Panel principal con gradiente
        JPanel mainPanel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gp = new GradientPaint(0, 0, new Color(52, 73, 94),
                        0, getHeight(), new Color(44, 62, 80));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel titleLabel = new JLabel("Gestor de Archivos", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Panel de botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setOpaque(false);

        JButton btnAbrir = crearBotonEstilizado("📂 Abrir Archivo", new Color(46, 204, 113));
        JButton btnGuardar = crearBotonEstilizado("💾 Guardar Archivo", new Color(52, 152, 219));
        JButton btnDirectorio = crearBotonEstilizado("📁 Seleccionar Directorio", new Color(155, 89, 182));

        buttonPanel.add(btnAbrir);
        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnDirectorio);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Área de información
        JTextArea infoArea = new JTextArea(5, 40);
        infoArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        infoArea.setEditable(false);
        infoArea.setBackground(new Color(255, 255, 255, 200));
        infoArea.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(52, 152, 219), 2),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        JScrollPane scrollPane = new JScrollPane(infoArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.WHITE),
                "Información del Archivo",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Segoe UI", Font.BOLD, 12),
                Color.WHITE
        ));
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        // Acciones de los botones
        btnAbrir.addActionListener(e -> {
            JFileChooser fileChooser = crearFileChooserEstilizado();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            // Filtro para tipos de archivo comunes
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Archivos de Imagen (JPG, PNG, GIF)", "jpg", "jpeg", "png", "gif");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de Texto (TXT)", "txt"));
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Documentos PDF", "pdf"));
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                infoArea.setText("Archivo seleccionado: " + selectedFile.getAbsolutePath() +
                        "\nTamaño: " + selectedFile.length() + " bytes" +
                        "\nÚltima modificación: " + new java.util.Date(selectedFile.lastModified()));
            }
        });

        btnGuardar.addActionListener(e -> {
            JFileChooser fileChooser = crearFileChooserEstilizado();
            int result = fileChooser.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                infoArea.setText("Archivo a guardar: " + selectedFile.getAbsolutePath());
            }
        });

        btnDirectorio.addActionListener(e -> {
            JFileChooser fileChooser = crearFileChooserEstilizado();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser.setDialogTitle("Seleccionar Directorio");

            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedDir = fileChooser.getSelectedFile();
                infoArea.setText("Directorio seleccionado: " + selectedDir.getAbsolutePath());
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private static JButton crearBotonEstilizado(String texto, Color color) {
        JButton button = new JButton(texto);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setPreferredSize(new Dimension(200, 40));

        // Efecto hover
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(color.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(color);
            }
        });

        return button;
    }

    private static JFileChooser crearFileChooserEstilizado() {
        JFileChooser fileChooser = new JFileChooser();

        // Establecer directorio inicial
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        // Personalizar colores del JFileChooser
        UIManager.put("FileChooser.openDialogTitleBackground", new Color(52, 73, 94));
        UIManager.put("FileChooser.listViewBackground", new Color(255, 255, 255));
        UIManager.put("FileChooser.listViewFont", new Font("Segoe UI", Font.PLAIN, 12));

        // Título personalizado
        fileChooser.setDialogTitle("Selector de Archivos Estilizado");

        return fileChooser;
    }
}

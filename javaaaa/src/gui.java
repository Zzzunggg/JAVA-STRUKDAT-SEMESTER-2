import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersegiPanjangCalculator extends JFrame {
    private JTextField panjangField, lebarField;
    private JLabel hasilKeliling, hasilLuas;

    public PersegiPanjangCalculator() {
        setTitle("Program Hitung Keliling dan Luas Persegi Panjang");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.setBackground(Color.CYAN);

        // Label dan field input
        panel.add(new JLabel("Silahkan masukan nilai Panjang dan Lebar"));
        panel.add(new JLabel(""));

        panel.add(new JLabel("Panjang: "));
        panjangField = new JTextField(10);
        panel.add(panjangField);
        panel.add(new JLabel("CM"));

        panel.add(new JLabel("Lebar: "));
        lebarField = new JTextField(10);
        panel.add(lebarField);
        panel.add(new JLabel("CM"));

        // Tombol Hitung
        JButton hitungButton = new JButton("HITUNG");
        hitungButton.addActionListener(new HitungListener());
        panel.add(hitungButton);

        // Hasil Perhitungan
        panel.add(new JLabel("Hasil Perhitungan Persegi Panjang"));
        panel.add(new JLabel(""));

        panel.add(new JLabel("Keliling: "));
        hasilKeliling = new JLabel();
        panel.add(hasilKeliling);

        panel.add(new JLabel("Luas: "));
        hasilLuas = new JLabel();
        panel.add(hasilLuas);

        add(panel);
    }

    private class HitungListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double panjang = Double.parseDouble(panjangField.getText());
                double lebar = Double.parseDouble(lebarField.getText());

                // Menghitung keliling dan luas
                double keliling = 2 * (panjang + lebar);
                double luas = panjang * lebar;

                // Menampilkan hasil
                hasilKeliling.setText(String.format("%.2f CM", keliling));
                hasilLuas.setText(String.format("%.2f CM²", luas));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Masukkan nilai numerik yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PersegiPanjangCalculator().setVisible(true);
        });
    }
}

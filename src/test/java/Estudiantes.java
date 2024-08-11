import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Estudiantes extends JFrame {
    private JPanel Panel;
    private JTextField edadText;
    private JTextField fechanacimienoText;
    private JTextField generoText;
    private JButton ingresarBt;
    private JButton consultarBt;
    private JList lista;
    private JTextField apellidoText;
    private JTextField idText;
    private JTextField nombreText;
    private JTextField telefonoText;
    private JTextField direccionText;
    private JTextField correoelectronicoText;
    private JTextField carreraText;
    private JTextField fechainscripcionText;
    private boolean Conectado;

    public Estudiantes() {
        // Configuración básica de la ventana
        setContentPane(Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        // Acción para el botón "Consultar"
        consultarBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conectar(); // Llama al método de conexión
            }
        });
    }

    // Método para conectar a la base de datos
    private void conectar() {
        try {
            Connection root = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/learning");
            System.out.println("Conectado");
            Conectado = true;
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            Conectado = false;
        }
    }

    public void listar(){
        conectar();
        Object ps = conection.prepareStatemet("INSERT INTO estudiante VALUES(?,?,?,?,?,?)");
        ps.setInt(1,);



    }

    public static void main(String[] args) {
        Estudiantes f = new Estudiantes();
        f.setContentPane(new Estudiantes().Panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
    }
}

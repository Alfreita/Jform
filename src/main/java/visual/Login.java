package visual;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import jpa.*;
import tarefas.Tarefa;

public class Login extends JDialog {

    BuscaTarefas busca=new BuscaTarefas();
    Add add =new Add();
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextArea textArea;
    private JButton addTarefaButton;


    public Login() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        addTarefaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ch();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void ch(){
        add.setVisible(true);
    }

    private void onOK() {
        textArea.setText(" ");
       List<Tarefa> ret= new ArrayList<Tarefa>();

        // add your code here
      //  dispose();
        ret=busca.bb();
        for (Tarefa r :ret){
            textArea.append(r.getId() + "  " + r.getDescricao()+ " \n");
            textArea.setLineWrap(true);
            textArea.getAutoscrolls();
            System.out.println(" ");

        }
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Login dialog = new Login();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}

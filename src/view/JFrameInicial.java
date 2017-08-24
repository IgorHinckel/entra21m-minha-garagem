
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class JFrameInicial extends JFrame implements JFrameComportamentosInterface{
    
    private JButton jButtonListaCarros, jButtonCadastroCarro, jButtonListaCategoria;

    public JFrameInicial(){
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponetes();
        adicionarOnClick();
    }
    @Override
    public void criarTela() {
        setSize(600,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {
        jButtonListaCarros = new JButton("Lista de Carros");
        jButtonCadastroCarro = new JButton("Cadastro de Carros");
        jButtonListaCategoria = new JButton("Lista de Categorias");
    }

    @Override
    public void definirLocalizacao() {
        jButtonListaCarros.setBounds(10,10,200,35);
        jButtonCadastroCarro.setBounds(10,55,200,35);
        jButtonListaCategoria.setBounds(10,100,200,35);
    }

    @Override
    public void adicionarComponetes() {
        add(jButtonListaCarros);
        add(jButtonCadastroCarro);
        add(jButtonListaCategoria);
    }

    @Override
    public void adicionarOnClick() {
        jButtonListaCarros.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameListaCarros lista = new JFrameListaCarros();
                
            }
        });
        
        jButtonCadastroCarro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 new JFrameCadastroDeCarro().setVisible(true);
                
            }
        });
        
        jButtonListaCategoria.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new JFrameListaCategorias().setVisible(true);
            }
        });
    }
    
    
    
    
    
}

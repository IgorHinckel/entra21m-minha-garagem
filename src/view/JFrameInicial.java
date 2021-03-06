package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alunos
 */
public class JFrameInicial extends JFrame implements JFrameComportamentosInterface {

    private JButton jButtonListaCarros, jButtonCadastroCarro, jButtonListaCategoria;
    private JButton jButtonListaAvioes;

    public JFrameInicial() {
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponetes();
        adicionarOnClick();
    }

    @Override
    public void criarTela() {
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {
        Icon icone = new ImageIcon(getClass().getResource("/auto.png"));
        jButtonListaCarros = new JButton("Lista de Carros");
        jButtonListaCarros.setIcon(icone);

        icone = new ImageIcon(getClass().getResource("/racing.png"));
        jButtonCadastroCarro = new JButton("Cadastro de Carros");
        jButtonCadastroCarro.setIcon(icone);

        icone = new ImageIcon(getClass().getResource("/diagram.png"));
        jButtonListaCategoria = new JButton("Lista de Categorias");
        jButtonListaCategoria.setIcon(icone);

        icone = new ImageIcon(getClass().getResource("/icon_plane.png"));
        jButtonListaAvioes = new JButton("Lista de Aviões");
        jButtonListaAvioes.setIcon(icone);
    }

    @Override
    public void definirLocalizacao() {
        jButtonListaCarros.setBounds(40, 10, 200, 35);
        jButtonCadastroCarro.setBounds(40, 55, 200, 35);
        jButtonListaCategoria.setBounds(40, 100, 200, 35);
        jButtonListaAvioes.setBounds(40, 145, 200, 35);
    }

    @Override
    public void adicionarComponetes() {
        add(jButtonListaCarros);
        add(jButtonCadastroCarro);
        add(jButtonListaCategoria);
        add(jButtonListaAvioes);
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

        jButtonListaAvioes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameListaAvioes lista = new JFrameListaAvioes();
                lista.setVisible(true);
            }
        });
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calsses;

/**
 * inicio da criação em 03/07/2022 Classe tela jogo
 *
 * @author Mateus Ferraz Objetivo ambiente do jogo.
 */
// comecei fazendo as insportações
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("empty-statement")
public class TelaJogo extends JPanel implements ActionListener {

//Tamanho do JPanel(tela) em Largura x Altura 
    private final int Width_ = 400;
    private final int Height_ = 400;

//Tamnho de cada ponto na tela
    private final int Tamanho_ponto = 10;

// Tamanho total de pontos, mutiplicando a largura e altura 
    private final int Todos_Pontos = 1600;

// Um valor aleatório para gerar posição
    private final int Rand_Posicao = 29;

// Um delay para o tempo de execução do jogo 
    private final int Delay = 140;

// Definição do plano cartesiano
    private int[] x = new int[Todos_Pontos];
    private int[] y = new int[Todos_Pontos];

// Pontos da cobrinha 
    private int pontos;

// Posição (x,y) da comidda
    private int comida_x;
    private int comida_y;

// Contar pontuação começando em zero
    private int Pontuacao = 0;

// Mensagem d pontução
    String Score = "Pontuação: " + Pontuacao;

// Fonte para escrever a pontuação, estilo da fonte 
    Font Score_Font = new Font("Consolas", Font.BOLD, 14);
// Tamanho total da escrita 
    FontMetrics Score_Metrica = this.getFontMetrics(Score_Font);
// Definição dos movimento 
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
// Definição do status do jogo; 
    private boolean estaJogando = true;
// Tempo de execução do jogo 
    private Timer tempo;
// Imagens da cabeça e corpo da cobrinha 
    private Image Corpo;
    private Image comida;
    private Image cabeça;
// Método contrutor da classe

    public Grade() {
// Cria uma instrução de teclado 
        addKeyListener(new TAdapter());
//  Seta o plano d fundo com preto 
        setBackground(Color.BLACK);
// criar icone do arquivo png e seta na imagem correpondente 
        ImageIcon corpo_ = new ImageIcon("Corpo");
// criar icone do arquivo png e seta na imagem correpondente   
        ImageIcon comida_ = new ImageIcon("comida.png");
// criar icone do arquivo png e seta na imagem correpondente
        ImageIcon cabeça_ = new ImageIcon("cabeça");
// Defina o foco para o JPanel 
        setFocusable(true);
//Define o tamanho da tela 
        setSize(WIDTH, HEIGHT);
// Inicializar o jogo
        initJogo();
    }
// Método para iniciar o jogo 

    
        public void initJogo(){
// Define quantidade de pontos iniciais 
pontos = 3;
// Define a posição em (x,Y) de cada ponto 
        for (int i = 0; i < pontos; i++);
        {

            x[i] = 50 - i * 10;
            y[i] = 50;

// Gerar a primeira comida 
            localComida();
// Iniciar tempo de execução do jogo
            tempo = new Timer(Delay, this);
            tempo.start();
        }
//Método  para desenhar elementoe na tela do jogo 
        @Override
        public void paint (Graphics g){
// Define o atributo para a classe propria
super.paint(g);
// Analisa se o jogo esta em andamento, se estiver e=desenha na tela 
// Se não estiver o jogo é dado como fim 
            if (estaJogando) {
 //Desenha a comida no plano (x,y) do  jogo 
 g.drawImage(comida,comida_x,comida_y, this);
 // Para cada Ponto da cobrinha ,desenha a cabeça e o corpo 
 // em (x,y)
 for(int i=0;i<pontos;i++)  {
     if (i==0){
         g.drawImage(cabeça,x[i],y[i], this);}
     else{
         g.drawImage(Corpo,x[i],y[i], this);
     }
 // Desenhar pontuação na tela 
 desenharPontuacao(g);
 // Executa a sicronia de dados 
 Toolkit.getDefaultToolkit().sync();
 // 
   
     
     }
 
         
     }
 }     
     

        }

    private void localComida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void desenharPontuacao(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

   
     

 



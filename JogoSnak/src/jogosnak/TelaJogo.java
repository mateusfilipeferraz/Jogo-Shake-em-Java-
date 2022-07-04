/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogosnak;

/**
 * inicio da criação em 03/07/2022
 * Classe tela jogo
 * @author Mateus Ferraz
 * Objetivo ambiente do jogo.
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

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TelaJogo extends JPanel implements ActionListener{
//Tamanho do JPanel(tela) em Largura x Altura 
  
    private final int Width_=400;
    private final int Height_=400;
    
//Tamnho de cada ponto na tela
    
    private final int Tamanho_ponto =10;
    
// Tamanho total de pontos, mutiplicando a largura e altura 
    
    private final int Todos_Pontos=1600;
      
// Um valor aleatório para gerar posição

    private final int Rand_Posicao=29;
            
// Um delay para o tempo de execução do jogo 

    private final int Delay=140;

// Definição do plano cartesiano
    
    private int [] x = new int[Todos_Pontos];
    private int [] y = new int[Todos_Pontos];
    
// Pontos da cobrinha 
    
    private int pontos;
    
// Posição (x,y) da comidda
    
    private int comida_x;
    private int comida_y;
    
// Contar pontuação começando em zero
    
    private int Pontuacao=0;
    
// Mensagem d pontução
    
    String Score = "Pontuação: " +Pontuacao;
    
//Fonte para escrever a pontuação, estiloo da fonte 
    
    Font Score_Font =new Font("Consolas",Font.BOLD,14);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    {
    }
          
    
    public TelaJogo() {
    }
   
  
    }
   
    
    
    
    
    
    
    
    
    
}

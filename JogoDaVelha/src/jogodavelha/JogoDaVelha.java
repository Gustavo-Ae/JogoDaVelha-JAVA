package jogodavelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JogoDaVelha extends JFrame {
    JButton[] botoes = new JButton[9];
    boolean X_ou_O;
    boolean[] click = new boolean[9]; // vai ser utilizado para quando clicar em um botão , se ele já estiver ativado com "O" ou "X" ele não vai poder trocar.
    
    public JogoDaVelha(){
        setVisible(true);
        setTitle("Jogo Da Velha");
        setDefaultCloseOperation(3); //Quando fechar a janela o Java vai parar de executar.
        setLayout(null);
        setBounds(330, 100, 700, 500);
        
        int contador = 0;
        
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                botoes[contador] = new JButton();
                add(botoes[contador]);
                botoes[contador].setBounds((100*i) + 50,(100*j) + 50 ,95,95);
                botoes[contador].setFont(new Font("Arial",Font.BOLD,30));
                contador++;
            }
        }
        
        for(int i = 0; i < 9;i++){
            click[i] = false;
        }
        
        botoes[0].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[0] == false){
                  click[0] = true;
                  X_ou_O = mudar(botoes[0]);
               }
          }
        });
        
        botoes[1].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[1] == false){
                  click[1] = true;
                  X_ou_O = mudar(botoes[1]);
               }
          }
        });
        
        botoes[2].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[2] == false){
                  click[2] = true;
                  X_ou_O = mudar(botoes[2]);
               }
          }
        });
        
        botoes[3].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[3] == false){
                  click[3] = true;
                  X_ou_O = mudar(botoes[3]);
               }
          }
        });
        
        botoes[4].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[4] == false){
                  click[4] = true;
                  X_ou_O = mudar(botoes[4]);
               }
          }
        });
        
        botoes[5].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[5] == false){
                  click[5] = true;
                  X_ou_O = mudar(botoes[5]);
               }
          }
        });
        
        botoes[6].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[6] == false){
                  click[6] = true;
                  X_ou_O = mudar(botoes[6]);
               }
          }
        });
        
        botoes[7].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[7] == false){
                  click[7] = true;
                  X_ou_O = mudar(botoes[7]);
               }
          }
        });
        
        botoes[8].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[8] == false){
                  click[8] = true;
                  X_ou_O = mudar(botoes[8]);
               }
          }
        });
        
    }
    
    public boolean mudar(JButton btn){
        if(X_ou_O){
            btn.setText("O");
            return false;
        }else{
            btn.setText("X");
            return true;
        }
    }
    
    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
    }
}

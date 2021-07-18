package jogodavelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class JogoDaVelha extends JFrame{
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
        
        for(int linha = 0; linha < 3;linha++){
            for(int coluna = 0; coluna < 3;coluna++){
                botoes[contador] = new JButton();
                add(botoes[contador]);
                botoes[contador].setBounds((100*linha) + 50,(100*coluna) + 50 ,95,95);
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
                  mudar(botoes[0]);
               }
          }
        });
        
        botoes[1].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[1] == false){
                  click[1] = true;
                  mudar(botoes[1]);
               }
          }
        });
        
        botoes[2].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[2] == false){
                  click[2] = true;
                  mudar(botoes[2]);
               }
          }
        });
        
        botoes[3].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[3] == false){
                  click[3] = true;
                  mudar(botoes[3]);
               }
          }
        });
        
        botoes[4].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[4] == false){
                  click[4] = true;
                  mudar(botoes[4]);
               }
          }
        });
        
        botoes[5].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[5] == false){
                  click[5] = true;
                  mudar(botoes[5]);
               }
          }
        });
        
        botoes[6].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[6] == false){
                  click[6] = true;
                  mudar(botoes[6]);
               }
          }
        });
        
        botoes[7].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[7] == false){
                  click[7] = true;
                  mudar(botoes[7]);
               }
          }
        });
        
        botoes[8].addActionListener(new java.awt.event.ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              if(click[8] == false){
                  click[8] = true;
                  mudar(botoes[8]);
               }
          }
        });
        
    }
    
    public void mudar(JButton btn){
        if(X_ou_O){
            btn.setText("O");
            X_ou_O = false;
        }else{
            btn.setText("X");
            X_ou_O = true;
        }
        ganhou();
    }
    
    public void ganhou(){
        
        int posicao_DoClick = 0;  // vai ser usado para verificar o empate 
        
        for(int i = 0;i < 9;i++){
            if(click[i] == true){
                posicao_DoClick++;
            }
        }
       
        if((botoes[0].getText() == "X" && botoes[1].getText() == "X" && botoes[2].getText() == "X") ||
                (botoes[3].getText() == "X" && botoes[4].getText() == "X" && botoes[5].getText() == "X") ||
                (botoes[6].getText() == "X" && botoes[7].getText() == "X" && botoes[8].getText() == "X") ||
                (botoes[0].getText() == "X" && botoes[3].getText() == "X" && botoes[6].getText() == "X") ||
                (botoes[1].getText() == "X" && botoes[4].getText() == "X" && botoes[7].getText() == "X") ||
                (botoes[2].getText() == "X" && botoes[5].getText() == "X" && botoes[8].getText() == "X") ||
                (botoes[0].getText() == "X" && botoes[4].getText() == "X" && botoes[8].getText() == "X") ||
                (botoes[6].getText() == "X" && botoes[4].getText() == "X" && botoes[2].getText() == "X") ){
            
            JOptionPane.showMessageDialog(this, "X ganhou");
            limpar();
        }
        else if((botoes[0].getText() == "O" && botoes[1].getText() == "O" && botoes[2].getText() == "O") ||
                (botoes[3].getText() == "O" && botoes[4].getText() == "O" && botoes[5].getText() == "O") ||
                (botoes[6].getText() == "O" && botoes[7].getText() == "O" && botoes[8].getText() == "O") ||
                (botoes[0].getText() == "O" && botoes[3].getText() == "O" && botoes[6].getText() == "O") ||
                (botoes[1].getText() == "O" && botoes[4].getText() == "O" && botoes[7].getText() == "O") ||
                (botoes[2].getText() == "O" && botoes[5].getText() == "O" && botoes[8].getText() == "O") ||
                (botoes[0].getText() == "O" && botoes[4].getText() == "O" && botoes[8].getText() == "O") ||
                (botoes[6].getText() == "O" && botoes[4].getText() == "O" && botoes[2].getText() == "O") ){
            
            JOptionPane.showMessageDialog(this, "O ganhou");
            limpar();
        }else if(posicao_DoClick == 9){
            JOptionPane.showMessageDialog(this, "Empate");
            limpar();
        }
    }
    public void limpar(){
        for(int i = 0; i < 9;i++){
            botoes[i].setText("");
            click[i] = false;
        }
    }
    
    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
    }
}

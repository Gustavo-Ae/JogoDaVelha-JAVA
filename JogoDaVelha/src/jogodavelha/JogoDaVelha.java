package jogodavelha;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JogoDaVelha extends JFrame {
    JButton[] botoes = new JButton[9];
    boolean X_ou_O;
    
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
                contador++;
            }
        }
         
        botoes[0].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                  X_ou_O = mudar(botoes[0]);
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

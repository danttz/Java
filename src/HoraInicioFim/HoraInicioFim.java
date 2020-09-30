package HoraInicioFim;

import java.util.Scanner;
public class HoraInicioFim {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int horaInicio,horaFim,duracao;
        
        System.out.print("Digite o horário de início:");
            horaInicio = t.nextInt();
            
        System.out.print("Dihite o horário final:");
            horaFim = t.nextInt();
            
            if(horaInicio < horaFim){
                duracao = horaFim - horaInicio;
            }else{
                duracao = 24 - horaInicio + horaFim;
            }
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
            t.close();
    }
    
}

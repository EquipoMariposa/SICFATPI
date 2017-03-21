package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VistaListines;
import vistas.VistaMenuPrincipal;
import vistas.vistaHabilitaciones;
import vistas.vistaTasaSalida;

public class controlMenuPrincipal implements ActionListener{

    VistaMenuPrincipal vista;

    public controlMenuPrincipal(VistaMenuPrincipal vista) {
        this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.getItemListines()){
            VistaListines vistaL=new VistaListines();
            vista.getEscritorioMenuPrincipal().add(vistaL);
            vistaL.setVisible(true);  
        }
        else if(e.getSource()==vista.getItemTasaSalida()){
            vistaTasaSalida vistaTS=new vistaTasaSalida();
            vista.getEscritorioMenuPrincipal().add(vistaTS);
            vistaTS.setVisible(true);
        }
        else if(e.getSource()==vista.getItemHabilitaciones()){
            vistaHabilitaciones vistaH=new vistaHabilitaciones();
            vista.getEscritorioMenuPrincipal().add(vistaH);
            vistaH.setVisible(true);
        }
        else if(e.getSource()==vista.getItemSalirSistema()){
            System.exit(0);  
        }
    }
    
}

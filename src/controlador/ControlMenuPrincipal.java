package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VistaListines;
import vistas.VistaMenuPrincipal;
import vistas.VistaHabilitaciones;
import vistas.VistaTasaSalida;

public class ControlMenuPrincipal implements ActionListener{

    VistaMenuPrincipal vista;

    public ControlMenuPrincipal(VistaMenuPrincipal vista) {
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
            VistaTasaSalida vistaTS=new VistaTasaSalida();
            vista.getEscritorioMenuPrincipal().add(vistaTS);
            vistaTS.setVisible(true);
        }
        else if(e.getSource()==vista.getItemHabilitaciones()){
            VistaHabilitaciones vistaH=new VistaHabilitaciones();
            vista.getEscritorioMenuPrincipal().add(vistaH);
            vistaH.setVisible(true);
        }
        else if(e.getSource()==vista.getItemSalirSistema()){
            System.exit(0);  
        }
    }
    
}

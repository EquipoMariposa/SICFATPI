package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VistaChofer;
import vistas.VistaListin;
import vistas.VistaMenuPrincipal;
import vistas.VistaHabilitacion;
import vistas.VistaLineaTransporte;
import vistas.VistaLocal;
import vistas.VistaMarca;
import vistas.VistaModelo;
import vistas.VistaMonto;
import vistas.VistaTasaSalida;
import vistas.VistaUnidadTransporte;
import vistas.VistaUsuario;
import vistas.VistaVendedorAmbulante;

public class ControlMenuPrincipal implements ActionListener{

    VistaMenuPrincipal vista;

    public ControlMenuPrincipal(VistaMenuPrincipal vista) {
        this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.getItemListin()){
            VistaListin vistaListin=new VistaListin();
            vista.getEscritorioMenuPrincipal().add(vistaListin);
            vistaListin.setVisible(true);  
        }
        else if(e.getSource()==vista.getItemTasaSalida()){
            VistaTasaSalida vistaTasaSalida=new VistaTasaSalida();
            vista.getEscritorioMenuPrincipal().add(vistaTasaSalida);
            vistaTasaSalida.setVisible(true);
        }
        else if(e.getSource()==vista.getItemHabilitacion()){
            VistaHabilitacion vistaHabilitacion=new VistaHabilitacion();
            vista.getEscritorioMenuPrincipal().add(vistaHabilitacion);
            vistaHabilitacion.setVisible(true);
        }
        else if(e.getSource()==vista.getItemLineaTransporte()){
            VistaLineaTransporte vistaLineaTransporte=new VistaLineaTransporte();
            vista.getEscritorioMenuPrincipal().add(vistaLineaTransporte);
            vistaLineaTransporte.setVisible(true);
        }
        else if(e.getSource()==vista.getItemUnidadTransporte()){
            VistaUnidadTransporte vistaUnidadTransporte=new VistaUnidadTransporte();
            vista.getEscritorioMenuPrincipal().add(vistaUnidadTransporte);
            vistaUnidadTransporte.setVisible(true);
        }
        else if(e.getSource()==vista.getItemVendedorAmbulante()){
            VistaVendedorAmbulante vistaVendedorAmbulante=new VistaVendedorAmbulante();
            vista.getEscritorioMenuPrincipal().add(vistaVendedorAmbulante);
            vistaVendedorAmbulante.setVisible(true);
        }
        else if(e.getSource()==vista.getItemLocal()){
            VistaLocal vistaLocal=new VistaLocal();
            vista.getEscritorioMenuPrincipal().add(vistaLocal);
            vistaLocal.setVisible(true);
        }
        else if(e.getSource()==vista.getItemChofer()){
            VistaChofer vistaChofer=new VistaChofer();
            vista.getEscritorioMenuPrincipal().add(vistaChofer);
            vistaChofer.setVisible(true);
        }
        else if(e.getSource()==vista.getItemUsuario()){
            VistaUsuario vistaUsuario=new VistaUsuario();
            vista.getEscritorioMenuPrincipal().add(vistaUsuario);
            vistaUsuario.setVisible(true);
        }
        else if(e.getSource()==vista.getItemMonto()){
            VistaMonto vistaMonto=new VistaMonto();
            vista.getEscritorioMenuPrincipal().add(vistaMonto);
            vistaMonto.setVisible(true);
        }
        else if(e.getSource()==vista.getItemMarca()){
            VistaMarca vistaMarca=new VistaMarca();
            vista.getEscritorioMenuPrincipal().add(vistaMarca);
            vistaMarca.setVisible(true);
        }
        else if(e.getSource()==vista.getItemModelo()){
            VistaModelo vistaModelo=new VistaModelo();
            vista.getEscritorioMenuPrincipal().add(vistaModelo);
            vistaModelo.setVisible(true);
        }
        else if(e.getSource()==vista.getItemSalirSistema()){
            System.exit(0);  
        }
    }
    
}

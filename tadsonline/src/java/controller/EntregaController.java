package controller;

import dao.EntregaDAO;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import model.Entrega;
import org.hibernate.Query;
import util.HibernateUtil;
import org.hibernate.Session;
import javax.faces.bean.ManagedProperty;
import model.StatusEntrega;

@ManagedBean(name="EntregaController")
@SessionScoped
public class EntregaController {
    @javax.faces.bean.ManagedProperty(value="#{loginMB}")
    private LoginMB loginMB;
    private Entrega entrega = new Entrega();
    private List<Entrega> entregas = new ArrayList<Entrega>();
    
    public EntregaController() {
        entrega = new Entrega();
    }
    
    public void verificarPerfil() {
        if (loginMB.getFuncionario().getCargo().getIdCargo() != util.Perfil.PERFIL_GERENTE) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("perfilFuncionario.xhtml?faces-redirect=true");
            } catch (IOException ex) {
                Logger.getLogger(EntregaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    

    public String cadastrarEntrega(){        
        EntregaDAO dao = new EntregaDAO();
        StatusEntrega status = new StatusEntrega();
        status.setIdStatus(1);
        this.entrega.setIdStatusEntrega(status);
        
        java.util.Date dt = this.entrega.getDataEntrega();
        java.util.Calendar c = Calendar.getInstance(); 
        c.setTime(dt); 
        c.add(java.util.Calendar.DATE, 1);
        dt = c.getTime();
        this.entrega.setDataEntrega(dt);
        
        dao.cadastrar(entrega);
        
        return "visualizarEntregas?faces-redirect=true";
    }
    
    public void listar() {
        this.entregas = new EntregaDAO().listar();
    }
    
    public Entrega getEntrega() {
        return entrega;
    }

    public List<Entrega> getEntregas() {
        listar();
        return this.entregas;
    }
    
     public LoginMB getLoginMB() {
        return loginMB;
    }

    public void setLoginMB(LoginMB loginMB) {
        this.loginMB = loginMB;
    }
}

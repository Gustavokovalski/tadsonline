package controller;

import dao.EntregaDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.Entrega;
import org.hibernate.Query;
import util.HibernateUtil;
import org.hibernate.Session;

@ManagedBean(name="EntregaController")
@SessionScoped
public class EntregaController {
    private Entrega entrega = new Entrega();
    private List<Entrega> entregas = new ArrayList<Entrega>();  
    
    
    public EntregaController() {
        
    }
    

    public String cadastrarEntrega(){
        entrega = new Entrega();
        
        new EntregaDAO().cadastrar(entrega);
        
        return "pedidoRealizado";
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
}

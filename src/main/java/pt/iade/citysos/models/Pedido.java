package pt.iade.citysos.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="p_id")
    private int id;
    @Column(name="p_cart_sol")
    private String carta;
    

    @OneToMany
    @JoinColumn(name = "ep_p_id")
    private List<EmpresaPedido> publicacao;
    //para ligar o Estado a base de dados... garantir que na base de dados o id começa em 0 e não em 1.
    //@Enumerated(EnumType.ORDINAL)
    //private EstadoPedido estado;


    @ManyToOne
    @JoinColumn(name="p_ong_id")
    private Ong ong; 
    
    @ManyToOne
    @JoinColumn(name="p_tip_ped_id")
    private TipoPedido tipoPedido;
    
    public Pedido(){}
    
    public int getId(){
        return id;
    }
    public String getPed(){
        return carta;
    }
    public TipoPedido getTipoPedido(){
        return tipoPedido;
    }
    public Ong getOng(){
        return ong;
    }
    
    
}
}

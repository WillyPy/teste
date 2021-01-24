package pt.iade.citysos.models;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="empresa")
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="e_id")
    private int id;
    @Column(name="e_nome")
    private String nome;
    @Column(name="e_regiao")
    private String regiao;
    
    @OneToMany
    @JoinColumn(name="ep_e_id")
    private List<EmpresaPedido> publicacao;

    public Empresa(int id, String nome, String password){
        id = this.id;
        nome = this.nome;
        password =  this.regiao;
    }

    public String getNome() { return nome; }
    public String getRegiao(){ return regiao; }
}
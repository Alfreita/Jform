package tarefas;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String descricao;

    @Column
    private boolean finalizado;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
}

package br.unicap.si.poo.project.demo.model;

import jakarta.persistence.*;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String tipo;

    
    public Long getId() {
         return id;
     }
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getNome() {
         return nome; 
        }
    public void setNome(String nome) {
         this.nome = nome; 
        }

    public String getDescricao() {
         return descricao; 
        }
    public void setDescricao(String descricao) {
         this.descricao = descricao;
         }

    public String getTipo() {
         return tipo;
         }
    public void setTipo(String tipo) {
         this.tipo = tipo;
         }
}

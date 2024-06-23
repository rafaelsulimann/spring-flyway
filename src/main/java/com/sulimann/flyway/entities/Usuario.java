package com.sulimann.flyway.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "tb_usuarios")
@Getter
public class Usuario {

  @Id
  @GeneratedValue
  private Long id;
  private String nome;
  private String email;
  private String senha;
  private LocalDateTime dataCriacao;

  public Usuario() {
  }

  public Usuario(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.dataCriacao = LocalDateTime.now();
  }
}

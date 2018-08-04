package com.example.demo.entity;


/**
 * Classe que representa um Beneficiario
 * @author Diego
 *
 */
public class Beneficiario {

	private int codigo;
	private String nome;
	private String descricao;
	private double valor;
	
	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getValor() {
		return valor;
	}
	
	/**
	 * 
	 * @param valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		return "Beneficiario [codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor
				+ ", getCodigo()=" + getCodigo() + ", getNome()=" + getNome() + ", getDescricao()=" + getDescricao()
				+ ", getValor()=" + getValor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beneficiario other = (Beneficiario) obj;
		if (codigo != other.codigo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}

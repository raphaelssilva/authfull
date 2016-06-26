package biz.r2s.util.Model;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
public class Telefone implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -1537785179386252097L;
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	@Persistent
	private Long numero;
	@Persistent 
	private String descricao;
	@Persistent
	private Integer ddd;
	@Persistent
	private Integer ramal;
	@Persistent
	private Integer codPais;
	@Persistent
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Integer getRamal() {
		return ramal;
	}
	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}
	public Integer getCodPais() {
		return codPais;
	}
	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}	
}
 

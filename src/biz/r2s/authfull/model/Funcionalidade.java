
package biz.r2s.authfull.model;

import java.io.Serializable;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Funcionalidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -823396173946894309L;

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	
	@Persistent
	private String nome;
	
	@Persistent
	private String descricao;
	
	@Persistent
	private Servico servico;
	
	@Persistent
	private Boolean isAtivo;
	
	@NotPersistent
	private List<Permissao> permissoes;
	
	@Persistent
	private List<Key> keysPermissoes;
	
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
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
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public List<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	public List<Key> getKeysPermissoes() {
		return keysPermissoes;
	}
	public void setKeysPermissoes(List<Key> keysPermissoes) {
		this.keysPermissoes = keysPermissoes;
	}
}

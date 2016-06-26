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
public class GrupoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	
	@Persistent
	private String nome;
	
	@Persistent
	private String descricao;
	
	@Persistent
	private Boolean isAtivo;
	
	@NotPersistent
	private List<Usuario> usuarios;
	
	@NotPersistent
	private List<Role> Roles;
	
	@NotPersistent
	private List<GrupoRole> grupoRoles;
	
	@Persistent
	private List<Key> keysUsuario;
	
	@Persistent
	private List<Key> keysRole;
	
	@Persistent
	private List<Key> keysGrupoRole;

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

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Role> getRoles() {
		return Roles;
	}

	public void setRoles(List<Role> roles) {
		Roles = roles;
	}

	public List<GrupoRole> getGrupoRoles() {
		return grupoRoles;
	}

	public void setGrupoRoles(List<GrupoRole> grupoRoles) {
		this.grupoRoles = grupoRoles;
	}

	public List<Key> getKeysUsuario() {
		return keysUsuario;
	}

	public void setKeysUsuario(List<Key> keysUsuario) {
		this.keysUsuario = keysUsuario;
	}

	public List<Key> getKeysRole() {
		return keysRole;
	}

	public void setKeysRole(List<Key> keysRole) {
		this.keysRole = keysRole;
	}

	public List<Key> getKeysGrupoRole() {
		return keysGrupoRole;
	}

	public void setKeysGrupoRole(List<Key> keysGrupoRole) {
		this.keysGrupoRole = keysGrupoRole;
	}
	
}

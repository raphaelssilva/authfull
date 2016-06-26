package biz.r2s.authfull.model;

import java.io.Serializable;
import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Role implements Serializable{
	
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
	private String Descricao;
	
	@NotPersistent
	private List<Usuario> usuarios;
	
	@NotPersistent
	private List<GrupoUsuario> grupoUsuarios;
	
	@NotPersistent
	private List<GrupoRole> gruposRole;
	
	@Persistent(mappedBy="role", defaultFetchGroup="true", nullValue=NullValue.NONE)
	@Element(dependent = "true")
	private List<Permissao> permissoes;
	
	@Persistent
	private List<Key> keysUsuarios;
	
	@Persistent
	private List<Key> keysGrupoUsuario;
	
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
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<GrupoUsuario> getGrupoUsuarios() {
		return grupoUsuarios;
	}

	public void setGrupoUsuarios(List<GrupoUsuario> grupoUsuarios) {
		this.grupoUsuarios = grupoUsuarios;
	}

	public List<GrupoRole> getGruposRole() {
		return gruposRole;
	}

	public void setGruposRole(List<GrupoRole> gruposRole) {
		this.gruposRole = gruposRole;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public List<Key> getKeysUsuarios() {
		return keysUsuarios;
	}

	public void setKeysUsuarios(List<Key> keysUsuarios) {
		this.keysUsuarios = keysUsuarios;
	}

	public List<Key> getKeysGrupoUsuario() {
		return keysGrupoUsuario;
	}

	public void setKeysGrupoUsuario(List<Key> keysGrupoUsuario) {
		this.keysGrupoUsuario = keysGrupoUsuario;
	}

	public List<Key> getKeysGrupoRole() {
		return keysGrupoRole;
	}

	public void setKeysGrupoRole(List<Key> keysGrupoRole) {
		this.keysGrupoRole = keysGrupoRole;
	}	
}

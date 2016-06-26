package biz.r2s.authfull.model;

import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Key;

import biz.r2s.util.Model.Pessoa;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Usuario extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3950588971217487387L;
	
	@Persistent
	private String login;
	
	@Persistent
	private String senha;
	
	@Persistent
	private String token;
	
	@Persistent
	private String perguntaSecreta;
	
	@Persistent
	private String respostaSecreta;
	
	@Persistent
	private Boolean isAtivo;
	
	@NotPersistent
	private List<Role> roles;
	
	@Persistent(mappedBy="usuario", defaultFetchGroup="true", nullValue=NullValue.NONE)
	@Element(dependent = "true")
	private List<Sessao> sessoes;
	
	@NotPersistent
	private List<GrupoUsuario> grupoUsuarios;
	
	@NotPersistent
	private List<GrupoRole> grupoRoles;
	
	@Persistent
	private List<Key> keysRole;
	
	@Persistent
	private List<Key> keysGrupoUsuario;
	
	@Persistent
	private List<Key> keysGrupoRoles;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPerguntaSecreta() {
		return perguntaSecreta;
	}

	public void setPerguntaSecreta(String perguntaSecreta) {
		this.perguntaSecreta = perguntaSecreta;
	}

	public String getRespostaSecreta() {
		return respostaSecreta;
	}

	public void setRespostaSecreta(String respostaSecreta) {
		this.respostaSecreta = respostaSecreta;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Sessao> getSessoes() {
		return sessoes;
	}

	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}

	public List<GrupoUsuario> getGrupoUsuarios() {
		return grupoUsuarios;
	}

	public void setGrupoUsuarios(List<GrupoUsuario> grupoUsuarios) {
		this.grupoUsuarios = grupoUsuarios;
	}

	public List<Key> getKeysRole() {
		return keysRole;
	}

	public void setKeysRole(List<Key> keysRole) {
		this.keysRole = keysRole;
	}

	public List<Key> getKeysGrupoUsuario() {
		return keysGrupoUsuario;
	}

	public void setKeysGrupoUsuario(List<Key> keysGrupoUsuario) {
		this.keysGrupoUsuario = keysGrupoUsuario;
	}

	public List<GrupoRole> getGrupoRoles() {
		return grupoRoles;
	}

	public void setGrupoRoles(List<GrupoRole> grupoRoles) {
		this.grupoRoles = grupoRoles;
	}

	public List<Key> getKeysGrupoRoles() {
		return keysGrupoRoles;
	}

	public void setKeysGrupoRoles(List<Key> keysGrupoRoles) {
		this.keysGrupoRoles = keysGrupoRoles;
	}		
}

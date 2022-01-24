package by.epam.java_introduction.final_module.library.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -6576207425563739998L;
	
	private String login;
	private String password;
	private boolean isAdmin;
	
	public User() {
		
	}

	public User(String login, String password) {		
		this.login = login;
		this.password = password;		
	}

	public User(String login, String password, boolean isAdmin) {
		super();
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isAdmin ? 1231 : 1237);
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		if (isAdmin != other.isAdmin) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", isAdmin=" + isAdmin + "]";
	}

}

package com.xxwshelly.pojos;

import java.io.Serializable;

public class User implements Serializable{

		private int id;
		private String name;
		private String passWord;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

		public User(int id, String name, String passWord) {
			super();
			this.id = id;
			this.name = name;
			this.passWord = passWord;
			
		}
		public User() {
			super();
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", passWord=" + passWord + "]";
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
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
			User other = (User) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (passWord == null) {
				if (other.passWord != null)
					return false;
			} else if (!passWord.equals(other.passWord))
				return false;
			return true;
		}


	

}

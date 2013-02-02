package com.wankuma.nagoya26.kaiten_zushi;

/**
 * @author t_hara
 */
public class Dish {

	private final String id;
	
	private final DishType type;

	/**
	 * @param id
	 * @param type
	 */
	public Dish(String id, DishType type) {
		super();
		this.id = id;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || !(obj instanceof Dish)) return false;
		Dish other = (Dish) obj;
		return id.equals(other.id);
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 */
	public DishType getType() {
		return type;
	}
}

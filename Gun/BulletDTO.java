package co.Anusha.gun.dto;

public class BulletDTO {
	private byte types;
	private float size;
	private float weight;
	public byte getTypes() {
		return types;
	}
	public void setTypes(byte types) {
		this.types = types;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "class name : "+getClass().getSimpleName() +"\n"+ "types=" + types +"\n"+ "size=" + size +"\n"+ "weight=" + weight ;
	}
	
	
}

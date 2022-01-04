package co.Anusha.gun.dto;

import java.util.Objects;

public class Gun {
	private String material;
	private int maxSize;
	private float range;
	private BulletDTO bullet;
	private CompanyDTO company;
	private Types types;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public BulletDTO getBullet() {
		return bullet;
	}
	public void setBullet(BulletDTO bullet) {
		this.bullet = bullet;
	}
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	public Types getTypes() {
		return types;
	}
	public void setTypes(Types types) {
		this.types = types;
	}
	
	public String getAll() {
		return "\n"+"class name : "+ getClass().getSimpleName() +"\n"+"material : "+ material +"\n"+ "maximum size : "+ maxSize +"\n"+ "range : "+ range +"\n"+  bullet +"\n" + company +"\n" + types;
	}
	
	@Override
	public String toString() {
		return  "\n"+"class name : "+getClass().getSimpleName() +"\n"+"material : "+"maximum size : "+ material +"\n"+  maxSize +"\n"+ "range : "+ range +"\n"+  bullet +"\n"+  company +"\n"+  types;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(material,maxSize,range,bullet,company,types);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		else {
			if(obj instanceof Gun) {
				Gun object = (Gun)obj;
				if(this.material == object.material && this.maxSize == object.maxSize && 
				   this.range == object.range && this.bullet == object.bullet &&
				   this.company == object.company && this.types == object.types) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}	
		
	}
	
}

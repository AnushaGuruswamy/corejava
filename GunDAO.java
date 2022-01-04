package co.Anusha.gun.dto;

public class GunDAO {
	
	Gun []dto = new Gun[3];
	int index = 0;
	
	public void add(Gun details) {
		if(index < dto.length) {
			dto[index] = details;
			index++;
		}
	}
	
	public void getAll() {
		for(int index = 0 ; index < dto.length ; index++) {
			if(dto[index] != null) {
				System.out.println(dto[index].getAll());
			}
		}
	}
	
	public Gun updateSizeByRange(float range,int maxSize) {
		for(index = 0 ; index < dto.length ; index++) {
			if(dto[index] != null) {
				if(range==dto[index].getRange()){
					dto[index].setRange(maxSize);
					return dto[index];
				}
			}
		}
		return null;
	}
	
	public String deleteByWeight(float weight) {
		for(index = 0 ; index < dto.length ; index ++) {
			if(dto[index]!= null) {
				if(weight == dto[index].getBullet().getWeight()) {
					dto[index]=null;
				}
			}
		}
		return "deleted";
	}  
	
	
	
}

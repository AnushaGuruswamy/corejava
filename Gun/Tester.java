package co.Anusha.gun.dto;

public class Tester {
	public static void main(String []args) {
		
		Gun gun = new Gun();
		gun.setRange(2132.5f);
		gun.setMaxSize(21535);
		gun.setMaterial("metal");
		gun.setTypes(Types.PISTOL);
		BulletDTO bullet = new BulletDTO();
		gun.setBullet(bullet);	//linking BulletDTO class with Gun class	
		bullet.setSize(5132.33f);
		bullet.setTypes((byte)8);
		bullet.setWeight(336.26f);
		CompanyDTO company = new CompanyDTO();
		gun.setCompany(company);  //linking CompanyDTO with Gun class
		company.setCompanyName("Ktf");
		company.setCountry("USA");
		company.setFounder("Aruna");
						
		Gun gun1 = new Gun();
		gun1.setRange(36231.215f);
		gun1.setMaxSize(35661);
		gun1.setMaterial("Plastic");
		BulletDTO bullet1 = new BulletDTO();
		gun1.setBullet(bullet1);  //linking BulletDTO class with Gun class
		bullet1.setSize(213556.695f);
		bullet1.setTypes((byte)6);
		bullet1.setWeight(3125.85f);
		CompanyDTO company1 = new CompanyDTO();
		gun1.setCompany(company1);    //linking CompanyDTO with Gun class
		company1.setCompanyName("kysdghav");
		company1.setCountry("kayuuqfdqg");
		company1.setFounder("Gavi");
				
		Gun gun2 = new Gun();
		gun2.setRange(3521.9f);
		gun2.setMaxSize(2521);
		gun2.setMaterial("Steel");
		BulletDTO bullet2 = new BulletDTO();
		gun2.setBullet(bullet2);    //linking BulletDTO class with Gun class
		bullet2.setSize(265.255f);
		bullet2.setTypes((byte)2);
		bullet2.setWeight(153.985f);
		CompanyDTO company2 = new CompanyDTO();
		gun2.setCompany(company2);    //linking CompanyDTO with Gun class
		company2.setCompanyName("gyasvcbn");
		company2.setCountry("bchvc");
		company2.setFounder("nbhggfhv chg");
		
		//printing all the data
		GunDAO dao = new GunDAO();
		System.out.println("printing all the data"+"\n");
		
		dao.add(gun);
		dao.add(gun1);
		dao.add(gun2);		
		
		dao.getAll();
		
		//updating
		Gun res = dao.updateSizeByRange(36231.215f, 2122);
		System.out.println("\n"+"updated range in BulletDTO class"+"\n"+res);
		
		//deleting
		String res1 = dao.deleteByWeight(153.985f);
		System.out.println("\n"+"deleted data using weight"+"\n"+res1);
		
	}
}

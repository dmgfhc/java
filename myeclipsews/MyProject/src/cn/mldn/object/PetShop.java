package cn.mldn.object;

class PetShop {
	
	private Link pets = new Link();
	
	public void add(Pet pet) {
		this.pets.add(pet);
	}
	
	public void delete(Pet pet) {
		this.pets.remove(pet);
	}
	
	public Link search(String keyword) {
		
		Link result = new Link();
		
		Object obj[] = this.pets.toArray();
		
		for(int x=0;x<obj.length;x++) {
			
			Pet p = (Pet)obj[x];
			
			if(p.getName().contains(keyword)) {
				
				result.add(p);
			}
		}
		
		return result;
	}
	
	
}

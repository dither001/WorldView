package model.entity;

import model.IDamageSource;
import model.IPotion;
import model.IPotionEffect;

public interface IEntityLiving {
	
	// stats
	boolean addStat(Object FIX_ME);

	// items
	Object getHeldItem(); // FIXME
	
	
	// potions
	boolean isPotionActive(IPotion potion);
	
	IPotionEffect addActivePotionEffect(IPotionEffect effect);
	IPotionEffect getActivePotionEffect(IPotionEffect effect);
	IPotionEffect removePotionEffect(int id);
	
	boolean attackEntityFrom(IDamageSource source);
}

package model.block;

import model.world.IEntity;

public interface IBlocka {

	boolean setId(short aId);

	boolean setDisplayName(String aDisplayName);

	boolean setLiquid(boolean aLiquid);

	boolean setAttachmentAllowed(boolean aAttachmentAllowed);

	boolean setReplacementAllowed(boolean aReplacementAllowed);

	boolean setHardness(int aHardness);

	boolean setSupportRequired(boolean aSupportRequired);

	boolean setWater(boolean aWater);

	boolean setGrass(boolean aGrass);

	boolean setIce(boolean aIce);

	boolean setTranslucent(boolean aTranslucent);

	boolean setDoubleSided(boolean aDoubleSided);

	boolean setShadowCasting(boolean aShadowCasting);

	boolean setWaving(boolean aWaving);

	boolean setLuminance(byte aLuminance);

	boolean setPenetrable(boolean aPenetrable);

	boolean setTargetable(boolean aTargetable);

	boolean setClimbable(boolean aClimbable);

	boolean setMass(float aMass);

	boolean setDebrisOnDestroy(boolean aDebrisOnDestroy);

	boolean setFriction(float aFriction);

	boolean setRestitution(float aRestitution);

	boolean setKeepActive(boolean aKeepActive);

	boolean setEntity(IEntity aEntity);

	boolean setLifecycleEventsRequired(boolean aLifecycleEventsRequired);

	boolean setDirectPickup(boolean aDirectPickup);

	boolean setStackable(boolean aStackable);

	short getId();

	/**
	 * BlockUri uri;
	 */
	String getDisplayName();

	/**
	 * BlockFamily family; Rotation rotation = Rotation.none(); PROPERTIES Overall
	 * behavioural
	 */
	boolean getLiquid();

	boolean getAttachmentAllowed();

	boolean getReplacementAllowed();

	int getHardness();

	boolean getSupportRequired();

	/**
	 * EnumBooleanMap<Side> fullSide = new EnumBooleanMap<>(Side.class); BlockSounds
	 * sounds; Special rendering flags (TODO: clean this up)
	 */
	boolean getWater();

	boolean getGrass();

	boolean getIce();

	/**
	 * Rendering related BlockMeshGenerator meshGenerator = new
	 * BlockMeshGeneratorSingleShape(this);
	 */
	boolean getTranslucent();

	boolean getDoubleSided();

	boolean getShadowCasting();

	boolean getWaving();

	byte getLuminance();

	/**
	 * Vector3f tint = new Vector3f(0, 0, 0); Collision related
	 */
	boolean getPenetrable();

	boolean getTargetable();

	boolean getClimbable();

	/**
	 * Physics
	 */
	float getMass();

	boolean getDebrisOnDestroy();

	float getFriction();

	float getRestitution();

	/**
	 * Entity integration Prefab prefab;
	 */
	boolean getKeepActive();

	IEntity getEntity();

	boolean getLifecycleEventsRequired();

	/**
	 * Inventory settings
	 */
	boolean getDirectPickup();

	boolean getStackable();

}
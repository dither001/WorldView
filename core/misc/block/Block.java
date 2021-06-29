/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/

package model.block;

import model.world.IEntity;

// line 5 "../../block.ump"
public class Block implements IBlocka {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Block Attributes
	private short id;
	private String displayName;
	private boolean liquid;
	private boolean attachmentAllowed;
	private boolean replacementAllowed;
	private int hardness;
	private boolean supportRequired;
	private boolean water;
	private boolean grass;
	private boolean ice;
	private boolean translucent;
	private boolean doubleSided;
	private boolean shadowCasting;
	private boolean waving;
	private byte luminance;
	private boolean penetrable;
	private boolean targetable;
	private boolean climbable;
	private float mass;
	private boolean debrisOnDestroy;
	private float friction;
	private float restitution;
	private boolean keepActive;
	private IEntity entity;
	private boolean lifecycleEventsRequired;
	private boolean directPickup;
	private boolean stackable;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Block(short aId, boolean aLiquid, boolean aReplacementAllowed, boolean aSupportRequired, boolean aWater,
			boolean aGrass, boolean aIce, boolean aTranslucent, boolean aDoubleSided, boolean aWaving, byte aLuminance,
			boolean aPenetrable, boolean aClimbable, boolean aKeepActive, boolean aLifecycleEventsRequired,
			boolean aDirectPickup) {
		id = aId;
		displayName = "Untitled block";
		liquid = aLiquid;
		attachmentAllowed = true;
		replacementAllowed = aReplacementAllowed;
		hardness = 3;
		supportRequired = aSupportRequired;
		water = aWater;
		grass = aGrass;
		ice = aIce;
		translucent = aTranslucent;
		doubleSided = aDoubleSided;
		shadowCasting = true;
		waving = aWaving;
		luminance = aLuminance;
		penetrable = aPenetrable;
		targetable = true;
		climbable = aClimbable;
		mass = 10;
		debrisOnDestroy = true;
		friction = 0.5f;
		restitution = 0.0f;
		keepActive = aKeepActive;
		entity = null;
		lifecycleEventsRequired = aLifecycleEventsRequired;
		directPickup = aDirectPickup;
		stackable = true;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	@Override
	public boolean setId(short aId) {
		boolean wasSet = false;
		id = aId;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setDisplayName(String aDisplayName) {
		boolean wasSet = false;
		displayName = aDisplayName;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setLiquid(boolean aLiquid) {
		boolean wasSet = false;
		liquid = aLiquid;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setAttachmentAllowed(boolean aAttachmentAllowed) {
		boolean wasSet = false;
		attachmentAllowed = aAttachmentAllowed;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setReplacementAllowed(boolean aReplacementAllowed) {
		boolean wasSet = false;
		replacementAllowed = aReplacementAllowed;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setHardness(int aHardness) {
		boolean wasSet = false;
		hardness = aHardness;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setSupportRequired(boolean aSupportRequired) {
		boolean wasSet = false;
		supportRequired = aSupportRequired;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setWater(boolean aWater) {
		boolean wasSet = false;
		water = aWater;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setGrass(boolean aGrass) {
		boolean wasSet = false;
		grass = aGrass;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setIce(boolean aIce) {
		boolean wasSet = false;
		ice = aIce;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setTranslucent(boolean aTranslucent) {
		boolean wasSet = false;
		translucent = aTranslucent;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setDoubleSided(boolean aDoubleSided) {
		boolean wasSet = false;
		doubleSided = aDoubleSided;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setShadowCasting(boolean aShadowCasting) {
		boolean wasSet = false;
		shadowCasting = aShadowCasting;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setWaving(boolean aWaving) {
		boolean wasSet = false;
		waving = aWaving;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setLuminance(byte aLuminance) {
		boolean wasSet = false;
		luminance = aLuminance;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setPenetrable(boolean aPenetrable) {
		boolean wasSet = false;
		penetrable = aPenetrable;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setTargetable(boolean aTargetable) {
		boolean wasSet = false;
		targetable = aTargetable;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setClimbable(boolean aClimbable) {
		boolean wasSet = false;
		climbable = aClimbable;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setMass(float aMass) {
		boolean wasSet = false;
		mass = aMass;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setDebrisOnDestroy(boolean aDebrisOnDestroy) {
		boolean wasSet = false;
		debrisOnDestroy = aDebrisOnDestroy;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setFriction(float aFriction) {
		boolean wasSet = false;
		friction = aFriction;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setRestitution(float aRestitution) {
		boolean wasSet = false;
		restitution = aRestitution;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setKeepActive(boolean aKeepActive) {
		boolean wasSet = false;
		keepActive = aKeepActive;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setEntity(IEntity aEntity) {
		boolean wasSet = false;
		entity = aEntity;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setLifecycleEventsRequired(boolean aLifecycleEventsRequired) {
		boolean wasSet = false;
		lifecycleEventsRequired = aLifecycleEventsRequired;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setDirectPickup(boolean aDirectPickup) {
		boolean wasSet = false;
		directPickup = aDirectPickup;
		wasSet = true;
		return wasSet;
	}

	@Override
	public boolean setStackable(boolean aStackable) {
		boolean wasSet = false;
		stackable = aStackable;
		wasSet = true;
		return wasSet;
	}

	@Override
	public short getId() {
		return id;
	}

	/**
	 * BlockUri uri;
	 */
	@Override
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * BlockFamily family; Rotation rotation = Rotation.none(); PROPERTIES Overall
	 * behavioural
	 */
	@Override
	public boolean getLiquid() {
		return liquid;
	}

	@Override
	public boolean getAttachmentAllowed() {
		return attachmentAllowed;
	}

	@Override
	public boolean getReplacementAllowed() {
		return replacementAllowed;
	}

	@Override
	public int getHardness() {
		return hardness;
	}

	@Override
	public boolean getSupportRequired() {
		return supportRequired;
	}

	/**
	 * EnumBooleanMap<Side> fullSide = new EnumBooleanMap<>(Side.class); BlockSounds
	 * sounds; Special rendering flags (TODO: clean this up)
	 */
	@Override
	public boolean getWater() {
		return water;
	}

	@Override
	public boolean getGrass() {
		return grass;
	}

	@Override
	public boolean getIce() {
		return ice;
	}

	/**
	 * Rendering related BlockMeshGenerator meshGenerator = new
	 * BlockMeshGeneratorSingleShape(this);
	 */
	@Override
	public boolean getTranslucent() {
		return translucent;
	}

	@Override
	public boolean getDoubleSided() {
		return doubleSided;
	}

	@Override
	public boolean getShadowCasting() {
		return shadowCasting;
	}

	@Override
	public boolean getWaving() {
		return waving;
	}

	@Override
	public byte getLuminance() {
		return luminance;
	}

	/**
	 * Vector3f tint = new Vector3f(0, 0, 0); Collision related
	 */
	@Override
	public boolean getPenetrable() {
		return penetrable;
	}

	@Override
	public boolean getTargetable() {
		return targetable;
	}

	@Override
	public boolean getClimbable() {
		return climbable;
	}

	/**
	 * Physics
	 */
	@Override
	public float getMass() {
		return mass;
	}

	@Override
	public boolean getDebrisOnDestroy() {
		return debrisOnDestroy;
	}

	@Override
	public float getFriction() {
		return friction;
	}

	@Override
	public float getRestitution() {
		return restitution;
	}

	/**
	 * Entity integration Prefab prefab;
	 */
	@Override
	public boolean getKeepActive() {
		return keepActive;
	}

	@Override
	public IEntity getEntity() {
		return entity;
	}

	@Override
	public boolean getLifecycleEventsRequired() {
		return lifecycleEventsRequired;
	}

	/**
	 * Inventory settings
	 */
	@Override
	public boolean getDirectPickup() {
		return directPickup;
	}

	@Override
	public boolean getStackable() {
		return stackable;
	}

	public void delete() {
	}

	@Override
	// line 60 "../../block.ump"
	public String toString() {
		return "";
	}

}
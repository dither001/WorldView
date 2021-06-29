package model.block;

public interface IMaterialLogic {

	boolean isOpaque();
	boolean setIsOpaque(boolean bool);

	boolean setBurning(boolean bool);
	boolean setNoPushMobility(boolean bool);
	boolean setReplaceable(boolean bool);
}

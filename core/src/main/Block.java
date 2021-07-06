package main;

public class Block {

	public static final String GAS = "gas";
	public static final String LIQUID = "liquid";
	public static final String SOLID = "solid";
	
	/* temperature */
	String phaseState;
	float boilingPoint, condensation; // liquid-gas
	// boiling point of water is 100 C
	float freezingPoint, meltingPoint; // solid-liquid
	float flashPoint, autoignition; // T at which vapors will burn
	// "fire point" is generally +10 C
	// flash point of wood is approximately 300 C

	/* mechanical properties */
	float brittleness, plasticity; // e.g. glass, concrete, ceramics, etc.
	float ductility; // i.e. malleability
	float durability;
	float elasticity; // o.e. squash & stretch
	float flexibility;
	float hardness; // e.g. Moh's scale

	float roughness; // i.e. surface roughness, friction coefficient
	float stiffness;
	float toughness;
	float viscosity; // spec. fluid "thickness"

}

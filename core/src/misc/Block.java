package misc;

public class Block {

	public static final String GAS = "gas";
	public static final String LIQUID = "liquid";
	public static final String SOLID = "solid";
	
	/* chemical */
	float corrosionResist;
	
	/* electrical */
	float electricalResist;
	
	/* temperature */
	float conductivity; // used to determine refractory quality
	
	String phaseState;
	float boilingPoint, condensation; // liquid-gas
	// boiling point of water is 100 C
	float freezingPoint, meltingPoint; // solid-liquid
	float flashPoint, autoignition; // T at which vapors will burn
	// "fire point" is generally +10 C
	// flash point of wood is approximately 300 C
	
	/* mechanical properties */
	float durability; // resistance to wear & tear
	float roughness; // i.e. surface roughness, friction coefficient

	/* */
	float brittleness; // e.g. glass, concrete, ceramics, etc.
	float ductility; // i.e. malleability
	float elasticity, plasticity; // (opposites) i.e. squash & stretch
	float flexibility;
	float hardness; // turns out to be more complex than Moh's scale

	float stiffness;
	float toughness;
	float viscosity; // spec. fluid "thickness"

}

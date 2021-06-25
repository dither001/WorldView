package world.block;

public class Material {

	String roughness;
    float density;      // density (kg/m3) "compactness"

	// interactions
    float porosity;     // (liquid) porosity ratio (0 to 1)
    float diffusivity;  // vapor diffusivity ratio (0 to 1)
	
	// heat
	float conductivity; // heat conductivity (W/m2 K)
    
    // light
    float absorptance; // solar absorptance
}

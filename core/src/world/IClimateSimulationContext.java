package world;

public interface IClimateSimulationContext {

	float[][] getHeightmap();

	int getSize();

	float[][] initDist(String fromWhat);

	float[][] distanceFrom(String fromWhat, float heightInfluence);

}
package game;

public class GameContext {
	private boolean systemsInitialized;

	// class ChunkSlot;
	// class Player;
	// class VoxelEditor;
	// class Chunk;
	// class ChunkManager;

//	static void initializeSystems();
//    static void registerTexturesForLoad();
//    static void getTextureHandles();
//
//    static void saveState();
//    static void savePlayerState();
//
//    static void clickDragRay(ChunkManager* chunkManager, Player* player, bool isBreakRay);
//    static void scanWSO(ChunkManager* chunkManager, Player* player);
//    static void onQuit();
//    static void endSession();
//
//    static class VoxelEditor* voxelEditor;
//
//    static bool gameInitialized;
//    static float fogStart, fogEnd;
//    static class WSOAtlas* wsoAtlas;
//    static class WSOScanner* wsoScanner;
//    static class vg::TextureCache* textureCache;

	void initializeSystems() {
		if (systemsInitialized == false) {
//	        voxelEditor = new VoxelEditor();
//	        wsoAtlas = new WSOAtlas();
//	        wsoAtlas->load("Data\\WSO\\test.wso");
//	        wsoScanner = new WSOScanner(wsoAtlas);
//	        textureCache = new vg::TextureCache();

			systemsInitialized = true;
		}
	}

	void registerTexturesForLoad() {
		// texturePackLoader->registerTexture("FarTerrain/location_marker.png");
		// texturePackLoader->registerTexture("FarTerrain/terrain_texture.png",
		// &vg::SamplerState::LINEAR_WRAP_MIPMAP);
		// texturePackLoader->registerTexture("FarTerrain/normal_leaves_billboard.png");
		// texturePackLoader->registerTexture("FarTerrain/pine_leaves_billboard.png");
		// texturePackLoader->registerTexture("FarTerrain/mushroom_cap_billboard.png");
		// texturePackLoader->registerTexture("FarTerrain/tree_trunk_1.png");
		// texturePackLoader->registerTexture("Blocks/Liquids/water_normal_map.png",
		// &vg::SamplerState::LINEAR_WRAP_MIPMAP);

		// texturePackLoader->registerTexture("Sky/StarSkybox/front.png");
		// texturePackLoader->registerTexture("Sky/StarSkybox/right.png");
		// texturePackLoader->registerTexture("Sky/StarSkybox/top.png");
		// texturePackLoader->registerTexture("Sky/StarSkybox/left.png");
		// texturePackLoader->registerTexture("Sky/StarSkybox/bottom.png");
		// texturePackLoader->registerTexture("Sky/StarSkybox/back.png");

		// texturePackLoader->registerTexture("FarTerrain/water_noise.png",
		// &vg::SamplerState::LINEAR_WRAP_MIPMAP);
		// texturePackLoader->registerTexture("Particle/ball_mask.png");

		// texturePackLoader->registerTexture("GUI/crosshair.png");

	}

	void getTextureHandles() {
	}

	void saveState() {
		savePlayerState();
		// saveOptions();
		// voxelWorld->getChunkManager().saveAllChunks();
	}

	void savePlayerState() {
		// fileManager.savePlayerFile(player);
	}

	void onQuit() {
		// GLuint st = SDL_GetTicks();
		saveState();
	}

	void endSession() {
		onQuit();
		// _CrtDumpMemoryLeaks();
	}
}

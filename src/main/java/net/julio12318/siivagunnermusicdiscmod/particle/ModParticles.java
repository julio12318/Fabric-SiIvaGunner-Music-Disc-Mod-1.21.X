package net.julio12318.siivagunnermusicdiscmod.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.julio12318.siivagunnermusicdiscmod.SiIvaGunnerMusicDiscMod;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType GRAND_STAR_PARTICLE =
            registerParticle("grand_star_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType BLUE_NOTE_PARTICLE =
            registerParticle("blue_note_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType GREEN_NOTE_PARTICLE =
            registerParticle("green_note_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType MISSINGNO_FRAGMENT_PARTICLE =
            registerParticle("missingno_fragment_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType SORRIZO1_PARTICLE =
            registerParticle("sorrizo1_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType SORRIZO2_PARTICLE =
            registerParticle("sorrizo2_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType SORRIZO3_PARTICLE =
            registerParticle("sorrizo3_particle", FabricParticleTypes.simple());
    public static final SimpleParticleType WINTERFES_FLAKE_PARTICLE =
            registerParticle("winterfes_flake_particle", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(SiIvaGunnerMusicDiscMod.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        SiIvaGunnerMusicDiscMod.LOGGER.info("Registering Particles for " + SiIvaGunnerMusicDiscMod.MOD_ID);

    }
}

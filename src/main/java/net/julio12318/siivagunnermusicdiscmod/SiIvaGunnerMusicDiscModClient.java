package net.julio12318.siivagunnermusicdiscmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.julio12318.siivagunnermusicdiscmod.particle.BlueNoteParticle;
import net.julio12318.siivagunnermusicdiscmod.particle.GrandStarParticle;
import net.julio12318.siivagunnermusicdiscmod.particle.GreenNoteParticle;
import net.julio12318.siivagunnermusicdiscmod.particle.Sorrizo1Particle;
import net.julio12318.siivagunnermusicdiscmod.particle.Sorrizo2Particle;
import net.julio12318.siivagunnermusicdiscmod.particle.Sorrizo3Particle;
import net.julio12318.siivagunnermusicdiscmod.particle.MissingnoFragmentParticle;
import net.julio12318.siivagunnermusicdiscmod.particle.WinterfesFlakeParticle;
import net.julio12318.siivagunnermusicdiscmod.particle.ModParticles;

public class SiIvaGunnerMusicDiscModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.GRAND_STAR_PARTICLE, GrandStarParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLUE_NOTE_PARTICLE, BlueNoteParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_NOTE_PARTICLE, GreenNoteParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SORRIZO1_PARTICLE, Sorrizo1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SORRIZO2_PARTICLE, Sorrizo2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SORRIZO3_PARTICLE, Sorrizo3Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MISSINGNO_FRAGMENT_PARTICLE, MissingnoFragmentParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.WINTERFES_FLAKE_PARTICLE, WinterfesFlakeParticle.Factory::new);
    }
}

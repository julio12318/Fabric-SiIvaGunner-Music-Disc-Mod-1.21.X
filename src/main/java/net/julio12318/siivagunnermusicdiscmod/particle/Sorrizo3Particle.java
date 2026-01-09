package net.julio12318.siivagunnermusicdiscmod.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class Sorrizo3Particle extends SpriteBillboardParticle {
    public Sorrizo3Particle(ClientWorld clientWorld, double x, double y, double z, SpriteProvider spriteProvider, double xSpeed, double ySpeed, double zSpeed) {
        super(clientWorld, x, y, z, xSpeed, ySpeed, zSpeed);
        this.velocityMultiplier = 0.66F;
        this.ascending = true;
        this.velocityX *= xSpeed;
        this.velocityY *= ySpeed;
        this.velocityZ *= zSpeed;
        this.velocityY += 0.2;
        this.scale *= 1.5F;
        this.maxAge = 6;
        this.setSpriteForAge(spriteProvider);
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new Sorrizo3Particle(world, x, y, z, this.spriteProvider, velocityX, velocityY, velocityZ);
        }
    }
}

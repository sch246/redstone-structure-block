package com.sch246.rsb.mixin;

import com.sch246.rsb.Redstonestructureblock;
import net.minecraft.block.StructureBlock;
import net.minecraft.block.entity.StructureBlockBlockEntity;
import net.minecraft.scoreboard.ScoreAccess;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(StructureBlock.class)
public class StructureBlockMixin {
    @ModifyArgs(
            method = "doAction",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/block/entity/StructureBlockBlockEntity;saveStructure(Z)Z"
            )
    )
    private void modifySaveStructure(Args args, ServerWorld world, StructureBlockBlockEntity blockEntity) {
        ScoreAccess scoreAccess = Redstonestructureblock.getOrCreateScoreAccess(world);
        args.set(0, scoreAccess.getScore() > 0);
    }
}
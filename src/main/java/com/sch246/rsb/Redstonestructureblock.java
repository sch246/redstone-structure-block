package com.sch246.rsb;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.scoreboard.*;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Redstonestructureblock implements ModInitializer {
	private static final String MOD_ID = "redstone-structure-block";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			getOrCreateScoreAccess(server.getOverworld());
		});
	}

	public static String ruleObjName = "rules.redstoneSaveStructureBlock";
	public static String ruleName = "#";
	public static ScoreAccess getOrCreateScoreAccess(ServerWorld world) {
		ServerScoreboard scoreboard = world.getScoreboard();
		ScoreboardObjective objective = scoreboard.getNullableObjective(ruleObjName);
		if (objective == null) {
			objective = scoreboard.addObjective(
					ruleObjName,
					ScoreboardCriterion.DUMMY,
					Text.of(ruleObjName),
					ScoreboardCriterion.DUMMY.getDefaultRenderType(),
					false,
					null
			);
		}
		ScoreAccess scoreAccess = scoreboard.getOrCreateScore(
				ScoreHolder.fromName(ruleName),
				objective
		);
		scoreAccess.setScore(scoreAccess.getScore());
		return scoreAccess;
	}
}
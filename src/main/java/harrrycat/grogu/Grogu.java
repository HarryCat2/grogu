package harrrycat.grogu;

import harrrycat.grogu.entity.GroguEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Grogu implements ModInitializer {
	public static final String MOD_ID = "grogu";

	public static Identifier id(String path)
	{
		return Identifier.of(MOD_ID, path);
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final EntityType<GroguEntity> GROGU_ENTITY = entityType(
			id("grogu"),
			EntityType.Builder.create(GroguEntity::new, SpawnGroup.MISC)
			                  .dimensions(0.35f, 0.65f)
	);
	public static final TagKey<Item> CAN_LGM_EAT = TagKey.of(RegistryKeys.ITEM, id("grogu_can_eat"));



	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(GROGU_ENTITY, GroguEntity.createMobAttributes().add(EntityAttributes.MAX_HEALTH, Integer.MAX_VALUE));

		LOGGER.info("Little Green Menace has initialized");
	}
	public static <T extends Entity> EntityType<T> entityType(Identifier registryKey, EntityType.Builder<T> builder)
	{
		return Registry.register(
				Registries.ENTITY_TYPE,
				registryKey,
				builder.build(RegistryKey.of(RegistryKeys.ENTITY_TYPE, registryKey))
		);
	}
}
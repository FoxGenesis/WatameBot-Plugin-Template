package my.plugin;

import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.configuration2.PropertiesConfiguration;

import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.foxgenesis.watame.ProtectedJDABuilder;
import net.foxgenesis.watame.WatameBot;
import net.foxgenesis.watame.plugin.Plugin;

/**
 * @author Ashley
 *
 */
public class PluginTemplate extends Plugin {

	@Override
	protected void onPropertiesLoaded(Properties properties) {}

	@Override
	protected void onConfigurationLoaded(String identifier, PropertiesConfiguration properties) {}

	@Override
	public void preInit() {

	}

	@Override
	public void init(ProtectedJDABuilder builder) {

	}

	@Override
	public void postInit(WatameBot bot) {

	}

	@Override
	public void onReady(WatameBot bot) {

	}

	@Override
	public void close() throws Exception {

	}

	@Override
	public Collection<CommandData> getCommands() { return Set.of(); }
}

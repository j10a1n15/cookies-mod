package codes.cookies.mod.config.categories;

import codes.cookies.mod.config.CookiesOptions;
import codes.cookies.mod.translations.TranslationKeys;
import com.teamresourceful.resourcefulconfig.api.annotations.Category;
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigButton;
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigInfo;
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigOption;
import com.teamresourceful.resourcefulconfig.api.types.entries.Observable;

@ConfigInfo(
		title = "Development"
)
@Category("dev")
public class DevCategory {

	@CookiesOptions.Translatable(TranslationKeys.CONFIG_DEV_HIDE_CONSOLE_SPAM)
	@ConfigEntry(id = "hide_console_spam")
	public static boolean hideConsoleSpam = true;

	@CookiesOptions.Seperator(TranslationKeys.CONFIG_DEV_REPO)
	@CookiesOptions.Translatable(TranslationKeys.CONFIG_DEV_DATA_REPO)
	@ConfigEntry(id = "data_repo")
	public static String dataRepo = "cookies-mod/data";

	@CookiesOptions.Translatable(TranslationKeys.CONFIG_DEV_DATA_REPO_BRANCH)
	@ConfigEntry(id = "data_repo_branch")
	public static String dataRepoBranch = "main";

}

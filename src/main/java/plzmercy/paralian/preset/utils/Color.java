package plzmercy.paralian.preset.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Color {

    // HEX Color chat color by using #applyColor("
    private final Pattern hexPattern = Pattern.compile("<#([A-Fa-f0-9]){6}>");
    public String applyColor(String message){
        Matcher matcher = hexPattern.matcher(message);
        while (matcher.find()) {
            final ChatColor hexColor = ChatColor.valueOf(matcher.group().substring(1, matcher.group().length() - 1));
            final String before = message.substring(0, matcher.start());
            final String after = message.substring(matcher.end());
            message = before + hexColor + after;
            matcher = hexPattern.matcher(message);
        }
        return color(message);
    }

    // Color any message by using #color("&9Some &aSome message");
    public String color(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public void console(String message){
        Bukkit.getServer().getConsoleSender().sendMessage(color(message));
    }
}

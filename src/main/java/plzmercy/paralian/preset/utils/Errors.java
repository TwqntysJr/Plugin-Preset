package plzmercy.paralian.preset.utils;

public enum Errors {

    CONSOLE_ONLY(new Color().color("&7[&4!&7] &6This command can only be used in the console")),
    PLAYERS_ONLY(new Color().color("&7[&4!&7] &6This command can only be used by players")),
    NO_PERM(new Color().color("&7[&4!&7] &6You do not have any permissions to execute this command. If you believe this is a mistake, please contact a staff member")),
    PLAYER_NOT_FOUND(new Color().color("&7[&4!&7] &6The player was not found."));

    private String error;

    Errors(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}

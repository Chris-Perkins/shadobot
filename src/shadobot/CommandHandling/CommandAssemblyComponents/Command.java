package shadobot.CommandHandling.CommandAssemblyComponents;

import sx.blah.discord.handle.obj.IMessage;

public abstract class Command {
    public boolean check(IMessage message){
        return true;
    }

    /*public abstract void execute(Object... objects) throws RateLimitException,DiscordException,
    MissingPermissionsException;*/
}
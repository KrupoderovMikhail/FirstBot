package com.krupoderov.discordbot.commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/* Создание ссылки приглашения на текущий сервер */
public class InviteCommand extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        int timeString = 3600;
        String[] message = event.getMessage().getContentRaw().split(" ");
        if (message[0].equalsIgnoreCase("$invite") && message.length == 1) {
            event.getChannel().sendMessage("To use $invite do: $invite create").queue();
        } else if (message.length >= 2 && message[0].equalsIgnoreCase("$invite") && message[1].equalsIgnoreCase("create")) {
            event.getChannel().sendMessage("Hey " + event.getAuthor().getName() + "! You have to invite someone? Cool!").queue();
            event.getChannel().sendMessage("Give them this invite link: " + event.getChannel().createInvite().setMaxAge(3600).complete().getURL()).queue();
            event.getChannel().sendMessage("The invite expires in: " + timeString + " seconds.").queue();
        }
    }
}

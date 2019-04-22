package com.krupoderov.discordbot.commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Calculate extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String[] message = event.getMessage().getContentRaw().split(" ");

        /* Команда калькулятор, умеет производить операции с двумя числами */
        if (message[0].equalsIgnoreCase("!calculate") && message.length == 1) {
            event.getChannel().sendMessage("To use this command, type(without brackets): !calculate [add/sub/mult/div] [first-num] [second-num]").queue();
        } else if (message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("add")) {
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + (num1 + num2)).queue();
        } else if (message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("sub")) {
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + (num1 - num2)).queue();
        } else if (message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("mult")) {
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + (num1 * num2)).queue();
        } else if (message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("div")) {
            int num1 = Integer.parseInt(message[2]);
            int num2 = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("Here is the result: " + (num1 / num2)).queue();
        }
    }
}

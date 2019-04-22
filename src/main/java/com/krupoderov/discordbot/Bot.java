package com.krupoderov.discordbot;

import com.krupoderov.discordbot.events.CategoryCreate;
import com.krupoderov.discordbot.events.HelloEvent;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class Bot {

    private static final String TOKEN = "NTY5ODg1Nzc2MTMzODgxODg2.XL3K3Q.J_sRe4cnPIIr9E06o-3cVyge1Uw";

    public static void main(String[] args) throws LoginException {

        JDA jda = new JDABuilder(TOKEN).build();

        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new CategoryCreate());
    }
}

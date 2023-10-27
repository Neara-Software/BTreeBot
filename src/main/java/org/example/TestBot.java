package org.example;

import dev.robocode.tankroyale.botapi.Bot;
import dev.robocode.tankroyale.botapi.BotInfo;

public class TestBot extends Bot {
    public TestBot() {
        super(BotInfo.fromFile("BTreeBot.json"));
    }

    @Override
    public void run() {
        while (isRunning()) {
            turnRight(45.0);
            turnGunLeft(360.0);
        }
    }
}

# Example Robocode Tank Royale Bot
This repository has an example bot written in Kotlin which is compatible with Java and the JVM, just with a nicer programming language.
It also has everything necessary to run as a host for a Robocode Tank Royale competition. So other bots can be packaged and dropped into the `bots` folder and it'll be picked up.

Ensure that you are familiar with the rules and anatomy of a tank. They're important to understanding the limitations of your tank.
https://robocode-dev.github.io/tank-royale/articles/anatomy.html

## Default competition rules
- Game type: Classic
- Arena size: 800x600
- Gun cooling rate: 0.1
- Number of rounds: 10
- Ready timeout (μs): 1,000,000
- Turn timeout (μs): 30,000

## Running as host
Unzip the included compiled sample bots
```bash
unzip sample-bots-java-0.19.2.zip -d $YourFolder
```

Run the host application
```bash
java -jar robocode-tankroyale-gui-0.19.2.jar
```

1. Go to `Config->Bot root directories` and add the $YourFolder
2. Start the server
3. Start game and set the mode to "classic", load all the bots you want to run and click start


## Building a bot and submitting to host
- Ensure that you set compatibility mode to JDK 11. You'll need to produce a jar file in the final deliverable
- Ensure that your bot includes a .json file with the same name as the jar. Example [here](./src/main/kotlin/org/example/BTreeBot.json). 
- Ensure that you have a .sh file with the command that would execute the jar file. See example [here](./BTreeBot/BTreeBot.sh)

Full instructions for the JVM is available in the official docs: https://robocode-dev.github.io/tank-royale/tutorial/jvm/my-first-bot-for-jvm.html

To build your tank in Kotlin, you could use this repo as a template:
1. In folder 'src/main/kotlin/org/example', add logic to 'BTreeBot.kt'.
2. Compile:
```
./gradlew shadowJar
```
The compiled BTreeBot.jar will be inside the BTreeBot folder. 

3. Send that BTreeBot folder to the host.
4. To test your bot, following the steps in Running as a host. And copy BTreeBot folder in $YourFolder.

## Competition agenda 
We'll run a series of rounds and use the scoring system built into Tank Royale to determine the winner. The general agenda would be:

### Introduction - ~20 mins
- Who Neara is and what we do
- What the competition is about and prizes that will be won
- The people who are helping from Neara's side

### Competition details - ~20 mins
- Going over this repository and how a game is run
- What is expected of your teams
- How scoring is done

### Breakout into teams - ~60 mins
- Team assignment and intro to each other 
- Formulate a strategy
- Read suggested documentation
- Build build build

### Test run - ~15 mins
- 1 hour into the team breakout, we'll get everyone's bot shipped and make sure everything's working

### Build build build - ~60 mins

### Round 1 - Feeling out the other bots
- Score not counted, just to get a feel for how people are building their bots

### Last Day
- Final preparations and we run the actual competition
- Judging, scoring and winner announcements

## Scoring details
Scoring will be done on several categories out of 10 by the Neara panel weighted accordingly to the following table:
| Category         | Description                                                                                                                                                                        | Weight |
|:---------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |:------ |
| Battle results   | Bot placing in Tank Royale. 10/10 for 1st place, 8/10 for second, 6/10 for third. Everyone else is 4/10                                                                            | 0.5    |
| Bot modularity   | The easier it is to modify the behaviour of your bot, the more points you get. Coding best practices and principles apply. Think data structures, algorithms and code cleanliness. | 0.3    |
| Code testability | How testable is your bot's code? Prove it with unit tests.                                                                                                                         | 0.2    |


## Requirements and references
- JDK 18 for this repo. The bot should be compiled down to JDK 11 for the final jar.
- https://robocode-dev.github.io/tank-royale/articles/anatomy.html
- https://github.com/robocode-dev/tank-royale

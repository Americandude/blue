# NitClient

name under consideration

## Overview

NitClient is a ghost client for Eaglercraft, it's still in development.


Client created by Nitwit, discord tag hooman#1196.


Eaglercraft created by LAX1DUDE, check his repo for discord: https://github.com/lax1dude/eaglercraft


## Checklist

- [x] Create Base Client
- [x] Create Keybind system
- [x] Create Event Listener stuff
- [x] Create test module
- [x] Add Flyhack
- [x] Add AutoSprint
- [x] Add Fullbright
- [x] Add WaterMark
- [x] Add half assed ArrayList
- [x] Add better half assed Arraylist
- [x] Remove coordinate and all the random shit on top left
- [x] Add Keybind section in readme
- [x] Add actually decent ArrayList
- [x] Add NoFall
- [x] Add Killaura
- [x] Add AutoWalk
- [x] Add Speed
- [x] Implement ClickGUI
- [x] Add Autoclicker
- [ ] Add Aimassist
- [ ] Add Reach
- [x] Add Velocity
- [ ] Add FastBow
- [ ] Add Regen
- [ ] Add more movement modules
- [ ] Add rainbow wave thing to arraylist
- [ ] Improve ui
- [ ] Finish Client
- [ ] Start making a blatant client


~~- [ ] Add Commands~~ Canceled


## Keybinds

Fly: F

Fullbright: M

AutoSprint: J

NoFall: G

Killaura: K 

AutoWalk: L

Speed: B

Velocity: V

ClickGUI: P

Autoclicker: O
AutoclickerNew: I

## Installation

### small brain installation

1. just download what's in the javascript folder, delete the loop that checks for local file opening, and then run index.html

### big brain installation

1. Install vscode, eclipse, IntelliJ IDEA, or the IDE of your choice.


2. Run `git clone https://github.com/ThisIsALegitUsername/ghost-client-v2.git`


2a. **Only applies if you're using linux** Run `chmod +x gradlew`


3. Run `./gradlew teavm`


4. If you're using vscode, install the extension "live server," go to the javascript folder, right click on `index.html`, and click "Open with Live Server"


4a. I'm unsure about the process for other IDES, but a surefire way to open is to go into the javascript folder, click on `index.html`, remove the loop that checks for local file opening, download everything in javascript and paste it into the same folder, and finally open `index.html`.


## Progress Log

**Times In MST**

**7/05/2022**


 1:04PM 

 `Created Repo and added README.md`


1:05-1:32PM

 `gradle was being a pain in the ass and I had to fix it`


1:33AM-2:20PM

 `HOLY SHIT I DELETED THE OLD REPO FOR NOTHING I FIXED THE BUG IT WAS EASY AND I ALSO FINISHED BASE CLIENT` (for context i was basically done with the base client and then it errored so i thought i had to start over.)

2:00-2:30PM 

`added keybind system thing`

6:00-7:00PM

 `finished lots of stuff: Events, fixed Keybind, updated Module and Client class, created event listeners and added event check every tick, added test module`


 **07/06/2022**

 6:50-7:50AM (why is developing a client my entire fucking life now)

 `I spent an hour of my life writing 12 lines of code and debugging it`

 8:30-8:50AM 

 `add autosprint (J) how did it take me that long wtf`

 9:00-10:46AM

 `added module list, thx @yeetmanlord for helping me fix my code lol`

 1:40-1:52PM

 `change license and other stuff text`

 3:00-3:19PM

 `add fullbright module, make category enum look better`

 **07/07/2022**

 7:46-7:48AM

 `update readme checklist`

 1:30-3:36PM

 `lmfao i spent 3 hours trying to get the modules to render on the right side of the screen, the reason it took so long was because i had to fix a shitty error that had a very simple solution, but it was hard to debug. also added fps counter removed coordinate thing :D`

4:10-4:36PM

`Finished ArrayList, made it sort from greatest to least bc im too lazy to reorder modules.add`

4:50-5:16PM

`added color to some stuff and also a shadow`

7:20-7:56PM

`Fixed fly, made sprint bypass, add nofall, shorten code for module sorting in arraylist`

8:05-8:10PM

`make enums better`

**07/08/2022**

1:00-2:03PM

`add killaura`

4:13-4:33PM

`Add Speed and AutoWalk`

4:35-4:48PM

`add Velocity`

**07/09/2022**

10:40-11:45AM

`try to add clickgui, it's broken but i'm commiting in case i fuck up`

**07/10/2022**

`i spent all day on the clickgui getting it to work and it didn't`

**07/11/2022**

11:00-12:00PM

`postpone clickgui and add autoclicker`

12:00-2:05

`when you spend 6+ hours of your life debugging an error only to realize it's because you put the code in the wrong order anyway FINALLY ADDED CLICKGUI (you can't close it im working on fix)`

2:50-3:00PM

`make clickgui closeable`

4:10-4:40PM

`add settings gui for a few module`

### Contribution
Feel free to make a pull request, it's best if you add me on discord and tell me what you changed, since I don't have the time to sift through hundreds of files.

**Client status**:  
- [ ] Broken
- [x] Working
- [ ] N/A

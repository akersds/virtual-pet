
VirtualPet

Set up

[] In Git Bash mkdir virtual-pet.
[] cd into the virtual-pet directory
[] copy and paste curl https://raw.githubusercontent.com/WeCanCodeIT/gradle-scripts/master/basic-junit/build.gradle --output build.gradle
[] type ls to make sure that you see a build.gradle inside of virtual-pet
[] type gradle eclipse to finish set up of your project in bash
[] in Eclipse, import existing project into workspace
[] Create a README.md file in your project folder to describe what you’ve done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you’d like to learn more about Markdown formatting, check out the Github Markdown Guide.)
[] Create a GitHub repository also named virtual-pet and set it up so that you can push your code there from your Eclipse project. Do this now. It’s the least fun part, so just get it out of the way.


Classes

[] create a VirtualPet class.
[] create a VirtualPetApp class with a main method.
[] Stretch goal create a VirtualPetTest class to build out unit tests on the behaviors placed in VirtualPet
[] You should house your project in a properly named package…something other than the default package


Details
[] Create a virtual pet application. This is your version of a Tamagotchi or DigiPet! This might seem like a daunting task, but we can break it down.

[] Think of which instance variables and methods you will need. We give suggestions below. Remember that instance variables represent the state of your pet. Methods represent the behavior of your pet, which would include its responses to you feeding or playing with it.

[] Most games include what is called a game loop, a loop which updates everything in the game, representing the passage of time. We exit this loop when something happens that should cause the game to end. Include a tick() method (think clocks, not parasites) in your VirtualPet class representing the passage of a unit of time. This should do things like update instance variables of VirtualPet that are time dependent, such as hunger or thirst. You should call the tick() to represent the passage of time after each interaction with the user.

[] There is always some confusion with this tick() method. It has some flexibility, what you are doing is changing the properties of your Virtual Pet at some rate in this method…every time this method is called, those properties specified in this method would update.

Ideas

Attributes (instance variables) that a virtual pet might have, along with some ideas for activities (methods) that might address them are:

[] hunger (feed it)
[] thirst (water it)
[] waste (let it out to the bathroom)
[] boredom (play with it)
[] sickness (take it to the doctor)
Your methods should cause the appropriate instance variables to update - for instance, if you have a feed() method, it might make hunger go down, but make thirst go up.


Attributes that might update when tick() is called:

[] boredom increasing
[] hunger increasing
[] sleepiness increasing

If you play with the pet, perhaps that makes it more tired. Have fun with this part! Tip: You can use your README.md file to keep a list of features you’d like to incorporate.

Also, remember that more features != better. Pick a focus for your pet. Maybe go with a theme.

Your user interface should live in the main method of the VirtualPetApp class. Your VirtualPet class should not be writing messages to the console or reading user input. These are responsibilities of the VirtualPetApp class.

An example user interface is below (yours doesn’t need to match this!):

Horace the Hippo
Hunger: 27
Thirst: 5
Boredom: 5
Tiredness: 50

What do you want to do?
1. Feed Horace
2. Water Horace
3. Play with Horace
4. Put Horace to sleep
5. Do nothing

> 1

[] You feed Horace.
[] Required Tasks
[] VirtualPet class
[] Create a tick() method that represents the passage of time.
[] Create at least three instance variables (aka attributes aka properties aka fields).
[] Create at least three methods (messages you send to your pet).
[] VirtualPetApp class
[] Create a main method that…
[] implements a game loop.
[] asks for user input.
[] writes output to the console.

Grade
Category	Max Score
[] tick() method	12
[] first instance variable	8
[] second VirtualPet instance variable	8
[] third VirtualPet instance variable	8
[] first VirtualPet method	8
[] second VirtualPet method	8
[] third VirtualPet method	8
[] implement game loop	12
[] ask for user input	9
[] write output to the console	9
[] style/formatting/code quality 10
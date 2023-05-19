# java-term-project-elenallebrez
### Author: Elena Fernández-Llebrez / UVUS: LMX8564

This project works with a dataset that takes information to compare the home runs of two baseball's brightest starts using a new technology called Statcast. 
The colummns of the dataset are chose to meet the parameters of this project.

## Structure of the project
<ul>
  <li>/scr Folder: contains all the modules with the functions and tests </li>
    <ul>
      <li>baseball: contains the elements</li>
      <li>test: contains the test functions</li>
      <li>utils</li>
    </ul>
  </li>
  <li>/data Folder: contains the dataset</li>
  <ul>
      <li>judge.csv : dataset</li>
    </ul>
</ul>

## Data structure
The dataset can be obtained form this URL: https://www.kaggle.com/datasets/sarmadriaz/a-new-era-of-data-analysis-in-baseball. However, it has been modified to fit the conditions of the term project.
The columns are the follwings:
- type: is the type of thrown
- date: The date when the match has taken place
- speed: the speed of the ball thrown
- player: name of the player who throw the ball
- event: how the thrown counts
- description: describing more detailed the event
- zone: the zone where has the ball fell
- p_throws: the hand which is used to throw the ball, it can be right or left
- home_team: the name of the local team
- away_team: the name of the away team

## Implemented types
### Properties
- type: of type Types , getter and setter, indicates the type of the thrown ball
- date: of type LocalDate, getter and setter, it is the date when the match was played
- speed: of type Double, getter and setter, the speed of the ball thrown
- player: of type String, getter and setter, the name of the player
- event: of type String, getter and setter, how the thrown counts
- description: of type String, getter and setter, describing more detailed the event
- zone: of type Integer, getter and setter,  the zone where has the ball fell
- p_throws: of type Boolean, getter and setter, the hand which is used to throw the ball, it can be right or left, when it is R is true, if it is L is false.
- home_team: of type String, getter and setter, the name of the local team
- away_team: of type String, getter and setter, the name of the away team
### Derived properties
- getTotalDescription(): of type List<String>, is a list which contain the event, home and away team.
  
### Constructors
- Baseball: Contains all the properties
- Baseball1: Contains type, date, player, event, home_team, away_team

### Restrictions
- setSpeed: the speed can't be lower than 0
- setAway_team: the away and home team can't be the same

### Equality criteria
They are equals when they have the same date and event

### Natural order
They are ordered by date, and then by the name of the player

### Other methods
- String to String: Returns a string with some information

## Enum type
- Types: FF, SL,FT,CH, CU, FC, SI,KC, FS, KN

## Factory (BaseballFactory)
This type is used to create objects of type Baseball.
- readBaseball(String fileName): is used to read the csv file
- parseLine(String line): from each line of the dataset, it creates an object of type Baseball

## Container Type - Baseball2 
#### Constructors:
- C1: Creates an empty collection.
- C2: Creates an object of type matches from the previous constructor
- C3: creates an object of type matches from a stream

#### Equality
Two matches are when they contain the same matches

#### Other operation
- public Set<Baseball> getSetBaseball()
- int sizematches(), it returns the number of lines that the csv has
- void addmatches(Baseball b), it is used to add an object
- void addcollectionmatches(List<Baseball> b), it is used to add an entire list
- void removemotches(Baseball b),  it is removed to add an object
- Integer counterevent(String event), it counts how many times a team has been a home team
- Boolean fastSpeed(Double speed), it returns true if there is any speed greater than the given one
- List<String> playerWiThrows(Types type), it returns the TotalDescription of all the matches that has the type given
- Map<String, Double> getTimesHomeTeam(), it returns a map with all the teams and the number of times that they have been home team
- Map<String, List<Double>> speedPlayers(), it return a map with the name of a player and a list of its speeds
-  fastSpeedS(Double speed), it returns true if there is any speed greater than the given one (Done with streams)
- countereventS(String homeTeam), it counts how many times a team has been a home team (Done with streams)
- List<Baseball> playerWiThrowsS(Types type),  it returns the TotalDescription of all the matches that has the type given (Done with streams)
- Double maxSpeed(), it returns the maximun speed
- List<Double> minSpeed2(), it returns the three minimums speeds (Done with streams)
- Map<String, Integer> getTimesHomeTeamS(), it returns a map with all the teams and the number of times that they have been home team (Done with streams)
- Map<String, List<Double>> speedPlayersS(), it returns a map with the name of a player and a list of its speeds (Done with streams)
- Map<Types, Double> minSpeedPerType(Integer year), it returns a map with the type and each minimum speed of the year given
- SortedMap<Double, List<Baseball>> getTopNSpeeds(int n), it return a map with n top speeds
- String getTeamWithMostHomeGames(), it returns the name of the team that has been more times home team

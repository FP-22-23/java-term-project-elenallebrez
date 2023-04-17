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
- type: 
- date: The date when the match has taken place
- speed: the speed of the home run
- player: name of the player who throw the ball
- event: how the thorwn counts
- description: describing more detailed the event
- zone: the zone where has the ball fall
- p_throws: the hand which is used to throw the ball, it can be right or left
- home_team: the name of the local team
- away_team: the name of the away team

## Implemented types
- type: Types
- date: LocalDate
- speed: Double
- player: String
- event: String
- description: String
- zone: Integer
- p_throws: Boolean
- home_team: String
- away_team: String

## Constructors
- Baseball: Contains all the properties
- Baseball1: Contains type, date, player, event, home_team, away_team

## Constraits
- setAway_team: the away and home team can't be the same

## Enum type
- Types: FF,SL,FT,CH,CU

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
- int sizematches()
- void addmatches()
- void addcollectionmatches(
- void removemotches()
- Integer counterevent(String event
- Boolean fastSpeed(Double speed)
- List<String> playerWiThrows(String player)
- Map<String, Double> getTimesHomeTeam()
- Map<String, List<Double>> speedPlayers()

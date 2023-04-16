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
- date: 
- speed: 
- player: 
- event: 
- description: 
- zone:
- p_throws: 
- home_team:
- away_team: 

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


## Container Type - Baseball2 

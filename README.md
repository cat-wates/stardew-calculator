# **Stardew Valley Crop Calculator**

This program is to help a Stardew Valley player understand how much profit they can potentially make from planting a given crop.

## **Inputs from the user**

  🥕 Initial balance
  
  🌽 Farming level
  
  🍅 Chosen professions based on farming level (tiller/agriculturist)
  
  🍇 Number of tiles
  
  🫐 The crop they want to check
  
  🥬 Whether they use a fertiliser (and the quality of it)
  
  🥔 Which seasonName they're wanting to check


## **Outputs in the console**

  🥕 The chosen crop
  
  🌽 Number of seeds
  
  🍅 Pierre's buying price
  
  🍇 Selling price (basic, silver, gold & iridium quality)
  
  🫐 Initial balance
  
  🥬 Minimum new balance (based on basic selling price and no fertiliser)
  
  🥔 Potential new balance (based on farmer level, professions & probability of each quality type)

# **How to run**

#####

Running with Docker

`docker compose up --build`

Running with Gradle

`./gradlew bootRun`- starts the Spring app on port `8080`

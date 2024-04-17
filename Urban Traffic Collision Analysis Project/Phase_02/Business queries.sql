#1. Number of Accidents in NYC, Austin, and Chicago

SELECT City, COUNT(*) AS Total_Accidents
FROM Crash_Fact 
JOIN Address_dim ON Crash_Fact.Address_SK = Address_dim.Address_SK
GROUP BY City;

#2. Areas with Greatest Number of Accidents For the top 3 areas in each city:
SELECT City, Street_name, COUNT(*) AS Total_Accidents
FROM Crash_Fact 
JOIN Address_dim ON Crash_Fact.Address_SK = Address_dim.Address_SK
GROUP BY City, Street_name
ORDER BY City, Total_Accidents DESC;

#3. Accidents Resulting in Just Injuries
#Overall:
SELECT COUNT(*) AS Injury_Accidents
FROM Crash_Fact
WHERE Injuries_without_death > 0 AND Fatality_count = 0;

#By city:
SELECT City, COUNT(*) AS Injury_Accidents
FROM Crash_Fact 
JOIN Address_dim ON Crash_Fact.Address_SK = Address_dim.Address_SK
WHERE Injuries_without_death > 0 AND Fatality_count = 0
GROUP BY City;

#4. Pedestrians Involved in Accidents
#Overall:
SELECT COUNT(*) AS Pedestrian_Accidents
FROM Crash_Fact
WHERE Pedestrians_fl > 0;

#By city:
SELECT City, COUNT(*) AS Pedestrian_Accidents
FROM Crash_Fact 
JOIN Address_dim ON Crash_Fact.Address_SK = Address_dim.Address_SK
WHERE Pedestrians_fl > 0
GROUP BY City;

#5 Seasonality Report This would require knowing the seasons in relation to the months. Assuming you have this information, you could group the data by season.
SELECT 
  CASE 
    WHEN Month IN ('December', 'January', 'February') THEN 'Winter'
    WHEN Month IN ('March', 'April', 'May') THEN 'Spring'
    WHEN Month IN ('June', 'July', 'August') THEN 'Summer'
    WHEN Month IN ('September', 'October', 'November') THEN 'Fall'
  END AS Season,
  COUNT(*) AS Total_Accidents
FROM Crash_Fact
JOIN Date_dim ON Crash_Fact.Date_SK = Date_dim.Date_SK
GROUP BY Season;

#6 Motorists Injured or Killed in Accidents Overall:
SELECT 
  SUM(Motorist_involvement_count) AS Motorist_Injuries,
  SUM(Fatality_count) AS Motorist_Fatalities
FROM Crash_Fact;

#By city:
SELECT 
  City,
  SUM(Motorist_involvement_count) AS Motorist_Injuries,
  SUM(Fatality_count) AS Motorist_Fatalities
FROM Crash_Fact 
JOIN Address_dim ON Crash_Fact.Address_SK = Address_dim.Address_SK
GROUP BY City;


#7  Top 5 Areas with Most Fatal Accidents For the top 5 areas in the 3 cities:
SELECT City, Street_name, COUNT(*) AS Fatal_Accidents
FROM Crash_Fact 
JOIN Address_dim ON Crash_Fact.Address_SK = Address_dim.Address_SK
WHERE Fatality_count > 0
GROUP BY City, Street_name
ORDER BY City, Fatal_Accidents DESC;


#8. Time-Based Analysis of Accidents
SELECT 
  Hour_of_the_day,
  COUNT(*) AS Total_Accidents
FROM Crash_Fact 
JOIN Time_dim ON Crash_Fact.Time_SK = Time_dim.Time_SK
GROUP BY Hour_of_the_day
ORDER BY Hour_of_the_day;

#9Fatality Analysis Are pedestrians killed more often than road users?
SELECT 
  SUM(Pedestrians_fatality_count) AS Pedestrian_Fatalities,
  SUM(Road_user_Fatality_count) AS Road_User_Fatalities
FROM Crash_Fact;

#10 Most Common Factors Involved in Accidents
SELECT 
  Contributing_factor,
  COUNT(*) AS Total_Occurrences
FROM Factor_fact
JOIN Contributing_factor_dim ON Factor_fact.Factor_SK = Contributing_factor_dim.Factor_SK
GROUP BY Contributing_factor
ORDER BY Total_Occurrences DESC
LIMIT 5;

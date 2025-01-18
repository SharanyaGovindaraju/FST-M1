# Import webdriver from selenium
from ast import Assert
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")
    message  = driver.find_element(By.ID, "admin_options").text
    print("The first copyright text is " + message)

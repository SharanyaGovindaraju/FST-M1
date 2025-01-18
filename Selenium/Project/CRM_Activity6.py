# Import webdriver from selenium
from ast import Assert
import time
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")
   

    # Find the username field
    username = driver.find_element(By.XPATH, "//input[@id='user_name']")
    # Find the password field
    password = driver.find_element(By.XPATH, "//input[@id='username_password']")

    # Enter the given credentials
    # Enter username
    username.send_keys("admin")
    # Enter password
    password.send_keys("pa$$w0rd")

    # Find the login button
    login = driver.find_element(By.XPATH, "//input[@type='submit']")
    login.click()
    #Ensure that the “Activities” menu item exists
    driver.maximize_window()
    time.sleep(5)
    activitiesMenu = driver.find_element(By.ID, "grouptab_3").text
    print("The Menu has :" + activitiesMenu)
    Assert(activitiesMenu, "ACTIVITIES")

   
# Import webdriver from selenium
from ast import Assert
import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")
 
 # Find the username field
    username = driver.find_element(By.ID, "user_name")
    # Find the password field
    password = driver.find_element(By.ID, "username_password")

    # Enter the given credentials
    # Enter username
    username.send_keys("admin")
    # Enter password
    password.send_keys("pa$$w0rd")

    # Find the login button
    login = driver.find_element(By.XPATH, "//input[@type='submit']")
    login.click()

    #Function
    driver.maximize_window()
    time.sleep(2)

    salesMenu = driver.find_element(By.ID, "grouptab_0")
    salesMenu.click()
    
    leadsMenu = driver.find_element(By.ID, "moduleTab_9_Leads")
    leadsMenu.click()
    time.sleep(2)
    addDetIcon = driver.find_element(By.XPATH, "//span[@title='Additional Details']").click()
    time.sleep(2)
    mobileNum =driver.find_element(By.XPATH, "//span[@class='phone']").text
    print("The mobile number is :" + mobileNum)




    
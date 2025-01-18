# Import webdriver from selenium
from ast import Assert
from selenium import webdriver
from selenium.webdriver.common.by import By

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
    homePage = driver.find_element(By.ID, "tab0").text
    print("Home page has opened which has :" + homePage)
    Assert(homePage, "SUITECRM DASHBOARD");
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
    #//Get the color of navigation menu
    driver.maximize_window()
    time.sleep(5)
    menu_color = Color.from_string(driver.find_element(By.XPATH, "//div[@id='toolbar']").value_of_css_property("color"))
    print("Fifth heading colour as Hexcode: ", menu_color.hex)
    print("Fifth heading colour as RGB: ", menu_color.rgb)
    

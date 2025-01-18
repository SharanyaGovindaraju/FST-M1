# Import webdriver from selenium
from ast import Assert
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Chrome() as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")
    headerImage = driver.find_element(By.XPATH, "//div/img")
    actualUrl =headerImage.get_dom_attribute("src")
    print("The URL of image is " + actualUrl)

    expeUrl = "themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g"
    Assert(actualUrl, expeUrl)


#  ECommerce Testing Assignment - Selenium + Java

##  Overview
This project is an automated test suite for a dynamic e-commerce platform using Selenium WebDriver, Java, and TestNG. 

##  Features Implemented
- Dynamic homepage category detection
- Random category and product navigation
- Product selection and cart validation
- Simulated checkout flow using dummy user data
- Negative test: registration form validation with missing fields
- Automatic error logging and reporting
- CSV-based test data management

##  Tech Stack
- Java 17
- Selenium WebDriver 4.10
- TestNG 7.8
- Maven
- OpenCSV (for test data)
- WebDriverManager (for driver setup)

##  Project Structure
```
ECommerce_Testing_Assignment/
├── src/
│   ├── pages/         → Page Object Model classes
│   ├── tests/         → Test classes using TestNG
│   └── utils/         → Driver setup and CSV utility
├── screenshots/       → Captures upon validation failure
├── testdata.csv       → Dummy input data (email, names, etc.)
├── report.txt         → Execution summary and logs
├── pom.xml            → Maven project file
├── testng.xml         → TestNG test suite
├── README.md          → Project overview and instructions
```

##  How to Run
1. Ensure you have **Java 17** and **Maven** installed.
2. Download or clone the repository.
3. Run the following command from the project root:
   ```bash
   mvn clean test
   ```
4. Reports will be generated in the console and `report.txt`.

##  Sample Test Data (testdata.csv)
```
FirstName,LastName,Email,Password
John,Doe,johndoe@example.com,Password123
Jane,Smith,janesmith@example.com,SecurePass456
```

## 📓 Sample report.txt
```
---
Test Execution Summary
---
✔ Homepage category loaded successfully
✔ Random category opened
✔ At least 3 products visible
✖ Out of stock item detected: [Product Name]
✔ Cart updated successfully
✔ Registration form error validation triggered
✔ Screenshot captured: screenshots/error_validation.png
```


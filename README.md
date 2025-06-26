# ECommerce Testing Assignment

## Instructions
1. Install Java 17 and Maven.
2. Clone/download this project.
3. Run `mvn clean install`.
4. Execute via `testng.xml`.

##  Features Implemented
- Dynamic category navigation
- Product selection and cart validation
- Negative test for registration form
- Screenshot on failure (not fully implemented)
- External test data (CSV)

## Structure
- `src/pages` → Page Object classes
- `src/tests` → TestNG classes
- `src/utils` → Driver, CSV utils
- `testdata.csv` → Test input data
- `screenshots/` → Failures (if captured)
- `report.txt` → Execution summary

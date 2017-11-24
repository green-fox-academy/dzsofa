
# Java focus

## 0. Initialize a Spring Boot project in this folder
 - create a proper `.gitignore` file
 - use dependencies: `web`, `thymeleaf`, `mysql`

## 1. Frontend
- You should create only one template for the exercise

### The form
 - You should display a simple form to query a database, _don't waste time with design_
    - Create an input field in which the user can enter a licence plate, like `HMZ-140` or any part of the license plate (like `MZ-1`)
    - Create a button with the text `Search`
        - Clicking on the button should send a `get` request to the backend
        - The frontend should display the results from the DB.
    - Add two links next to the form:
        - `Police cars only` - Filter for cars only starting with the `RB` prefix
        - `Diplomats only` - Filter for cars only staring with `DT` prefix
        - if any of them is clicked list only the cars with the defined prefixed license plate

### Search results
 - Display the results from the database in a HTML `<table>` the following format for the query `HMZ`

```
| Licence plate | Brand   | Model | Color | Year |
| HMZ-140       | [Audi] | A8    | red   | 2016 |
| HMZ-555       | [BMW]  | Z4    | pink  | 2011 |
```

 - The app can display multiple rows of results since it should match partial queries as well
 - Clicking on the `brand` field should display all cars with the same type
    - So clicking on "Audi" should restart the search and list all cars from the database regardless of the original query that resulted with this list
 - If the user submits an invalid licence plate, like `HMZ-@#5` then display an error message instead of the table
    - Display message: `Sorry, the submitted licence plate is not valid`

## 2. Backend

### Checking input data

You should check all input submitted by the user (through the search form)! 
 - Only allow alphanumeric characters from the user: `[A-Z]`, `[0-9]` and the `-` dash symbol

For the licence plate lookup only:
 - Maximum length of the query is 7 characters

If the submitted data doesn't match any above criteria, display the error message detailed above (in the fronend part).

### Endpoints

You should create three endpoints:

#### GET `/search`

The licence plate data and the limiting filter options should be passed via query string.

Example query:

`http://localhost:8080/search?q=HMZ-140`
`http://localhost:8080/search?police=1`

 - use the `police` parameter to filter for police cars
 - use the `diplomat` parameter to filter for diplomat cars

The endpoint should render an HTML displaying the results.

#### GET `/search/{brand}`

This endpoint should return all the cars with the provided `brand`

Example query:

`http://localhost:8080/search/audi`

The endpoint should render an HTML displaying the results.

#### GET `/api/search/{brand}`

This endpoint should return all the cars with the provided `brand`

Example query:

`http://localhost:8080/api/search/audi`

##### Responses

The endpoint should return this data structure:

```json
{
    "result": "ok",
    "data": [
        {
            "plate": "HMZ-140",
            "car_brand": "Audi",
            "car_model": "A8",
            "year": 2016,
            "color": "red"
        },
        {
            "plate": "HMZ-555",
            "car_brand": "BMZ",
            "car_model": "Z4",
            "year": 2011,
            "color": "pink"
        }
    ]
}
```

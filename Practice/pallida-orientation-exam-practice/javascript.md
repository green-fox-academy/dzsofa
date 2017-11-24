
# JavaScript focus

## 0. Initialize an NPM package in this folder
 - create `.gitignore` file for `node_modules` directory
 - save your dependencies to the `package.json` file

## 1. Frontend

### The form
 - You should display a simple form to query a database, _don't waste time with design_
    - Create an input field in which the user can enter a licence plate, like `HMZ-140`
    - Create a button with the text `Query database`
        - Clicking on the button should start an AJAX call to the backend
        - The frontend should display the results from the DB.
    - Add two radio boxes (_since it doesn't make sense to combine them_):
        - Police cars only. Filter for cars only starting with the `RB` prefix
        - Diplomats only. Filter for cars only staring with `DT` prefix
    - Each time you restart the search, the previous results (if any) should be cleared

### Search results
 - Display the results from the backend in a HTML `<table>` the following format for the query `HMZ`

```
| Licence plate | Brand   | Model | Color | Year |
| HMZ-140       | [Audi] | A8    | red   | 2016 |
| HMZ-555       | [BMW]  | Z4    | pink  | 2011 |
```

 - The app can display one or multiple rows of results since it should match partial queries as well
 - Clicking on the `Brand` field should restart the search and display all cars with the same type
    - So clicking on "Audi" should restart the search and list all cars from the database regardless of the original query that resulted with this list
 - If the user submits an invalid licence plate, like `HMZ-@#5` then display an error message instead of the table
    - This happens when the response JSON from the server has the `result` property set to `error`
    - Display message: `Sorry, the submitted licence plate is not valid`

## 2. Backend

### Validation

You should validate all input submitted by the user! 
 - Only allow alphanumeric characters from the user: `[A-Z]`, `[0-9]` and the `-` dash symbol

For the licence plate lookup only:
 - Maximum length of the query is 7 characters

If the submitted data doesn't match any above criteria, respond with the following JSON:

`{ "result": "error", "message": "invalid input" }`

### Endpoints

You should create two endpoints:

#### GET `/search`

The licence plate data and the limiting filter options should be passed via query string.

Example query:

`http://localhost:8080/search?q=HMZ-140&police=1`

 - use the `police` parameter to filter for police cars
 - use the `diplomat` parameter to filter for diplomat cars

#### GET `/search/:brand`

This endpoint should return all the cars with the provided brand in query parameter

Example query:

`http://localhost:8080/search/audi`

#### Responses

Both endpoint should return the same data structure:

```javascript
{
    "result": "ok",
    "data": [
        {
            licence: 'HMZ-140',
            brand: 'Audi',
            model: 'A8',
            year: 2016,
            color: 'red'
        },
        {
            licence: 'HMZ-555',
            brand: 'BMZ',
            model: 'Z4',
            year: 2011,
            color: 'pink'
        }
    ]
}
```

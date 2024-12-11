# Weather App (Console-Based)

## Overview
The **Weather App** is a console-based application built with Kotlin. It allows users to fetch real-time weather data for any city using the OpenWeather API. The app leverages the Retrofit library for efficient API integration and demonstrates clean Kotlin programming practices.

## Features
- Get real-time weather updates for any city.
- Displays temperature, weather conditions, humidity, and wind speed.
- Simple and intuitive command-line interface.

## Technologies Used
- **Kotlin**: Programming language used for building the application.
- **OpenWeather API**: Provides real-time weather data.
- **Retrofit**: Networking library used for API requests.

## Prerequisites
Before running the app, ensure you have the following:
- Kotlin installed on your system.
- An API key from [OpenWeather API](https://openweathermap.org/api).

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/aditya1741/weather-app.git
   cd weather-app
   ```

2. Add your OpenWeather API key:
    - Locate the `Constants.kt` file.
    - Replace `YOUR_API_KEY` with your actual OpenWeather API key:
      ```kotlin
      const val API_KEY = "YOUR_API_KEY"
      ```

3. Build the project:
   ```bash
   kotlinc -include-runtime -d WeatherApp.jar src/*.kt
   ```

4. Run the application:
   ```bash
   java -jar WeatherApp.jar
   ```

## Usage
1. Launch the application.
2. Enter the name of the city for which you want the weather data.
3. View the weather details, including temperature, humidity, and weather conditions.

## Project Structure
```
weather-app/
├── src/
│   ├── Main.kt         # Main entry point of the application
│   ├── Constants.kt    # Stores constant values like the API key and base URL
│   └── WeatherService.kt # Defines the Retrofit service interface
├── build/             # Compiled Kotlin classes
└── README.md         # Project documentation
```

## Example Output
```
Welcome to the Weather App!
Enter the name of the city: London

Fetching weather data for London...

City: London
Temperature: 15.0 °C
Condition: Clear sky
Humidity: 78%
Wind Speed: 5.4 m/s
```

## Dependencies
- **Retrofit**: Add the following dependencies in your Gradle file:
  ```gradle
  implementation 'com.squareup.retrofit2:retrofit:2.9.0'
  implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
  ```

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Submit a pull request with detailed changes.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Acknowledgments
- [OpenWeather API](https://openweathermap.org/api) for providing weather data.
- [Retrofit](https://square.github.io/retrofit/) for seamless API integration.


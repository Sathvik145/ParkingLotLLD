# 🚗 Parking Lot Low-Level Design (LLD) in Java

This project is a **beginner-friendly** Low-Level Design (LLD) implementation of a **Parking Lot System** in Java.  
It follows Object-Oriented Programming principles and includes concepts like Inheritance, Enums, the Singleton Pattern, and basic thread safety.

---

## 🧠 Features

- Supports multiple **vehicle types**: `Car`, `Bike`, `Truck`
- Vehicles can be **parked** and **unparked**
- **Multiple levels**, each with multiple parking spots
- Simple **Singleton design pattern** for the Parking Lot
- Basic **multithreading support** using `synchronized` blocks
- Clean, modular structure for easy understanding and extension

---

## 🏗️ Class Design

### 1. `Vehicle` (Abstract Class)
- Base class for all vehicle types
- Fields: `licensePlate`, `vehicleType`
- Subclasses: `Car`, `Bike`, `Truck`

### 2. `VehicleType` (Enum)
- Enum to represent different types of vehicles

### 3. `ParkingSpot`
- Represents a single parking spot
- Tracks if it's occupied and by which vehicle
- Thread-safe with synchronized `park()` and `unpark()` methods

### 4. `Level`
- Represents a level in the parking lot
- Manages a list of `ParkingSpot` objects
- Handles parking and unparking within that level

### 5. `ParkingLot` (Singleton)
- Ensures only one instance of the parking lot exists
- Manages multiple levels
- Exposes methods to park/unpark vehicles

### 6. `Main`
- Demonstrates usage of the parking lot system

---

## 💻 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/parking-lot-LLD.git
   cd parking-lot-LLD

#Kristopher Kuenning
#06/01/2025
#CSD-402
#M1: Programming Assignment

# Program to calculate the energy needed to heat water from an initial temperature to a final temperature.

# Get input from the user
water_mass = float(input("Enter the amount of water in kilograms: "))
initial_temperature = float(input("Enter the initial temperature of the water (in Celsius): "))
final_temperature = float(input("Enter the final temperature of the water (in Celsius): "))

# Define the specific heat capacity of water in joules per kilogram per degree Celsius
specific_heat_capacity = 4184  # in J/kg°C

# Calculate the energy required using the formula Q = mass * (finalTemperature - initialTemperature) * specific_heat_capacity
energy_needed = water_mass * (final_temperature - initial_temperature) * specific_heat_capacity

# Output the result
print(f"The energy needed to heat the water is {energy_needed} Joules.")

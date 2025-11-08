# Notes:

## Strategy 

The Strategy design pattern is used to define a family of algorithms or behaviors, encapsulate each one, and make them interchangeable. In the classic Duck example, instead of putting flying and quacking behaviors directly into the Duck class (which causes problems since not all ducks fly or quack), these behaviors are separated into different strategy classes like FlyWithWings or FlyNoWay. This allows each duck to choose or change its behavior at runtime, promoting flexibility, reusability, and cleaner code that follows the open/closed principle.

<img width="902" height="567" alt="image" src="https://github.com/user-attachments/assets/2400958c-d195-4249-bc76-138602fde388" />
<img width="902" height="587" alt="image" src="https://github.com/user-attachments/assets/bd1a22d5-9705-4081-a30c-f1da111b8035" />

## Observer

The Observer design pattern is used when one object (the subject) needs to automatically notify and update multiple other objects (observers) whenever its state changes. In the Weather Monitoring Station example, the weather data (temperature, humidity, pressure) acts as the subject, and different display elements like the current conditions display, statistics display, or forecast display are observers. When the weather data changes, it automatically notifies all registered observers so they can update their displays. This pattern helps achieve loose coupling between the data source and its dependents, allowing new displays to be added or removed easily without modifying the weather data class.

Loose coupling means designing components or classes so they have minimal dependencies on each other. In other words, each part of the system can change or be replaced without heavily affecting others. This makes the code more flexible, easier to maintain, and more reusable.


<img width="942" height="549" alt="image" src="https://github.com/user-attachments/assets/e9cb07b9-7bdf-4216-acd2-6468da4225a6" />
<img width="911" height="677" alt="image" src="https://github.com/user-attachments/assets/07019c60-652b-4116-8004-0d3d47f74620" />
<img width="926" height="636" alt="image" src="https://github.com/user-attachments/assets/719b2472-a28d-48e8-979b-78e4ec5e8248" />
<img width="935" height="614" alt="image" src="https://github.com/user-attachments/assets/51eb54b4-fe4b-40ac-bd07-08e08bbb425e" />


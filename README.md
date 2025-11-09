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
<img width="912" height="586" alt="image" src="https://github.com/user-attachments/assets/ac17c324-8059-4072-8c0d-cf3cf5596029" />
<img width="945" height="417" alt="image" src="https://github.com/user-attachments/assets/71f741ef-6772-4c50-b19f-7fc6527ebe65" />
<img width="926" height="636" alt="image" src="https://github.com/user-attachments/assets/719b2472-a28d-48e8-979b-78e4ec5e8248" />
<img width="935" height="614" alt="image" src="https://github.com/user-attachments/assets/51eb54b4-fe4b-40ac-bd07-08e08bbb425e" />

## Decorator

The Decorator design pattern allows behavior to be added to individual objects dynamically without modifying their original code. In the Coffee Decorating example, a base component like PlainCoffee provides the core functionality (e.g., cost and description), and decorators such as Milk, Sugar, or WhippedCream wrap the coffee object to add extra features or modify its behavior. Each decorator adds its own cost and description while keeping the same interface, allowing flexible combinations like “Coffee with milk and sugar.” This pattern promotes open/closed design — classes are open for extension but closed for modification.

<img width="890" height="661" alt="image" src="https://github.com/user-attachments/assets/6855b50f-3a25-4e4c-84b9-b6bd653c0746" />
<img width="706" height="664" alt="image" src="https://github.com/user-attachments/assets/10ff72aa-4b2b-4536-b0a1-0e5fd4d112bc" />
<img width="902" height="661" alt="image" src="https://github.com/user-attachments/assets/ff13fa07-689e-4ddb-b0e5-b24ebe0547b2" />
<img width="901" height="378" alt="image" src="https://github.com/user-attachments/assets/e17bb90d-0ae7-49f4-a272-aed79a521ccb" />
<img width="943" height="709" alt="image" src="https://github.com/user-attachments/assets/33592d72-756e-4762-88f0-76dced823bd0" />
<img width="914" height="623" alt="image" src="https://github.com/user-attachments/assets/b3ebb15e-a04b-4ef7-ad11-b3c40609cb1f" />
<img width="914" height="592" alt="image" src="https://github.com/user-attachments/assets/72a3ffd1-f6d1-4199-a509-d75186bed07d" />
<img width="913" height="517" alt="image" src="https://github.com/user-attachments/assets/91d7abaf-65e4-4935-b9d9-245e715d264f" />
<img width="951" height="686" alt="image" src="https://github.com/user-attachments/assets/b7343b21-d9f2-4098-ac93-b0adfdef0568" />




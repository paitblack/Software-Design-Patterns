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

## Factory (Simple Factory, Factory Method, Abstract Factory)

The Factory design pattern is used to create objects without specifying their exact class in the code. In the Pizza Store example, instead of directly instantiating different pizza types like CheesePizza, VeggiePizza, or PepperoniPizza inside the store, a factory (e.g., PizzaFactory) is responsible for creating the appropriate pizza object based on the order type. The store simply asks the factory for a pizza and then bakes, cuts, and boxes it. This approach centralizes object creation, makes the code easier to maintain, and allows new pizza types to be added without changing the main store logic — following the open/closed principle.

<img width="697" height="490" alt="image" src="https://github.com/user-attachments/assets/95f56c45-cd2e-4593-a3d2-59f61e32751b" />
<img width="668" height="318" alt="image" src="https://github.com/user-attachments/assets/5fb3720b-f24a-4c8d-9823-98a0e35639a7" />
<img width="693" height="288" alt="image" src="https://github.com/user-attachments/assets/97024956-1fe0-49ed-b64f-1ea49cae93a9" />
<img width="690" height="308" alt="image" src="https://github.com/user-attachments/assets/c9900ae7-43a0-437d-a165-6c2ff61baaf2" />
<img width="678" height="485" alt="image" src="https://github.com/user-attachments/assets/0c017c79-8e0c-4e60-adc9-0d3a0e0dd7d0" />
<img width="670" height="451" alt="image" src="https://github.com/user-attachments/assets/d12cb18a-b7e0-4a00-88d3-1565f4db1f7e" />
<img width="691" height="216" alt="image" src="https://github.com/user-attachments/assets/000f434c-3796-4dc0-8590-4fc8009c69f1" />
<img width="666" height="442" alt="image" src="https://github.com/user-attachments/assets/5fd67978-cb98-4cdc-97f0-9f7e5c1dbeec" />
<img width="572" height="531" alt="image" src="https://github.com/user-attachments/assets/7fc94eb6-b89f-4e21-8b39-8ebd351a6ed4" />
<img width="665" height="301" alt="image" src="https://github.com/user-attachments/assets/29e869ea-6e31-4489-81d3-c40a93881aac" />
<img width="663" height="532" alt="image" src="https://github.com/user-attachments/assets/8839a2f3-b9e6-4c40-aa4f-458a0c0a23b9" />
<img width="675" height="477" alt="image" src="https://github.com/user-attachments/assets/c7457b69-14cf-49d7-b130-33bc5cdccfdd" />

## Singleton

<img width="697" height="510" alt="image" src="https://github.com/user-attachments/assets/0436d111-6fcb-4c83-9499-eeb0eb80246e" />

## Adapter  

Adapter Design Pattern allows classes with incompatible interfaces to work together by converting the interface of an existing class into one that the client expects. In the Duck–Turkey example, when we want to use a Turkey object where a Duck is expected, we introduce an Adapter class. This adapter implements the Duck interface while internally holding a Turkey object. Method calls like quack() are translated into gobble(), and fly() is adapted to match the turkey’s flying behavior. As a result, client code can treat the adapted object as a Duck without knowing whether it is actually a duck or a turkey, increasing flexibility and reusability.  

<img width="1184" height="684" alt="image" src="https://github.com/user-attachments/assets/a8812c26-7fd5-49d5-ab9f-22cb239d5fd1" />
<img width="1116" height="661" alt="image" src="https://github.com/user-attachments/assets/9f4e8fc2-052d-403e-9881-b4f6a9c8f589" />
<img width="1170" height="646" alt="image" src="https://github.com/user-attachments/assets/88877be4-5476-4e8f-9338-99af55b6903c" />

## Facade

Facade Design Pattern provides a simplified interface to a complex subsystem. In the Home Theatre example, the system consists of multiple components such as an amplifier, DVD player, projector, lights, and sound system, all of which must be coordinated in a specific order. The Facade class offers high-level methods like watchMovie() or endMovie() that handle these interactions internally. This allows the client to control the entire home theatre with a single method call, without needing to understand the details of how the individual components work together, thereby reducing complexity and coupling.  

<img width="1033" height="685" alt="image" src="https://github.com/user-attachments/assets/a618516d-4d84-4f06-941a-042fbe9cbbf8" />
<img width="950" height="707" alt="image" src="https://github.com/user-attachments/assets/6dcad653-b37d-4f38-964d-8b6577cf3333" />

## Template Method  

Template Method Pattern defines the skeleton of an algorithm in a base class and lets subclasses override specific steps of the algorithm without changing its overall structure. In the coffee–tea example, a superclass such as CaffeineBeverage contains a template method like prepareRecipe(), which outlines the steps: boiling water, brewing the beverage, pouring it into a cup, and optionally adding condiments. While the steps for boiling water and pouring into a cup are common, the brewing and condiment-adding steps differ between coffee and tea. Therefore, subclasses like Coffee and Tea implement these steps in their own way (e.g., brewing coffee grounds or steeping tea leaves). This pattern promotes code reuse while ensuring that the overall preparation process remains consistent.

<img width="903" height="650" alt="image" src="https://github.com/user-attachments/assets/5ff949de-0868-4e37-9418-2089ce3a9360" />
<img width="918" height="675" alt="image" src="https://github.com/user-attachments/assets/9976620d-b42c-4b12-ba90-c1c3534aad14" />
<img width="904" height="616" alt="image" src="https://github.com/user-attachments/assets/c5cfe565-d58e-419d-8f84-29815dbaa5e6" />
<img width="829" height="679" alt="image" src="https://github.com/user-attachments/assets/fb6b292b-dcc0-4b59-98b6-db680ccf7b62" />
<img width="910" height="604" alt="image" src="https://github.com/user-attachments/assets/152ef7d0-9414-46e1-b8c9-5ef4365de376" />
<img width="932" height="636" alt="image" src="https://github.com/user-attachments/assets/b6ad4cb2-ae0d-4cc0-9517-3012172ccd64" />
<img width="876" height="495" alt="image" src="https://github.com/user-attachments/assets/756bb59d-21c7-4703-9fc1-133ced0dc7a1" />
<img width="873" height="573" alt="image" src="https://github.com/user-attachments/assets/21b6240b-15e9-4216-ae61-344378296e4f" />

## Iterator

Iterator Design Pattern provides a way to access the elements of a collection sequentially without exposing its underlying representation. In the menu example, different menus (such as PancakeHouseMenu using an array and DinerMenu using a list) may store their menu items in different data structures. By implementing a common Iterator interface, each menu can provide its own iterator to traverse its items. The client code (for example, a Waitress class) uses these iterators to go through menu items and print or process them without knowing how the menus are internally implemented. This pattern improves flexibility and decouples the client from concrete collection types.  

<img width="835" height="456" alt="image" src="https://github.com/user-attachments/assets/5c1fc461-913f-4c20-ad0c-7bb1e4c8729a" />
<img width="877" height="615" alt="image" src="https://github.com/user-attachments/assets/8b529b8c-ede3-4e78-9521-3a324b86c45c" />
<img width="862" height="663" alt="image" src="https://github.com/user-attachments/assets/8ab418f3-7774-4e0f-a1f6-f218d4e120d5" />
<img width="837" height="607" alt="image" src="https://github.com/user-attachments/assets/aca13681-91cc-46ab-98de-ae788868345a" />
<img width="926" height="688" alt="image" src="https://github.com/user-attachments/assets/18de30a0-8f01-408d-9694-5adf716fa729" />


















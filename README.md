# Notes:

## Strategy 

The Strategy design pattern is used to define a family of algorithms or behaviors, encapsulate each one, and make them interchangeable. In the classic Duck example, instead of putting flying and quacking behaviors directly into the Duck class (which causes problems since not all ducks fly or quack), these behaviors are separated into different strategy classes like FlyWithWings or FlyNoWay. This allows each duck to choose or change its behavior at runtime, promoting flexibility, reusability, and cleaner code that follows the open/closed principle.

<img width="902" height="567" alt="image" src="https://github.com/user-attachments/assets/2400958c-d195-4249-bc76-138602fde388" />
<img width="902" height="587" alt="image" src="https://github.com/user-attachments/assets/bd1a22d5-9705-4081-a30c-f1da111b8035" />



# Proyecto Separador de Texto (Patrones de Diseño - UAM Azc)

Este proyecto implementa una aplicación de consola en Java que permite dividir un texto en letras, palabras o líneas, utilizando el patrón de diseño **Strategy Pattern + MVC**.

---

## 📐 Patrón de Diseño: Strategy Pattern + MVC 

### 🔸 Modelo (`model/`)
Contiene la lógica de negocio y la estructura de datos.

- `Text.java`: representa el texto a dividir. Contiene los métodos `getString()`, `setString()`, y `split()`.
- `ISeparator.java`: interfaz que define el método `separate()`.
- `LetterSeparator.java`: divide el texto letra por letra.
- `WordSeparator.java`: divide el texto por palabras.
- `LineSeparator.java`: divide el texto por líneas.

### 🔸 Controlador (`controller/`)
Gestiona la interacción entre la Vista y el Modelo.

- `TextController.java`: configura el texto, asigna el tipo de separador y ejecuta la operación `split()`.

### 🔸 Vista (`view/`)
Interfaz con el usuario.

- `ConsoleView.java`: muestra opciones por consola, recibe entrada del usuario y muestra los resultados.

### 🔸 Aplicación (`app/`)
Contiene el punto de entrada del programa.

- `Main.java`: ejecuta la aplicación instanciando la vista.

---

## 📁 Estructura del Proyecto
```
src/
├── model/
│   ├── Text.java
│   ├── Separator.java
│   ├── LetterSeparator.java
│   ├── WordSeparator.java
│   └── LineSeparator.java
│
├── controller/
│   └── TextController.java
│
├── view/
│   └── ConsoleView.java
│
└── app/
    └── Main.java
```



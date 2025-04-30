# 🍩 ChurroFactory

Un proyecto en Java que simula una fábrica de churros utilizando el patrón de diseño **Chain of Responsibility**. A través de una cadena de manejadores (`Handlers`), se determina qué tipo de ingrediente puede ser procesado por cada etapa de la producción.

---

## 🎯 Objetivo

Implementar y demostrar el uso del **patrón de diseño Chain of Responsibility** mediante un ejemplo sencillo y didáctico: una línea de producción de churros donde diferentes tipos de ingredientes son manejados por componentes especializados.

Este proyecto busca reforzar conceptos de programación orientada a objetos, diseño limpio y principios SOLID, como la **responsabilidad única** y la **abierta/cerrada**.

---

## ⚙️ Funcionalidad

- Cada tipo de ingrediente es enviado a través de una cadena de responsabilidad.
- Los manejadores verifican si pueden procesar el ingrediente:
  - `ChurroHandler`: procesa ingredientes comunes (`REGULAR_INGREDIENT`)
  - `SoftChurroHandler`: procesa ingredientes suaves (`SOFT_INGREDIENT`)
  - `HardChurroHandler`: procesa ingredientes duros (`HARD_INGREDIENT`)
- Si un manejador no puede procesar el ingrediente, lo pasa al siguiente en la cadena.
- Si ninguno puede manejarlo, se muestra un mensaje indicando que es inválido.

## 🛠️ Tecnologías usadas

- Java 17+
- IntelliJ IDEA
- POO (Programación Orientada a Objetos)
- Patrón de diseño: Chain of Responsability

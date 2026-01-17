## 1. S (Single Responsibility)
Un módulo debe tener una única razón para cambiar. Debe ser responsable de un solo usuario o interesado del sistema.

**No coloque métodos que cambian por diferentes razones en la misma clase**

# 2. O (Open-Closed)
Los sistemas de software deben diseñarse de manera que su comportamiento pueda cambiarse agregando nuevo código, **en lugar de modificar el código existente**

# 3. L (Liskov Substitution)
Para construir sistemas a partir de partes intercambiables, estas deben cumplir un **contrato** que permita sustituirlas sin problemas

# 4. I (Interface Segregation)
Se debe evitar depender de interfaces que no se utilizan. **Es mejor tener muchas interfaces pequeñas y específicas que una sola muy general**

# 5. D (Dependency Inversion)
Las clases importantes no deben depender de clases concretas.
Un módulo debe depender de interfaces y de clases abstractas, y no de implementaciones volátiles.

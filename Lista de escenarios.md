# Ejercicio 14 - Cálculo de descuento utilizando TDD

## Suposiciones

- El sistema recibe el valor de un producto y un porcentaje de descuento.
- El porcentaje de descuento válido debe ser mayor a 0 y menor o igual a 100.
- El sistema regresa únicamente el valor correspondiente al descuento aplicado.
- El sistema no regresa el precio final del producto después de aplicar el descuento.
- Si el valor del producto es menor o igual a 0, el sistema regresa 0.
- Si el porcentaje de descuento es inválido, el sistema regresa 0.

## Lista de escenarios

### Escenario 1 - Precio mayor a cero

El valor del producto es mayor a cero y el porcentaje de descuento es válido.

**Datos de prueba:**
- Precio del producto: 100.00
- Porcentaje de descuento: 20%
- Resultado esperado: 20.00

**Resultado:**
El sistema calcula y regresa correctamente el valor correspondiente al descuento.

---

### Escenario 2 - Precio menor a cero

El valor del producto es menor a cero.

**Datos de prueba:**
- Precio del producto: -100.00
- Porcentaje de descuento: 20%
- Resultado esperado: 0.00

**Resultado:**
El sistema no realiza el cálculo del descuento y regresa 0.

---

### Escenario 3 - Precio igual a cero

El valor del producto es igual a cero.

**Datos de prueba:**
- Precio del producto: 0.00
- Porcentaje de descuento: 20%
- Resultado esperado: 0.00

**Resultado:**
El sistema regresa 0 debido a que no existe un valor de producto sobre el cual calcular el descuento.

---

### Escenario 4 - Porcentaje de descuento igual a cero

El valor del producto es mayor a cero, pero el porcentaje de descuento es 0%.

**Datos de prueba:**
- Precio del producto: 100.00
- Porcentaje de descuento: 0%
- Resultado esperado: 0.00

**Resultado:**
El sistema regresa 0 debido a que no existe un descuento para aplicar.

---

### Escenario 5 - Porcentaje de descuento negativo

El valor del producto es mayor a cero, pero el porcentaje de descuento es negativo.

**Datos de prueba:**
- Precio del producto: 100.00
- Porcentaje de descuento: -10%
- Resultado esperado: 0.00

**Resultado:**
El sistema considera el porcentaje de descuento como inválido y regresa 0.

---

### Escenario 6 - Descuento igual al 100%

El valor del producto es mayor a cero y el porcentaje de descuento es igual al 100%.

**Datos de prueba:**
- Precio del producto: 100.00
- Porcentaje de descuento: 100%
- Resultado esperado: 100.00

**Resultado:**
El sistema devuelve el valor completo del producto como importe del descuento.

---

### Escenario 7 - Descuento mayor al 100%

El valor del producto es mayor a cero, pero el porcentaje de descuento es superior al 100%.

**Datos de prueba:**
- Precio del producto: 100.00
- Porcentaje de descuento: 110%
- Resultado esperado: 0.00

**Resultado:**
El sistema considera el porcentaje de descuento como inválido y regresa 0.

---

### Escenario 8 - Precio y porcentaje diferentes

Se utiliza un valor de producto y un porcentaje de descuento diferentes para comprobar que el cálculo funciona correctamente con otros valores.

**Datos de prueba:**
- Precio del producto: 250.00
- Porcentaje de descuento: 15%
- Resultado esperado: 37.50

**Resultado:**
El sistema calcula correctamente el descuento realizando la operación:

250 × 15 / 100 = 37.50

---

### Escenario 9 - Precio con decimales

El valor del producto contiene decimales y se utiliza un porcentaje de descuento válido.

**Datos de prueba:**
- Precio del producto: 99.99
- Porcentaje de descuento: 10%
- Resultado esperado: 9.999

**Resultado:**
El sistema calcula correctamente el descuento aun cuando el precio del producto contiene valores decimales.

---

## Aplicación de TDD

Para el desarrollo de la funcionalidad se utiliza el ciclo de TDD
De esta manera, las pruebas unitarias permiten definir y validar el comportamiento esperado de la calculadora de descuentos.
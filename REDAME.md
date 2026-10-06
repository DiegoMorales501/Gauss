# Resolviendo ecuaciones con Gauss 🧮
Este programa resuelve sistemas de ecuaciones (como los de álgebra, con x1, x2, x3...) usando el **método de Gauss**.
Le das las ecuaciones y te dice cuánto vale cada incógnita.

## Lenguaje de programación utilizado
**Java**

## ¿Qué archivos tiene?
```
Ecuaciones_Lineales/
├── Gauss.java           # Hace todo el cálculo
├── Defmatrizz.java      # Aquí pones las ecuaciones
└── Lanzador_gauss.java  # Es el que se ejecuta
```

- **Gauss**: va "limpiando" la matriz hasta que queda fácil de resolver, y luego despeja las incógnitas de la última a la primera.
- **Defmatrizz**: guarda los números de tu sistema de ecuaciones.
- **Lanzador_gauss**: junta todo y muestra las respuestas en pantalla.

## ¿Cómo lo uso?
**1. Mira que tengas Java instalado:**

```bash
javac -version
java -version
```

**2. Descarga el proyecto:**

```bash
git clone <URL_DEL_REPOSITORIO>
cd <NOMBRE_DEL_REPOSITORIO>
```

**3. Compílalo** (estando en la carpeta donde está `Ecuaciones_Lineales`):

```bash
javac -d out Ecuaciones_Lineales/*.java
```

**4. Ejecútalo:**

```bash
java -cp out Ecuaciones_Lineales.Lanzador_gauss
```

> 💡 El `main` debe ser `public static void main(String[] args)`, si no, en algunas versiones de Java no corre.

## Ejemplo

Estas son las ecuaciones que trae el programa:

```
3x1   - 0.1x2 - 0.2x3 =   7.85
0.1x1 + 7x2   - 0.3x3 = -19.3
0.3x1 - 0.2x2 + 10x3  =  71.4
```

En el código se escriben así (solo los números, en forma de tabla):

```java
{ 3.0, -0.1, -0.2,   7.85 },
{ 0.1,  7.0, -0.3, -19.3  },
{ 0.3, -0.2, 10.0,  71.4  }
```

Al ejecutarlo, esto es lo que sale en consola:

```
Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

Las respuestas reales son `x1 = 3`, `x2 = -2.5` y `x3 = 7`. Ese `7.000000000000002` es normal: la computadora redondea un poquito los decimales.

## Ojo con esto

- La tabla de números debe tener una columna extra al final (los resultados de cada ecuación). Si tienes 3 ecuaciones, es de 3 filas por 4 columnas.
- Si algún número de la diagonal es `0`, el programa se rompe, porque no hace pivoteo.

## Autor

- Nombre: Diego Ortiz Morales
- Curso: Métodos Numéricos
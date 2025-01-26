# Hoja de Trabajo 1, Algoritmos y Estructuras de Datos

## **Descripción**
Este proyecto es una aplicación Java modular diseñada usando IntelliJ IDEA. Utiliza JUnit 4 para pruebas unitarias.

El próposito del proyecto es desarrollar un programa utilizando una interfaz compartida entre distintos grupos de desarrollo al igual que la práctica para realizar pruebas unitarias en proyectos.

---

## **Estructura del Proyecto**
El proyecto tiene la siguiente configuración básica:

- **Lenguaje**: Java
- **IDE**: IntelliJ IDEA
- **Dependencias principales**:
    - `JUnit 4` (v4.13.1): Utilizado para pruebas unitarias.
- El proyecto utiliza un sistema modular, con las dependencias configuradas a través de IntelliJ.

---

## **Cómo Ejecutar el Proyecto**

1. **Configuración Inicial**:
    - Asegúrate de que tengas configurado un JDK compatible en IntelliJ IDEA (se recomienda JDK 8 o superior).
    - Descarga o clona este repositorio en tu máquina local.

   ```bash
   git clone <URL_DEL_PROYECTO>
   ```

2. **Abrir en IntelliJ IDEA**:
    - Abre IntelliJ y selecciona la opción `Open`.
    - Navega hasta el directorio del proyecto y cárgalo.

3. **Ejecutar el Proyecto**:
    - Usa la configuración de ejecución de IntelliJ para compilar y ejecutar el código.
    - Si hay una clase `Main`, selecciona la misma como punto de entrada para la aplicación.

---

## **Cómo Ejecutar Pruebas**
Este proyecto tiene soporte para pruebas unitarias con JUnit 4.

1. Importa las pruebas en el directorio de fuentes.
2. Selecciona un archivo de prueba y ejecútalo mediante:
    - Haz clic derecho sobre la clase de prueba y selecciona `Run '<nombre_de_la_clase>'`.
    - También puedes usar el atajo de teclado asignado por IntelliJ.

---

## **Estructura del Código**

- **src/main**: Carpeta principal donde reside el código fuente de la aplicación.

---

## **Dependencias**
Este proyecto incluye las siguientes dependencias locales en el directorio `lib/`:
1. `junit-4.13.1.jar`: Biblioteca principal para escribir y ejecutar pruebas unitarias.
2. `hamcrest-core-1.3.jar`: Biblioteca utilizada para crear aserciones personalizadas y legibles.

---

## **Recomendaciones**
Se sugiere considerar el uso de Maven o Gradle como herramientas de gestión de dependencias para futuros proyectos. Esto permitirá una gestión más eficiente de las bibliotecas externas.

---

## **Contribución**
El Proyecto ha sido desarrollado por Adrian Corado, Estheban Heredia e Ignacio Aris.

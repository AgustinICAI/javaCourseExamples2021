## Funciones Lambdas en Java

- Se introducen a partir de Java 8, permite utilizarlas cuando sólo hay un método en el interface o clase abstracta
- Se caracterizan por la siguiente sintaxis:
    ```java
    parameter -> expression body
    ```
- Principales características:
    - Indicar el tipo de la variable es opcional: no es necesario declarar el tipo de un parámetro. El compilador puede deducir lo mismo del valor del parámetro.
    - Los paréntisis son opcionales alrededor de los parámetros: no es necesario declarar un solo parámetro entre paréntesis. Para múltiples parámetros, se requieren paréntesis.
    - Llaves opcionales: no es necesario usar llaves en el cuerpo de la expresión si el cuerpo contiene una sola declaración.
    - Palabra return opcional: el compilador devuelve automáticamente el valor si el cuerpo tiene una sola expresión para devolver el valor. 
    - Se requieren llaves para indicar que la expresión devuelve un valor.

## Collections e Iteradores
La forma tradicional de trabajar con colecciones utilizando bucles para procesarlas.

```java
        List<String> myList1 =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> myList2 = new ArrayList();
        for (String s : myList1)
            if (s.startsWith("c"))
                myList2.add(s.toUpperCase());
        Collections.sort(myList2);
        for(String s: myList2)
            System.out.println(s);
    
```

## Streams y Lambdas
Permite procesar datos de forma declarativa mediante pipelines, capaces de procesar de forma paralela sin utilizar programación basada en multithreading, empleando programación funcional y trabajar en modo lazy (planificación de tareas para optimizar la ejecución de código).

```java
List<String> myList =
    Arrays.asList("a1", "a2", "b1", "c2", "c1");

myList
    .stream()
    .filter(s -> s.startsWith("c"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
    
```

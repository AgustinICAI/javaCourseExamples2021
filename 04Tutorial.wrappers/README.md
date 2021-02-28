# Wrappers

Los Wrappers proporcionan una forma de utilizar tipos de datos primitivos (int, booleanos, etc.) como objetos.

La siguiente tabla muestra el tipo primitivo y la clase contenedora equivalente:

| Data Type | Default Value | Default size | Wrapper class |
| --- | --- | --- | --- |
| boolean | false | 1 bit | Boolean |
| char | '\u0000'| 2 byte | Character |
| byte | 0 | 1 byte | Byte |
| short | 0 | 2 byte | Short |
| int | 0 | 4 byte | Integer |
| long | 0L | 8 byte | Long |
| float | 0.0f | 4 byte | Float |
| double | 0.0d | 8 byte | Double |


Para crear nuestro propio objeto "wrapper", java permite crearlo directamente a través de la asignación, esto denomina "Autoboxing":


```Java
    Integer i0 = 5;
    Double d0 = 5.99d;
    Character c0 = 'A';
    System.out.println(i0);
    System.out.println(d0);
    System.out.println(c0);
```

    5
    5.99
    A


Por debajo Java está realizando la operación de crear un nuevo objeto.


```Java
    Integer i0 = Integer.valueOf(5);
    Double d0 = Double.valueOf(5.99d);
    Character c0 = Character.valueOf('A');
```

Las características más interesantes de los wrappers, son los métodos que implementa cada clase:
- https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Integer.html
- https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Double.html
- https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Character.html


Por ejemplo, los siguientes métodos se utilizan para obtener el valor asociado al objeto wrapper correspondiente: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue() .

El valor del wrapper se puede conseguir por los métodos anteriores, o equivalente al ejemplo anterior, por asignación directa (aunque java por debajo llame al método). Esto se denomina "Unboxing"


```Java
    int i1 = i0.intValue();
    double d1 = d0.doubleValue();
    char c1 = c0.charValue();
    i1 = i0;
    d1 = d0;
    c1 = c0;
```

Otro método útil es el método toString(), que se utiliza para convertir objetos wrappers en cadenas.

En el siguiente ejemplo, convertimos un entero en un String


```Java
    Integer i0 = 100;
    String s1 = i0.toString();
    System.out.println(s1);
```

    100


Aunque si nuestra misión era únicamente sacar el valor del entero por pantalla, podríamos haber hecho directamente


```Java
    Integer i0 = 100;
    System.out.println(i0);
```

    100


Otro método interesante, son los Integer.parseInt(String s), Double.parseDouble(String s) que nos permiten convertir desde un String a un Integer o Double. Veremos también, que si no es capaz de realizar la transformación, el objeto devuelve una excepción.


```Java
    Integer i2 = Integer.parseInt("123")
    System.out.println(i2);
```


```Java
    double d2 = Double.parseDouble("#123.123");
    System.out.println(d2);
```


    ---------------------------------------------------------------------------

    java.lang.NumberFormatException: For input string: "#123.123"

    	at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)

    	at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)

    	at java.base/java.lang.Double.parseDouble(Double.java:549)

    	at .(#42:1)


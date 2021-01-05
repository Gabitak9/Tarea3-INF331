# Tarea3-INF331

## Acerca de la Tarea
La tarea consiste en construir un aplicativo del "Blue Bank" que permita realizar 2 tipos de transacciones electrónicas:

- Retirar dinero desde cuenta
- Depositar dinero en cuenta

Se debe tener en consideración que un usuario maneja dos tipos de cuentas (En 'CLP' y en 'USD').

## Acerca del Repositorio

Este proyecto fue desarrollado en `Java 15.0.1` y para la realización de las pruebas se utilizó `jUnit 4`.

#### Estructura del Proyecto
En este proyecto se pueden encontrar dos carpetas principales:

1. `Original Program` el cual corresponde al aplicativo del programa como tal, el cuál fue incluido solo a modo de dejar registro de su realización.
2. `Blue Bank` el cual corresponde a la realización de la tarea como tal, la cual fue realizada en `Maven`.

## Correr el Programa

#### Original Program
Desde la consola compile el programa con el siguiente comando:
```
javac BlueBank.java
```

Luego ejecute el programa con el siguiente comando:
```
java BlueBank
```
#### Blue Bank
Se recomienda abrir este programa en su IDE de preferencia y ejecute las pruebas jUit como corresponda. Por ejemplo, en Eclipse al situarse sobre el archivo "AccountTest" puede presionar `ctrl+r` para ejecutar las pruebas.

###Suite de Casos de pruebas
En este apartado se incluye información respecto a los casos de pruebas realizados

#### testGetID()
Prueba que el programa retorne de forma correcta el ID ingresado.

#### testGetBalanceCL()
Prueba que el programa retorne de forma correcta el balance CLP de la cuenta.

#### testGetBalanceUSD()
Prueba que el programa retorne de forma correcta el balance USD de la cuenta.

#### testAddCLPFunds1()
Prueba que el programa ingrese de forma correcta fondos CLP cuando se pasa un valor por sobre el mínimo permitido

#### testAddCLPFunds2()
Prueba que el programa ingrese de forma correcta fondos CLP cuando se pasa un valor igual al mínimo permitido.

#### testAddCLPFunds3()
Prueba que el programa ingrese de forma correcta fondos CLP cuando se pasa un valor menor al mínimo permitido.

#### testAddUSDFunds1()
Prueba que el programa ingrese de forma correcta fondos USD cuando se pasa un valor por sobre el mínimo permitido

#### testAddUSDFunds2()
Prueba que el programa ingrese de forma correcta fondos USD cuando se pasa un valor igual al mínimo permitido.

#### testAddUSDFunds3()
Prueba que el programa ingrese de forma correcta fondos USD cuando se pasa un valor menor al mínimo permitido.

#### testWithdrawCLPFunds1()
Prueba que el programa retire de forma correcta fondos CLP cuando se pasa un valor por sobre el máximo permitido.

#### testWithdrawCLPFunds2()
Prueba que el programa retire de forma correcta fondos CLP cuando se pasa un valor igual al máximo permitido.

#### testWithdrawCLPFunds3()
Prueba que el programa retire de forma correcta fondos CLP cuando se pasa un valor menor al máximo permitido.

#### testWithdrawCLPFunds4()
Prueba que el programa retire de forma correcta fondos CLP cuando se pasa un valor menor al balance de la cuenta.

#### testWithdrawUSDFunds1()
Prueba que el programa retire de forma correcta fondos USD cuando se pasa un valor por sobre el máximo permitido.

#### testWithdrawUSDFunds2()
Prueba que el programa retire de forma correcta fondos USD cuando se pasa un valor igual al máximo permitido.

#### testWithdrawUSDFunds3()
Prueba que el programa retire de forma correcta fondos USD cuando se pasa un valor menor al máximo permitido.

#### testWithdrawUSDFunds4()
Prueba que el programa retire de forma correcta fondos USD cuando se pasa un valor menor al balance de la cuenta.


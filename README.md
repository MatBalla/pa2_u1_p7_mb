Nombre: Mateo Balladares
Materia: Programación Avanzada 2
Fecha: 26/10/2026

Taller práctico: Simulador de descuentos con Quarkus
PROGRAMACIÓN AVANZADA II  |  UNIDAD 1
Modalidad: individual   •   Duración estimada: 2–3 horas

1. Objetivo
Desarrollar una aplicación Java con Quarkus para aplicar IoC, DI, CDI, Qualifiers, Scopes y ciclo de vida de componentes mediante el contenedor ArC. La ejecución será exclusivamente por consola.

2. Descripción del problema
Una tienda requiere calcular descuentos sobre sus ventas según el tipo de cliente: REGULAR (5 %) y VIP (15 %). El sistema calculará el descuento, determinará el valor final y registrará información de auditoría en consola.

3. Estructura mínima del proyecto
Componente	Responsabilidad
Main	Iniciar Quarkus y ejecutar ventas
CalculadoraDescuento	Interfaz para calcular descuentos
DescuentoRegular	Implementación del descuento regular
DescuentoVIP	Implementación del descuento VIP
VentaService	Coordinar el cálculo de las ventas
Auditoria	Registrar la ejecución de operaciones

4. Requerimientos técnicos
RT01. Inversión de Control (IoC). La creación y administración de los componentes de negocio deberá estar delegada al contenedor CDI de Quarkus (ArC). No utilizar new para instanciar manualmente componentes administrados por CDI.
RT02. Inyección de Dependencias (DI). VentaService deberá recibir dependencias mediante inyección por constructor y por atributo, demostrando ambas técnicas.
RT03. Interfaces e implementaciones. Definir CalculadoraDescuento con el método double calcular(double monto); DescuentoRegular y DescuentoVIP deberán implementar la interfaz con los porcentajes establecidos.
RT04. Qualifiers. Utilizar Qualifiers CDI mediante @Named para diferenciar las implementaciones de CalculadoraDescuento y seleccionar la correspondiente para ventas REGULAR y VIP.
RT05. Scopes. Utilizar @ApplicationScoped en VentaService, DescuentoRegular y DescuentoVIP; y @Dependent en Auditoria. Generar identificadores UUID para observar creación y reutilización de instancias.
RT06. Ciclo de vida. En Auditoria, utilizar @Dependent.
RT07. Ejecución por consola. Iniciar Quarkus mediante QuarkusApplication y ejecutar cuatro ventas predefinidas desde Main. No implementar menú interactivo.

5. Resultados esperados
Venta	Tipo	Monto	Descuento	Total
1	REGULAR	$100.00	5 %	$95.00
2	VIP	$200.00	15 %	$170.00
3	REGULAR	$300.00	5 %	$285.00
4	VIP	$500.00	15 %	$425.00

6. Preguntas de análisis
1.	¿En qué parte del ejercicio se aplica IoC y en cuál DI?
Se utiliza en la parte de la creación y administración de los componentes de negocio ya que deberá estar delegada al contenedor CDI de Quarkus (ArC), y en VentaService ya que esta deberá recibir dependencias mediante inyección por constructor y por atributo

2.	¿Qué función cumplen los Qualifiers y por qué son necesarios?
Sirven para inyectar implementaciones específicas, dado que se implementa con la notación @Named, esto permite que cada objeto tenga un identificador

3.	¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?
La diferencia entre el @ApplicationScoped y el @Dependent, es que el @ApplicationScoped garantiza una única instancia y el @Dependent crea una instancia y la comparte con todos los compoenntes durante la ineycción, es decir, cada vez que se inyecta, crea un nuevo objeto

4.	¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?
Las instancias @ApplicationScoped pueden reutilizarse entre varias ventas, debido a que se utiliza para lógica de negocio, por lo que quiere decir que todas esas clases que utilizan el @ApplicationScooped son lógica de negocio del programa, y tambien porque crea una única instancia, la cual comparte con todos los componentes que necesite

5.	¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?
Si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento, no se creará la instancia y no se compartira esta instancia con los compomentes durante la inyección, por lo tanto no se garantiza una instancia nueva

7. Entregables
Entregar el código fuente del proyecto Quarkus en una rama de Git, junto con un archivo README.md que incluya las respuestas a las preguntas de análisis.
